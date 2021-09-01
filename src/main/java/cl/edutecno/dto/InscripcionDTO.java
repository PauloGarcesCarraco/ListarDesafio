package cl.edutecno.dto;

public class InscripcionDTO {

	private int idInsc;
	private String nombre;
	private String telefono;
	private int idCurso;
	private int idFormaDePago;

	public InscripcionDTO() {
		// TODO Auto-generated constructor stub
	}
	

	public InscripcionDTO(int idInsc, String nombre, String telefono, int idCurso, int idFormaDePago) {
		super();
		this.idInsc = idInsc;
		this.nombre = nombre;
		this.telefono = telefono;
		this.idCurso = idCurso;
		this.idFormaDePago = idFormaDePago;
	}


	public int getIdInsc() {
		return idInsc;
	}

	public void setIdInsc(int idInsc) {
		this.idInsc = idInsc;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public int getIdCurso() {
		return idCurso;
	}

	public void setIdCurso(int idCurso) {
		this.idCurso = idCurso;
	}

	public int getIdFormaDePago() {
		return idFormaDePago;
	}

	public void setIdFormaDePago(int idFormaDePago) {
		this.idFormaDePago = idFormaDePago;
	}


	@Override
	public String toString() {
		return "InscripcionDTO [idInsc=" + idInsc + ", nombre=" + nombre + ", telefono=" + telefono + ", idCurso="
				+ idCurso + ", idFormaDePago=" + idFormaDePago + "]";
	}
	
	
}
