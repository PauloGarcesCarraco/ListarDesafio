package cl.edutecno.dto;

public class FormaDePagoDTO {

	private int idFormaDePago;
	private String descripcion;
	private String recargo;

	public FormaDePagoDTO() {
		// TODO Auto-generated constructor stub
	}
	
	//G&S

	public int getIdFormaDePago() {
		return idFormaDePago;
	}

	public void setIdFormaDePago(int idFormaDePago) {
		this.idFormaDePago = idFormaDePago;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getRecargo() {
		return recargo;
	}

	public void setRecargo(String recargo) {
		this.recargo = recargo;
	}

	@Override
	public String toString() {
		return "FormaDePagoDTO [idFormaDePago=" + idFormaDePago + ", descripcion=" + descripcion + ", recargo="
				+ recargo + "]";
	}

}
