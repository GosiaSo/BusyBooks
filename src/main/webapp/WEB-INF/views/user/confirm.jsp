<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: malgorzatasobocinska
  Date: 25/08/2020
  Time: 20:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Usuwanie użytkownika</title>
</head>
<body>
<h4>Czy na pewno chcesz usunąć użytkownika?</h4>
<a href='<c:url value="/admin/users/remove/${user.getId()}"/>'>TAK, USUŃ</a>
<a href='<c:url value="/admin/users"/>'>NIE, COFNIJ</a>
</body>
</html>
