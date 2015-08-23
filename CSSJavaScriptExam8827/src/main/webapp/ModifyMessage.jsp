<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<jsp:useBean id="messageBean" class="com.hand.bean.Message" scope="session"></jsp:useBean>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head><jsp:include page="index.jsp"></jsp:include></head>
  <title>修改信息</title>
  <div align="center">
  <br>
  <form action="messageServlet" method=post>
  	<table>     
    	<tr><td><font size="4">new title：</font><Input type=text name="newTitle"></td></tr>
    	<tr><td><font size="4">new description：</font><Input type=text name="newDescription"></td></tr>
    	<tr><td><font size="4">new description：</font><Input type=text name="newLanguage"></td></tr>    
    	
    	<tr><td><Input type=submit name="g" value="提交修改"></td></tr>
    	<tr><td><Input type=reset value="重置"></td></tr>
  	</table>    
  </form>
  </div>
</html>
