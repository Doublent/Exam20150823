package com.hand.servlet;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HandleMessage extends HttpServlet{
   /**
	 * 
	 */
	private static final long serialVersionUID = -4681123918573979099L;

public void init(ServletConfig config) throws ServletException{
      super.init(config);
      try{ 
    	  Class.forName("com.mysql.jdbc.Driver");
      }
      catch(Exception e){} 
   }
   public String handleString(String s){
      try{  byte bb[] = s.getBytes("utf-8");
            s = new String(bb);
      }
      catch(Exception ee){} 
      return s;  
   }
   
   public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
      
   }
   
   public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
      doPost(request,response);
   }
}