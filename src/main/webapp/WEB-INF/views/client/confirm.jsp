<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Usuwanie kontrahenta</title>
</head>
<body>
<h4>Czy na pewno chcesz usunąć kontrahenta?</h4>
<a href='<c:url value="/clients/remove/${client.getId()}"/>'>TAK, USUŃ</a>
<a href='<c:url value="/clients"/>'>NIE, COFNIJ</a>
</body>
</html>
