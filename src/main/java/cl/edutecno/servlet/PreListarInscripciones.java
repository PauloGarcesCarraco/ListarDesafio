package cl.edutecno.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cl.edutecno.dto.InscripcionDTO;
import cl.edutecno.facade.Facade;

/**
 * Servlet implementation class PreListarInscripciones
 */
@WebServlet("/PreListarInscripciones")
public class PreListarInscripciones extends HttpServlet {

	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Facade facade= new Facade();
		try {
			
			//lista inscritos
			List<InscripcionDTO> listaInscripcion = facade.obtenerInscritos();
			
			request.setAttribute("inscritos", listaInscripcion);
			
			// mandamos el request a la pagina jsp
						request.getRequestDispatcher("listarInscripciones.jsp").forward(request, response);
		
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		

	}


}
