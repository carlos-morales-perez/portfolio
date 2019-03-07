package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Tabla
 */
@WebServlet("/TablaMult")
public class Tabla extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Tabla() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession sesion = request.getSession(true);
		
		String nume=request.getParameter("num");
		String rows=request.getParameter("row");
		RequestDispatcher rd = null;
		
		if(nume!=null && rows!=null) {
					
			if(nume.equals("") && rows.equals("")) {
				
				rd = request.getRequestDispatcher("/tabla.jsp");
				rd.forward(request, response);
				
			} else {
			
				int num=Integer.parseInt(nume);
				int row=Integer.parseInt(rows);
			
				PrintWriter salida = response.getWriter();
				salida.append("<!DOCTYPE html>");
				salida.append("<html>");
				salida.append("<head>");
				salida.append("<meta charset=\"UTF-8\">");
				salida.append("<title>Math - Tabla mult</title>");
				salida.append("</head>");
				salida.append("<body>");
				salida.append("<h1>Tablas de multiplicar</h1>");
				salida.append("<h3>Resultado</h3>");
				salida.append("<p>Multiplicas" + num + " de menera consecutiva hasta "+ row +"</p>" );
				for(int i=1;i<=row;i++) {
					
					salida.append("<p>"+ num + " * " + i + "=" + num*i + "</p>");
					
				}
				
				salida.append("<br>");
				salida.append("<a href=\"Index\">Regresar al incio</a>");
				salida.append("<p>" + sesion.getId() + "</p>");
				salida.append("</body>");
				salida.append("</html>");
			}
			
		} else if(sesion.isNew()) {
			
			response.sendRedirect("entrada.jsp");
			
		} else {
			
			rd = request.getRequestDispatcher("/tabla.jsp");
			rd.forward(request, response);
			
		}
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
