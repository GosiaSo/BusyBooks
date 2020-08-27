<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Usuwanie faktury</title>
</head>
<body>
<h4>Czy na pewno chcesz usunąć fakturę?</h4>
<a href='<c:url value="/invoices/remove/${invoice.getId()}"/>'>TAK, USUŃ</a>
<a href='<c:url value="/invoices"/>'>NIE, COFNIJ</a>
</body>
</html>
