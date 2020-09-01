<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Zadania</title>
</head>
<body>
<a href="<c:url value="/"/>">WRÓĆ</a>
<br>
<a href="<c:url value="/tasks/add"/>">Dodaj nowe zadanie</a>
<p><c:out value="${message}"/></p>
<table>
    <thead>
    <tr>
        <th>Kontrahent</th>
        <th>Zadanie</th>
        <th>Status zadania</th>
    </tr>
    <c:forEach items="${tasks}" var="task">
        <tr>
            <td><c:out value="${task.client.name}"/></td>
            <td><c:out value="${task.task.description}"/></td>
            <td><c:out value="${task.status.description}"/></td>
            <td> <a href='<c:url value="/tasks/edit/${task.getId()}"/>'>Edytuj zadanie </a> </td>
            <td> <a href='<c:url value="/tasks/confirm/${task.getId()}"/>'>Usuń zadanie</a> </td>
        </tr>
    </c:forEach>
    </thead>
</table>
</body>
</html>
