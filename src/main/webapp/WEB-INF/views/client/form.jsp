<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dodaj kontrahenta</title>
</head>
<body>
<form:form method="post" modelAttribute="client">
    <label>Nazwa</label>
    <form:input path="name"/>
    <form:errors path="name"/> <br>
    <label>Użytkownik</label>
    <form:select path="user.id" items="${users}" itemLabel="name" itemValue="id"/><br>
    <label>NIP</label>
    <form:input path="nip"/><br>
<%--    <form:errors path="nip"/><br>--%>
    <label>REGON</label>
    <form:input path="regon"/><br>
<%--    <form:errors path="regon"/><br>--%>
    <label>Adres</label>
    <form:textarea path="adress" rows="3" cols="20" />
    <form:errors path="adress"/> <br>
    <label>E-MAIL</label>
    <form:input path="email"/>
    <form:errors path="email"/><br>
    <button type="submit" onclick="return confirm('Chcesz zapisać zmiany?');">Zapisz</button>
</form:form>
</body>
</html>
