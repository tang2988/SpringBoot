<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'update.jsp' starting page</title>
    
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
    <form id="form1" method="post">
    	<input type="hidden" value="${user.userId}"/>
    	<tr><td>用户名<input type="text" name="userName" value="${user.userName}"/></td>
    	<td>密码<input type="text" name="password" value="${user.password}"/></td>
    	<td>手机号码<input type="text" name="userPhone" value="${user.userPhone}"/></td>
    	<td>用户状态<input type="text" name="userStatus" value="${user.userStatus}"/></td>
    	<td><input type="button" onclick="update()" value="点击修改"/></td>
    	</tr>
    </form>
  </body>
  <script src="http://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js"></script>
  <script type="text/javascript">
	function update() {
		$.ajax({
           
                type: "POST",
                dataType: "json",
                url: "/update.do",
                data: $('#form1').serialize(),
                success: function (result) {
                    console.log(result);//打印服务端返回的数据(调试用)
                    if (result.status == 200) {
                    	alert("修改成功");
                        window.location.href="<%=basePath%>"
                    }
                    ;
                },
                error : function() {
                    alert("系統异常");
                }
            });
		
		
		
		
	}  
  
  </script>
</html>
