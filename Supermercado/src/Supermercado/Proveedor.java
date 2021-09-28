package Supermercado;

public class Proveedor {
	
	private int cuit;
	private String razonSocial;
	private String domicilio;
	private String telefono;
	private String mail;
	
	public Proveedor(int cuit, String razonSocial, String domicilio, String telefono, String mail) {
		super();
		this.cuit = cuit;
		this.razonSocial = razonSocial;
		this.domicilio = domicilio;
		this.telefono = telefono;
		this.mail = mail;
	}

	public String getRazonSocial() {
		return razonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public int getCuit() {
		return cuit;
	}

	public boolean sosElProveedor(int cuitBuscado) {
		if(cuit.equalsIgnoreCase(cuitBuscado)) {
			return true;
		} else {
			return false;
		}
	}
	
	

}
