package cl.edutecno.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cl.edutecno.dto.FormaDePagoDTO;

public class FormaDePagoDAO {

	public List obtieneFormasDePago() throws SQLException, ClassNotFoundException {
		
		// creamos la lista de objetos que devolveran los resultados
		List<FormaDePagoDTO> listaDeCursos = new ArrayList<FormaDePagoDTO>();
		
		// creamos la consulta a la base de datos
		String consultaSql = " SELECT id_forma_pago, descripcion, recargo FROM forma_pago ";
		
		// conexion a la base de datos y ejecucion de la sentencia
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conexion = null;
		String url = "jdbc:oracle:thin:@//localhost:1521/orcl";
		conexion = DriverManager.getConnection(url, "unidad2", "1234");
		
		
		try (PreparedStatement stmt = conexion.prepareStatement(consultaSql)) {
			ResultSet resultado = stmt.executeQuery();
			while (resultado.next()) {
				FormaDePagoDTO formaPago = new FormaDePagoDTO();
				formaPago.setIdFormaDePago(resultado.getInt("id_forma_pago"));
				formaPago.setDescripcion(resultado.getString("descripcion"));
				formaPago.setRecargo(resultado.getString("recargo"));
				listaDeCursos.add(formaPago);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return listaDeCursos;
	}
}
