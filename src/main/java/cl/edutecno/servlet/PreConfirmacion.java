package cl.edutecno.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class preConfirmacion
 */
@WebServlet("/preConfirmacion")
public class PreConfirmacion extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//se redirecciona el request a la pagina jsp
		request.getRequestDispatcher("confirmacion.jsp").forward(request, response);
	}
}

