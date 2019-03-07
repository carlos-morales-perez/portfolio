<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Math - Circunferencias</title>
</head>
<body>
    <h1>Circunferencias</h1>
    <h3>Indique el radio de la circunferencia a calcular</h3>
    <form action="longarea.jsp" method="GET">
        <label for="num">Número</label>
        <input type="number" name="num" required>
        <br>
        <input type="submit">
    </form>
    <br>
    <a href="Index">Regresar al incio</a>
    <% String seId=session.getId(); %>
    <p> <%= seId %> </p>
</body>
</html>