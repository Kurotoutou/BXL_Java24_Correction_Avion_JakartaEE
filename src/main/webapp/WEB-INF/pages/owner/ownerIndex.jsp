<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
  <h1>Owner index</h1>
  <ul>
    <c:forEach var="owners" items="${owners}">
      <li>${owners.firstName}</li>
      <li>${owners.lastName}</li>
    </c:forEach>
  </ul>
</body>
</html>
