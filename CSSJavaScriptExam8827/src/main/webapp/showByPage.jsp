<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ page import="com.hand.bean.ShowByPage" %>
<jsp:useBean id="pageBean" class="com.hand.bean.ShowByPage" scope="session"/>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  <title>分页浏览用户</title>
  <link href="bootstrap.min.css" type="text/css" rel="stylesheet">
	<style>
		#nid{
			background-color: skyblue;
		}
		#aid{
			margin-top: 10px;
			margin-right: 10px;
			font-size: 20px;
		}
		#id2{
			margin-left: -30px;
		}
		#id10{
			/* background-color: darkgray; */
			
		}
		#bid{
			background-color: skyblue;
			color: white;
			border-radius: 5px;
			font-size: 20px;
		}
		#mid{
			float: left;
			background-color: darkgray;
		}
		#tabid{
			float: right;
		}
	
	</style>  	
</head>
<body >
	<nav class="navbar navbar-default" role="navigation" id="nid">
		<div class="container-fluid">
			<div class="navbar-header">
				<h4>19248827</h4>				
			</div>
			<div>
				<a id="aid" class="nav navbar-nav navbar-right" id="aid" href="#" >Admin</a>
			</div>
		</div>	
	</nav>
	
	<div class="container">
		<div class="col-md-2" id="id2">
			<ul class="list-group affixed-element-top js-affixed-element-top">
				<li class="list-group-item"><a href="index.jsp">Customer管理</a></li>
				<li class="list-group-item"><a href="#">Film设置</a></li>
			</ul>			
		</div>
		<div class="col-md-10 js-content" id="id10">
			<div>
				<div class="col-md-3">
					<p>客户列表</p>
				</div>
				<div class="col-md-9">
					<a id="bid" type="button" href="Add.jsp">新建</a>	
				</div>
			</div>
			<div>
			<!-- 	<div align="center"> -->
				<div id="mid">
					<table border=2>
						<tr>
							<th>film_id</th>
							<th>title</th>
							<th>description</th>
							<th>language</th>

						</tr>
						<jsp:getProperty name="pageBean" property="presentPageResult" />
					</table>
					
					<Table id="tabid">
						<tr>
							<td><FORM action="memberServler" method=post>
									<Input type=hidden name="showPage"
										value="<%=pageBean.getShowPage() - 1%>"> <Input
										type=submit name="g" value="<">
								</FORM></td>
							<td><FORM action="memberServler" method=post>
								<button>
									<Input type=hidden name="showPage"
										value="<%=pageBean.getShowPage()%>">
									<jsp:getProperty name="pageBean" property="showPage"/>
								</button>
								</FORM></td>	
							<td><FORM action="memberServler" method=post>
								<% 
								int num = pageBean.getShowPage() + 1;
						
								%>
								<button>
									<%=num%>
									<Input type=hidden name="showPage"
										value="<%=pageBean.getShowPage() + 1%>"> 
								</button>
								</FORM></td>
							<td><FORM action="memberServler" method=post>
									<Input type=hidden name="showPage"
										value="<%=pageBean.getShowPage() + 1%>"> <Input
										type=submit name="g" value=">">
								</Form></td>
							<td>
								<%-- <FORM action="memberServler" method=post>
									<%
										int num = 0;
										if ((pageBean.getShowPage() + 1) > pageBean.getPageAllCount()) {
											num = 1;
										} else
											num = pageBean.getShowPage() + 1;
									%>

									输入页码：<Input type=text name="showPage" size=5 value=<%=num%>>
									<Input type=submit name="g" value="提交">
								</FORM> --%>
							</td>
						</tr>
					</Table>
				</div>
			</div>
		</div>
	</div>



  	
	<script src="jquery-2.1.1min.js"></script>
  <script src="bootstrap.min.js"></script>  
</BODY>
</html>