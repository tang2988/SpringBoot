<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'insert.jsp' starting page</title>
    
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
    	<tr><td>用户名<input type="text" name="userName "/></td>
    	<td>密码<input type="text" name="password" /></td>
    	<td>手机号码<input type="text" name="userPhone "/></td>
    	<input type="button" onclick="insert()" value="添加"/>
    	</tr>
    </form>
  </body>
   <script src="http://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js"></script>
  <script type="text/javascript">
  function insert() {
		$.ajax({
                type: "POST",
                async : true,
                url: "/insert.do",
                data: $('#form1').serialize(),
                success: function (result) {
                   		if(result.status==200)
                    	alert("添加成功");
                        window.location.href="<%=basePath%>"
                   
                    ;
                },
               
            });
		
		
		
		
	}
  </script>
</html>
