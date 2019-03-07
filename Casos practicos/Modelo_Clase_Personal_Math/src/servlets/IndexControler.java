package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class IndexControler
 */
@WebServlet("/Index")
public class IndexControler extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public IndexControler() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession sesion = request.getSession(true);
		RequestDispatcher rd = null;
		
		String solicitud = request.getParameter("solicitud");
		
		if (sesion.isNew() || solicitud==null) {
			
			rd=request.getRequestDispatcher("/entrada.jsp");
			
		} else if(solicitud.equalsIgnoreCase("tabla")) {
			
			rd=request.getRequestDispatcher("/TablaMult");
			
		} else if(solicitud.equalsIgnoreCase("circunferencia")) {
			
			rd=request.getRequestDispatcher("/circunferencia.jsp");
			
		} else {
			
			response.sendRedirect("/entrada.jsp");
			
		}
		
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
