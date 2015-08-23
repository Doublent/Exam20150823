<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<jsp:useBean id="loginBean" class="com.hand.bean.Login" scope="session"></jsp:useBean> 

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
 <head><jsp:include page="index.jsp"></jsp:include></head> 
  <title>登录成功</title>
<body>	
	<div align="center">
   <br>登录信息反馈：<br><br>
   		<font size=5>
   			<jsp:getProperty property="backNews" name="loginBean"/>
   		</font>
   </div> 
</body>
</html>