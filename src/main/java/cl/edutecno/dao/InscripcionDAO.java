package cl.edutecno.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cl.edutecno.dto.FormaDePagoDTO;
import cl.edutecno.dto.InscripcionDTO;

public class InscripcionDAO {

	public int insertarInscripcion(InscripcionDTO dto) throws SQLException, ClassNotFoundException {
		int max = 0;
		// Query para obtener el una secuencia y asignar un id
		String consultaProximoId = " SELECT MAX(id_inscripcion)+1 FROM inscripcion ";

		// Query que insertara el valor
		String insertarInscripcion = " INSERT INTO inscripcion(id_inscripcion, nombre, telefono, id_curso, id_forma_pago) VALUES (?,?,?,?,?) ";

		// conexion a la base de datos y ejecucion de la sentencia
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conexion = null;
		String url = "jdbc:oracle:thin:@//localhost:1521/orcl";
		conexion = DriverManager.getConnection(url, "unidad2", "1234");

		try (PreparedStatement stmt1 = conexion.prepareStatement(consultaProximoId);
				PreparedStatement stmt2 = conexion.prepareStatement(insertarInscripcion);) {

			ResultSet resultado = stmt1.executeQuery();
			if (resultado.next()) {
				max = resultado.getInt(1);
				stmt2.setInt(1, max);
				stmt2.setString(2, dto.getNombre());
				stmt2.setString(3, dto.getTelefono());
				stmt2.setInt(4, dto.getIdCurso());
				stmt2.setInt(5, dto.getIdFormaDePago());

				if (stmt2.executeUpdate() != 1) {
					throw new RuntimeException("A ocurrido un error inesperado");
				}
			}
		} catch (Exception ex) {
			ex.printStackTrace();
			throw new RuntimeException("A ocurrido un error inesperado" + ex);
		}
		return max;
	}

	public List obtieneInscritos() throws SQLException, ClassNotFoundException {

		// creamos la lista de objetos que devolveran los resultados
		List<InscripcionDTO> listaDeInscritos = new ArrayList<InscripcionDTO>();

		// creamos la consulta a la base de datos
		String consultaSql = " SELECT * FROM inscripcion order by id_inscripcion asc";

		// conexion a la base de datos y ejecucion de la sentencia
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conexion = null;
		String url = "jdbc:oracle:thin:@//localhost:1521/orcl";
		conexion = DriverManager.getConnection(url, "unidad2", "1234");

		try (PreparedStatement stmt = conexion.prepareStatement(consultaSql)) {
			ResultSet resultado = stmt.executeQuery();
			while (resultado.next()) {
				InscripcionDTO listaInscritos = new InscripcionDTO();
				listaInscritos.setIdInsc(resultado.getInt("id_inscripcion"));
				listaInscritos.setNombre(resultado.getString("nombre"));
				listaInscritos.setTelefono(resultado.getString("telefono"));
				listaInscritos.setIdCurso(resultado.getInt("id_curso"));
				listaInscritos.setIdFormaDePago(resultado.getInt("id_forma_pago"));

				listaDeInscritos.add(listaInscritos);

			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return listaDeInscritos;
	}
}
