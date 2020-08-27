<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Kontrahenci</title>
</head>
<body>
<a href="<c:url value="/clients/add"/>">Dodaj nowego kontrahenta</a>
<p><c:out value="${message}"/></p>
<table>
    <thead>
    <tr>
        <th>Nazwa firmy</th>
        <th>Użytkownik</th>
        <th>NIP</th>
        <th>REGON</th>
        <th>Adres</th>
        <th>E-mail</th>
    </tr>
    <c:forEach items="${clients}" var="client">
        <tr>
            <td><c:out value="${client.name}"/></td>
            <td><c:out value="${client.user.name}"/></td>
            <td><c:out value="${client.nip}"/></td>
            <td><c:out value="${client.regon}"/></td>
            <td><c:out value="${client.adress}"/></td>
            <td><c:out value="${client.email}"/></td>
            <td> <a href='<c:url value="/clients/edit/${client.getId()}"/>'>Edytuj kontrahenta </a> </td>
            <td> <a href='<c:url value="/clients/confirm/${client.getId()}"/>'>Usuń kontrahenta</a> </td>
        </tr>
    </c:forEach>
    </thead>
</table>
</body>
</html>
