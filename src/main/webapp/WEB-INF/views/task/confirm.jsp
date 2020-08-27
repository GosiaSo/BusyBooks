<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Usuwanie zadania</title>
</head>
<body>
<h4>Czy na pewno chcesz usunąć zadanie?</h4>
<a href='<c:url value="/tasks/remove/${task.getId()}"/>'>TAK, USUŃ</a>
<a href='<c:url value="/tasks"/>'>NIE, COFNIJ</a>
</body>
</html>
