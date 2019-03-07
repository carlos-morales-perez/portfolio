<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Math - Tabla mult</title>
</head>
<body>
    <h1>Tablas de multiplicar</h1>
    <h3>Indique el número del que desea realizar la tabla y la cantidad de filas que desea que tenga la tabla</h3>
    <form action="TablaMult" method="GET">
        <label for="num">Número a calcular la tabla</label>
        <input type="number" name="num" required>
        <br>
        <label for="row">Filas de la tabla de multiplicar</label>
        <input type="number" name="row" required>
        <br>
        <input type="submit">
    </form>
    <br>
    <a href="Index">Regresar al incio</a>
    <% String seId=session.getId(); %>
    <p> <%= seId %> </p>
</body>
</html>