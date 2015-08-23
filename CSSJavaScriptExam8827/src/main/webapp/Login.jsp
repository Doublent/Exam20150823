<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<jsp:useBean id="loginBean" class="com.hand.bean.Login" scope="session"></jsp:useBean> 
<html>
<head>
  <title>用户登录</title>
  <link href="bootstrap.min.css" type="text/css" rel="stylesheet">
  <link href="app.css" type="text/css" rel="stylesheet">
 <style>
      #bid{
        background-image: url("login1.jpg");
  		background-size: 1500px 750px;
      }
      #fid{
      	width: 500px;
      	height: 200px;
      	background-color: white;
      	margin-top: auto;
      	position: center;
      }
      #h2id{
      	margin-top: 20px;
      	margin-left: 20px;
      	color: black;
      	
      }
      #pid{
      	margin-left: 10px; 
      	background-color: snow;
      }
      #lid{
      	background-color: snow;
      	float: left;
      }
      .inid{
      	background-color: snow;
      }
      
 </style>
  
</head>
<body id="bid">
  <h2 id="h2id">19248827</h2>
  <div id="did" align="center">
    	
  		<form id="fid" class="form_horizontal" role="form" action="loginServlet" method="post">
  			
  			<div class="form-group">
  				<label id="lid" ><p id="pid">电影租赁管理系统</p></label><br>
  				
  			</div>
  			
  			<div class="form-group">
  				<label>用户名</label>
  					<input class="inid" type="text" name="logname">
  			</div>
  			<div class="form-group">
  				<label>密码</label>
  					<input class="inid" type="password" name="password">
  			</div>
  			<div class="form-group">
  				<label ></label>
  				<div class="col-sm-10">
  					<input type="submit" name="g" value="提交">
  				</div>  				
  			</div>
  				
  			
  			
  		</form>
  	</div>
  
  <script src="jquery-2.1.1min.js"></script>
  <script src="bootstrap.min.js"></script>  
 </body>
</html>
