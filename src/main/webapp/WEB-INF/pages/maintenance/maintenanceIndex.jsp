<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
  <h1>Maintenance index</h1>
  <ul>
    <c:forEach var="maintenance" items="${maintenances}">
      <li>Id : ${maintenance.id}</li>
    </c:forEach>
  </ul>
</body>
</html>
