<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html;charset=utf-8" />
<script>
	/* if("${loginAdmin == null}"){
		window.parent.location.href="${pageContext.request.contextPath}/back/login.jsp";
	} */
</script>


</head>
<frameset rows="150,*" noresize="true" border="2px" bordercolor="#9A9D9F">
	<frame src="${pageContext.request.contextPath }/back/main/head.jsp">
	<frameset cols="15%,*">
		<frame src="${pageContext.request.contextPath }/back/main/menu.jsp" />
		<frame name="Homepage" src="${pageContext.request.contextPath }/back/main/home.jsp">
	</frameset>
</frameset>
</html>