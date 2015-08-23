<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<jsp:useBean id="addBean" class="com.hand.bean.Add" scope="request"/>

<html>
<head><jsp:include page="index.jsp"></jsp:include></head>
  <title>新增结果</title>
    <div align="center">  
      <p><jsp:getProperty name="addBean" property="backNews" />       
      <table>  
      	<tr><td align="left">add title：
      			<jsp:getProperty property="title" name="addBean"/>
      		</td>  
      	</tr>
      	<tr><td align="left">add description： 
      	    	<jsp:getProperty property="description" name="addBean"/>
      	    </td>  
      	</tr>
      	<tr><td align="left">add language：  
      			<jsp:getProperty property="language" name="addBean"/>
      		</td>
      	</tr>  
        
      </table>  
     </div>  
</html>