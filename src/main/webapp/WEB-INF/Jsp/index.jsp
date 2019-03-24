<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%-- <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
   <table style="padding-left:  20px">
   		<tr>
   			<td style="padding-left: 50px">用户名&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td>
   			<td style="padding-left: 50px">密码&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td>
   			<td style="padding-left: 50px">用户手机号码&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td>
   			<td style="padding-left: 50px">注册时间&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td>
   			<td style="padding-left: 50px">用户状态&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td>
   			<td style="padding-left: 50px">版本号&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td>
   			<td style="padding-left: 50px">备注&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td>
   			<td style="padding-left: 50px">创建时间&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td>
   		</tr>
   		<c:forEach var="u" items="${user}">
   		<tr>
   			<input type="hidden" name="userId" value="${u.userId}"/>
   			<td style="padding-left: 50px">${u.userName}</td>
   			<td style="padding-left: 50px">${u.password}</td>
   			<td style="padding-left: 50px">${u.userPhone}</td>
   			<td style="padding-left: 50px"><fmt:formatDate value="${u.registerTime}" pattern="yyyy年MM月dd日"/></td>
   			<td style="padding-left: 50px">${u.userStatus}</td>
   			<td style="padding-left: 50px">${u.versionNO}</td>
   			<td style="padding-left: 50px">${u.remarks}</td>
   			<td style="padding-left: 50px"><fmt:formatDate value="${u.createTime}" pattern="yyyy年MM月dd日"/><%-- <fmt:formatDate value="${u.createTime}" type="date" dateStyle="full"/> --%></td>
			<td><a href="<%=basePath%>update.html?userId=${u.userId}">修改</a></td>
			<td><a href="<%=basePath%>insert.html">添加</a></td>	
			<td><a href="<%=basePath%>delete.do?userId=${u.userId}">刪除</a></td>											
   		</tr>
   </c:forEach>
   </table>
  </body>

</html>
