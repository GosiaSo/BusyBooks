<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dodaj użytkownika</title>
</head>
<body>
<form:form method="post" modelAttribute="user">
    <label>Imię</label>
    <form:input path="name"/>
    <form:errors path="name"/> <br>
    <label>Nazwisko</label>
    <form:input path="surname"/>
    <form:errors path="surname"/><br>
    <label>Login</label>
    <form:input path="username"/>
    <form:errors path="username"/><br>
    <label>Hasło</label>
    <form:password path="password"/>
    <form:errors path="password"/><br>
    <button type="submit" onclick="return confirm('Chcesz zapisać zmiany?');">Zapisz</button>
</form:form>
</body>
</html>
