<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Użytkownicy</title>
</head>
<body>
<a href="<c:url value="/"/>">WRÓĆ</a>
<br>
<a href="<c:url value="/admin/users/add"/>">Dodaj nowego użytkownika</a>
<p><c:out value="${message}"/></p>
<table>
    <thead>
    <tr>
        <th>Imię</th>
        <th>Nazwisko</th>
        <th>Login</th>
    </tr>
    <c:forEach items="${users}" var="user">
        <tr>
            <td><c:out value="${user.name}"/></td>
            <td><c:out value="${user.surname}"/></td>
            <td><c:out value="${user.login}"/></td>
            <td> <a href='<c:url value="/users/edit/${user.getId()}"/>'>Edytuj użytkownika </a> </td>
            <td> <a href='<c:url value="/users/confirm/${user.getId()}"/>'>Usuń użytkownika</a> </td>
        </tr>
    </c:forEach>
    </thead>
</table>
</body>
</html>
