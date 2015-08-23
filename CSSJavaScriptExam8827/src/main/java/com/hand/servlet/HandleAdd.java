package com.hand.servlet;

import com.hand.bean.*;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class HandleAdd extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = -4127950419333326721L;

	public void init(ServletConfig config) throws ServletException{
		super.init(config);
		try{
			Class.forName("com.mysql.jdbc.Driver");
		}
		catch(Exception e){	}
	}
	
	public String handleString(String s)
	{
		try{
			byte bb[]=s.getBytes("utf-8");
			s = new String(bb);
		}
		catch(Exception ee){}
		return s;
	}
	
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		String uri = "jdbc:mysql://127.0.0.1/sakila?" + "user=root&password=&characterEncoding=UTF-8";
		Connection con=null;
		
		@SuppressWarnings("unused")
		PreparedStatement sql;
		
		Add addBean = new Add();
		request.setAttribute("addBean", addBean);
		String title = request.getParameter("title").trim();
		String description = request.getParameter("description").trim();
		String language = request.getParameter("language").trim();
		
		
		boolean boo =title.length()>0;
		String backNews = "";
		try{
			con = DriverManager.getConnection(uri);
			String insertCondition = "INSERT INTO film (title,description,language_id) VALUES ('"+title+"','"+description+"','"+language+"')";
			sql=con.prepareStatement(insertCondition);
			
			if(boo)
			{
								
				int m = sql.executeUpdate();
				
				if(m!=0){
					backNews = "新增成功";
					addBean.setBackNews(backNews);
					addBean.setTitle(title);
					addBean.setDescription(description);
					addBean.setLanguage(language);
				}
			}
			else{
				backNews = "新增失败";
				addBean.setBackNews(backNews);
				RequestDispatcher dispatcher = request.getRequestDispatcher("Add.jsp");
				dispatcher.forward(request, response);
				return;
				
			}
			con.close();
		}
		catch(SQLException exp){
			backNews =backNews + exp;
			addBean.setBackNews(backNews);
			RequestDispatcher dispatcher = request.getRequestDispatcher("Add.jsp");
			dispatcher.forward(request, response);
			return;
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("addResult.jsp");
		dispatcher.forward(request, response);
	}
	
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		doPost(request, response);
	}	
	
}
