<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>

  <title>选择浏览方式</title>
  <div align="center">
  	<!-- <table> -->
    	<%-- <form action="<%= request.getContextPath() %>/memberServler" method="post"> --%>
    	<form action="memberServler" method="post">
     	<BR>显示全部记录
      	 <INPUT type="hidden" value="1" name="showPage" size=6>  
     	<INPUT type="submit" value="显示" name="submit">
    	</form>
   	<!-- </table> -->
  </div>
</html>