package com.hand.servlet;

import com.hand.bean.*;
import com.sun.rowset.*;

import java.sql.*;
import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

public class HandleMember extends HttpServlet{
   /**
	 * 
	 */
	private static final long serialVersionUID = 2991525541103328626L;
@SuppressWarnings("restriction")
CachedRowSetImpl rowSet = null;
   public void init(ServletConfig config) throws ServletException{
      super.init(config);
      try{  
    	  Class.forName("com.mysql.jdbc.Driver");
      }
      catch(Exception e){} 
   }
   public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
      HttpSession session = request.getSession(true); 
      Login login = (Login)session.getAttribute("loginBean"); 
      boolean ok = true; 
      if(login == null){
         ok = false; 
         response.sendRedirect("Login.jsp");    
      }
      if(ok == true){
         continueDoPost(request,response);
      }
   }
   
   @SuppressWarnings("restriction")
public void continueDoPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException { 
      HttpSession session = request.getSession(true); 
      Connection con = null; 
      StringBuffer presentPageResult = new StringBuffer();
      ShowByPage pageBean = null;
      
      try{ 
    	  pageBean = (ShowByPage)session.getAttribute("pageBean");
           if(pageBean == null){
        	   pageBean = new ShowByPage();
               session.setAttribute("pageBean",pageBean);
           }
      }
      catch(Exception exp){
    	   pageBean = new ShowByPage();  
           session.setAttribute("pageBean",pageBean);
      } 
      pageBean.setPageSize(10);
      int showPage = Integer.parseInt(request.getParameter("showPage"));
      if(showPage > pageBean.getPageAllCount())
    	  showPage = 1;
      if(showPage <= 0)
    	  showPage = pageBean.getPageAllCount();
      pageBean.setShowPage(showPage);  
      int pageSize = pageBean.getPageSize();
      String uri = "jdbc:mysql://127.0.0.1/sakila?" + "user=root&password=&characterEncoding=utf-8";
      try{ 
           con = DriverManager.getConnection(uri);
           Statement sql = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
           ResultSet rs = sql.executeQuery("select film_id,title,description,language.name from film left join language on film.language_id = language.language_id");
           rowSet = new CachedRowSetImpl();
           rowSet.populate(rs);
           con.close();
           pageBean.setRowSet(rowSet);
           rowSet.last();
           int m = rowSet.getRow();
           int n = pageSize;
           int pageAllCount = ((m%n) == 0)?(m / n):(m / n+1);
           pageBean.setPageAllCount(pageAllCount);
           presentPageResult = show(showPage,pageSize,rowSet);
           pageBean.setPresentPageResult(presentPageResult); 
      }
      catch(SQLException exp){}
      RequestDispatcher dispatcher = request.getRequestDispatcher("showByPage.jsp");
      dispatcher.forward(request, response); 
   } 
   
   
   
   
   
   @SuppressWarnings("restriction")
public StringBuffer show(int page,int pageSize,CachedRowSetImpl rowSet){
      StringBuffer str = new StringBuffer();
      try{ 
           rowSet.absolute((page-1)*pageSize+1);
           for(int i=1;i<=pageSize;i++){
              str.append("<tr>");
              str.append("<td>"+rowSet.getString(1)+"</td>"); 
              str.append("<td>"+rowSet.getString(2)+"</td>");
              str.append("<td>"+rowSet.getString(3)+"</td>");
              str.append("<td>"+rowSet.getString(4)+"</td>");

              str.append("</tr>");
              rowSet.next();  
           }
      }
      catch(SQLException exp){}
      return str;
   }
   

}
