package cl.edutecno.facade;

import java.sql.SQLException;
import java.util.List;

import cl.edutecno.dao.CursoDAO;
import cl.edutecno.dao.FormaDePagoDAO;
import cl.edutecno.dao.InscripcionDAO;
import cl.edutecno.dto.CursoDTO;
import cl.edutecno.dto.FormaDePagoDTO;
import cl.edutecno.dto.InscripcionDTO;

public class Facade {

	public int registrarInscripcion(InscripcionDTO dto) throws SQLException, ClassNotFoundException {
		InscripcionDAO dao = new InscripcionDAO();
		return dao.insertarInscripcion(dto);
	}
	public List<InscripcionDTO> obtenerInscritos() throws SQLException, ClassNotFoundException {
		InscripcionDAO dao=new InscripcionDAO();
		return dao.obtieneInscritos();
	}

	public List<CursoDTO> obtenerCursos() throws SQLException, ClassNotFoundException {
		CursoDAO dao = new CursoDAO();
		return dao.obtieneCursos();
	}

	public List<FormaDePagoDTO> obtenerFormasDePago() throws SQLException, ClassNotFoundException {
		FormaDePagoDAO dao = new FormaDePagoDAO();
		return dao.obtieneFormasDePago();
	}
}
