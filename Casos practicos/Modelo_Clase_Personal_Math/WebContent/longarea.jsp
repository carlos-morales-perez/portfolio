<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Math - Circunferencias</title>
</head>
<body>
	<% String number = request.getParameter("num");
	double num=0;
	double perimetro=0;
	double area=0;
	
	if(number!=null){
	
		if(number.equals("")){
			
			RequestDispatcher rd = request.getRequestDispatcher("circunferencia.jsp");
			rd.forward(request, response);
			
		} else {
			num=Double.parseDouble(number);
			perimetro=(num*2)*Math.PI;
			area=(num*num)*Math.PI;
		}
				
	}else{
		
		response.sendRedirect("Index");
		
	} %>
	<h1>Circunferencias</h1>
    <h3>Este es el perímetro y área de la circunferencia</h3>
    <p>Perímetro= <span><%= perimetro %></span>
    <p>Perímetro= <span><%= area %></span>
    <a href="Index">Regresar al incio</a>

    <p> <%= session.getId() %> </p>
</body>
</html>