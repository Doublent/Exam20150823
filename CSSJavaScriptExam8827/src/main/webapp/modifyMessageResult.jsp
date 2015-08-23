<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import="com.hand.bean.Message"%> 
<jsp:useBean id="messageBean" type="com.hand.bean.Message" scope="request"/>

<html>
	<head><jsp:include page="index.jsp"></jsp:include></head>
	<title>修改记录结果</title>
	<body>
		<div align="center">
			<br><jsp:getProperty name="messageBean" property="backNews"/>,
 			您修改记录如下：<br><br>
 			<table border=1> 
 				<tr>
		    		<td>new title</td>
		    		<td>new description</td>
		    		<td>new language</td>
				</tr>
				<tr> 
		     		<td><jsp:getProperty name="messageBean" property="newTitle"/></td>
		     		<td><jsp:getProperty name="messageBean" property="newDescription"/></td>
		     		<td><jsp:getProperty name="messageBean" property="newlanguage"/></td>
		     		
				</tr>
			</table>
		</div>
	</body>
</html>