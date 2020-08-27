<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Dodaj fakturę</title>
</head>
<body>
<form:form method="post" modelAttribute="invoice">
    <label>Numer faktury</label>
    <form:input path="invoiceNumber"/>
    <form:errors path="invoiceNumber"/><br>
    <label>Kontrahent</label>
    <form:select path="client.id" items="${clients}" itemLabel="name" itemValue="id"/>
    <label>Termin płatności</label>
    <form:input placeholder= "dd.mm.yyyy" path="paymentDate"/>
<%--    <fmt:formatDate value="paymentDate" pattern="dd-MM-yyyy" />--%>
    <form:errors path="paymentDate"/> <br>
    <label>Kwota</label>
    <form:input path="amount"/>
    <form:errors path="amount"/> <br>
    <label>Status płatności</label>
    <form:select path="status.id" items="${status}" itemLabel="description" itemValue="id"/>
    <button type="submit" onclick="return confirm('Chcesz zapisać zmiany?');">Zapisz</button>
</form:form>
</body>
</html>
