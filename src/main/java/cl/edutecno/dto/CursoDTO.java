package cl.edutecno.dto;

public class CursoDTO {
	private int idCurso;
	private String descripcion;
	private double precio;
	
	public CursoDTO() {
		// TODO Auto-generated constructor stub
	}

	public int getIdCurso() {
		return idCurso;
	}

	public void setIdCurso(int idCurso) {
		this.idCurso = idCurso;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "CursoDTO [idCurso=" + idCurso + ", descripcion=" + descripcion + ", precio=" + precio + "]";
	}
	
	
}
