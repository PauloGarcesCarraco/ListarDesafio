package cl.edutecno.main;

import java.sql.SQLException;
import java.util.List;

import cl.edutecno.dao.CursoDAO;
import cl.edutecno.dao.FormaDePagoDAO;
import cl.edutecno.dao.InscripcionDAO;
import cl.edutecno.dto.FormaDePagoDTO;
import cl.edutecno.dto.InscripcionDTO;

public class main {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		CursoDAO curso = new CursoDAO();

		List<CursoDAO> listCurso = curso.obtieneCursos();

		System.out.println(listCurso);

		FormaDePagoDAO pago = new FormaDePagoDAO();
		List<FormaDePagoDTO> listPago = pago.obtieneFormasDePago();
		System.out.println(listPago);
		
		
		InscripcionDAO inscripcion=new InscripcionDAO();
//		InscripcionDTO inscripcion3= new InscripcionDTO(1,"pawis","981351747",1,3578);
//		inscripcion.insertarInscripcion(inscripcion3);
		
		List<InscripcionDTO> listInscritos=inscripcion.obtieneInscritos();
		System.out.println(listInscritos);
		
		

	}

}
