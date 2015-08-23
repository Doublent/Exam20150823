package com.hand.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hand.bean.*;




public class HandleLogin extends HttpServlet{
	
	
	private static final long serialVersionUID = -4293421826369183991L;

	public void init(ServletConfig config) throws ServletException{
		super.init(config);
		try{
			Class.forName("com.mysql.jdbc.Driver");
		}
		catch(Exception e){}
	}
	
	public String handleString(String s){
		try{
			byte bb[] = s.getBytes("iso-8859-1");
			s = new String(bb);
		}
		catch(Exception ee){}
		return s;
	}
	
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		Connection con;
		Statement sql;
		String logname = request.getParameter("logname").trim();
		String password = request.getParameter("password").trim();
		logname = handleString(logname);
		password = handleString(password);
		String uri = "jdbc:mysql://127.0.0.1/sakila?"+"user=root&password=&characterEncoding=utf-8";
		boolean boo = (logname.length()>0)&&(password.length()>0);
		try{
			/*con = DriverManager.getConnection(uri);
			String condition = "select * from customer where first_name='"+logname+"'";
			sql = con.createStatement();
			if(boo){
				ResultSet re = sql.executeQuery(condition);
				boolean m = re.next();
				if(m == true){
					success(request,response,logname);
					RequestDispatcher dispatcher = request.getRequestDispatcher("loginSuccess.jsp");
					dispatcher.forward(request, response);
				}
				else{
					String backNews = "您输入的用户名不存在，请重新登陆";
					fail(request,response,logname,backNews);
					RequestDispatcher dispatcher = request.getRequestDispatcher("loginFail.jsp");
					dispatcher.forward(request, response);
				}
			}
			else{
				String backNews = "请输入用户名";
				fail(request,response,logname,backNews);
				RequestDispatcher dispatcher = request.getRequestDispatcher("loginFail.jsp");
				dispatcher.forward(request, response);
			}
			con.close();	*/
			
			con = DriverManager.getConnection(uri);
			String condition = "select * from customer where first_name='"+logname+"'and last_name='"+password+"'";
			sql = con.createStatement();
			if(boo){
				ResultSet re = sql.executeQuery(condition);
				boolean m = re.next();
				if(m == true){
					success(request,response,logname,password);
					RequestDispatcher dispatcher = request.getRequestDispatcher("loginSuccess.jsp");
					dispatcher.forward(request, response);
				}
				else{
					String backNews = "您输入的用户名不存在，或密码不匹配";
					fail(request,response,logname,backNews);
					RequestDispatcher dispatcher = request.getRequestDispatcher("loginFail.jsp");
					dispatcher.forward(request, response);
				}
			}
			else{
				String backNews = "请输入用户名和密码";
				fail(request,response,logname,backNews);
				RequestDispatcher dispatcher = request.getRequestDispatcher("loginFail.jsp");
				dispatcher.forward(request, response);
			}
			con.close();
			
		}
		catch(SQLException exp){
			String backNews = "" + exp;
			fail(request,response,logname,backNews);
			RequestDispatcher dispatcher = request.getRequestDispatcher("loginFail.jsp");
			dispatcher.forward(request, response);
		}		
	}
	
	public void doGet(HttpServletRequest request,HttpServletResponse response)
			throws ServletException,IOException{
		doGet(request,response);
	}
	
	public void success(HttpServletRequest request,HttpServletResponse response,String logname,String password){
		Login loginBean = null;
		HttpSession session = request.getSession(true);
		try{
			loginBean = (Login)session.getAttribute("loginBean");
			if(loginBean == null){
				loginBean = new Login();
				session.setAttribute("loginBean", loginBean);
				loginBean = (Login)session.getAttribute("loginBean");
			}
			String name = loginBean.getLogname();
			if(name.equals(logname)){
				loginBean.setBackNews(logname+"已经登录了");
				loginBean.setLogname(logname);
			}
			else{
				loginBean.setBackNews(logname+"登录成功");
				loginBean.setLogname(logname);
			}
		}
		catch(Exception ee){
			loginBean = new Login();
			session.setAttribute("loginBean", loginBean);
			loginBean.setBackNews(logname+"登录成功");
			loginBean.setLogname(logname);
		}
	}
	
	public void fail(HttpServletRequest request,HttpServletResponse response,String logname,String backNews){
		
		Login loginBean = null;
		HttpSession session = request.getSession(true);
		try{
			loginBean = (Login)session.getAttribute("loginBean");
			if(loginBean==null){
				loginBean = new Login();
				session.setAttribute("loginBean", loginBean);
				loginBean = (Login)session.getAttribute("loginBean");
			}
			loginBean.setBackNews(backNews);
			loginBean.setLogname(logname);
		}
		catch(Exception ee){
			loginBean = new Login();
			session.setAttribute("loginBean", loginBean);
			loginBean.setBackNews(backNews);
			loginBean.setLogname(logname);
		}
	}	
}
