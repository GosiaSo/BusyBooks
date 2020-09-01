<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Faktury</title>
</head>
<body>
<a href="<c:url value="/"/>">WRÓĆ</a>
<br>
<a href="<c:url value="/invoices/add"/>">Dodaj nową fakturę</a>
<p><c:out value="${message}"/></p>

<table>
    <thead>
    <tr>
        <th>Numer faktury</th>
        <th>Kontrahent</th>
        <th>Termin płatności</th>
        <th>Kwota</th>
        <th>Status płatności</th>
    </tr>
    <c:forEach items="${invoices}" var="invoice">
        <tr>
            <td><c:out value="${invoice.invoiceNumber}"/></td>
            <td><c:out value="${invoice.client.name}"/></td>
            <td><c:out value="${invoice.paymentDate}"/></td>
            <td><c:out value="${invoice.amount}"/></td>
            <td><c:out value="${invoice.status.description}"/></td>
            <td> <a href='<c:url value="/invoices/edit/${invoice.getId()}"/>'>Edytuj fakturę </a> </td>
            <td> <a href='<c:url value="/invoices/confirm/${invoice.getId()}"/>'>Usuń fakturę</a> </td>
        </tr>
    </c:forEach>
    </thead>
</table>

</body>
</html>
