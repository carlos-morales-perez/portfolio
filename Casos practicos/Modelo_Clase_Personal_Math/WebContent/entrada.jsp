<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Math - Index</title>
</head>
<body>
    <h1>Bienvenido a la aplicación Math</h1>
    <h3>Seleccione una opción</h3>
    <a href="Index?solicitud=tabla">Tabla de multiplicar</a>
    <br>
    <a href="Index?solicitud=circunferencia">Calculos sobre circunferencias</a>
    <% String seId=session.getId(); %>
    <p> <%= seId %> </p>
</body>
</html>