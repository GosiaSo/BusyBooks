<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dodaj zadanie</title>
</head>
<body>
<form:form method="post" modelAttribute="task">
    <label>Kontrahent</label>
    <form:select path="client.id" items="${clients}" itemLabel="name" itemValue="id"/>

    <label>Zadanie</label>
    <form:select path="task.id" items="${tasks}" itemLabel="description" itemValue="id"/>

    <label>Status zadania</label>
    <form:select path="status.id" items="${status}" itemLabel="description" itemValue="id"/>
    <button type="submit" onclick="return confirm('Chcesz zapisać zmiany?');">Zapisz</button>
</form:form>
</body>
</html>
