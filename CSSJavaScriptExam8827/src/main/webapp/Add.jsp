<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<jsp:useBean id="addBean" class="com.hand.bean.Add" scope="request"/>
<html>
  <head><jsp:include page="index.jsp"></jsp:include></head>
  <title>新增页面</title>
  <div align="center">
  <br>
  <form action="addServlet" method="post" ><!-- name=form> -->
  <table> 
    <tr><td width="260"><font size="3">请输入要新增的记录：</font></td></tr>
    <tr><td><font size="4">add title：</font><Input type=text name="title"></td></tr>
    <tr><td><font size="4">add description：</font><Input type=text name="description"></td></tr>
    <tr><td><font size="4">add language：</font><Input type=text name="language"></td></tr>
    
    <tr><td><Input type=submit name="g" value="提交"></td></tr>
  </table>    
  </form>
  </div>
  <div align="center">  
       <font color=blue>
       <jsp:getProperty name="addBean" property="backNews" />
       </font>
  </div>

</html>
