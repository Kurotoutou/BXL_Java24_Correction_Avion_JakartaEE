<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<br/>
<a href="${pageContext.request.contextPath}/plane">Plane</a>
<a href="${pageContext.request.contextPath}/planeType">Plane Type</a>
<a href="${pageContext.request.contextPath}/pilot">Pilot</a>
<a href="${pageContext.request.contextPath}/owner">Owner</a>
<a href="${pageContext.request.contextPath}/maintenance">Maintenance</a>
<a href="${pageContext.request.contextPath}/mechanician">Mechanician</a>
<a href="${pageContext.request.contextPath}//pilotPlaneType">Pilot plane type</a>
</body>
</html>