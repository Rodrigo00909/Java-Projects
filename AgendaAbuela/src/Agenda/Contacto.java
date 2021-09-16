package Agenda;

import java.time.LocalDate;

public class Contacto {
	// Atributos (Privados)
	private String nombre;
	private String mail;
	private String telefono;
	private String domicilio;
	private LocalDate cumpleaños;
	
	// Constructor / Método
	public Contacto(String nombre, String telefono, String domicilio) {
		super();
		this.nombre = nombre;
		this.telefono = telefono;
		this.domicilio = domicilio;
	}

	public Contacto(String nombre, String mail, String telefono, String domicilio, LocalDate cumpleaños) {
		super();
		this.nombre = nombre;
		this.mail = mail;
		this.telefono = telefono;
		this.domicilio = domicilio;
		this.cumpleaños = cumpleaños;
	}
	
	// Gets y Sets: Metodos para obtener datos y asignar datos. Por CADA ATRIBUTO tengo un get y un set

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public LocalDate getCumpleaños() {
		return cumpleaños;
	}

	public void setCumpleaños(LocalDate cumpleaños) {
		this.cumpleaños = cumpleaños;
	}
	
	
	// Buscar un contacto: Método de Negocio (Métodos que dispongo para q mi sistema funcione)
	public boolean sosElContacto(String nombreBuscado) {
		// Como tiene que devolver un boolean, hago una comparacion
		// El nombre es una Clase String. Para saber si un String es igual a otro debo usar un método: Equals de objeto o Quals de otra cosa 
		// equals(Object anObject) se fija que sea igual que el objeto que le pasamos como parametro. Paula y PAULA no son iguales
		// equalsIgnoreCase(String anotherString) se fija que este escrito solamente. Paula y PAULA son iguales.
		if(nombre.equalsIgnoreCase(nombreBuscado)) {
			return true;
		} else {
			return false;
		}
		
		// Hay otra forma de hacer esto, escribiendo menos:
		//return nombre.equalsIgnoreCase(nombreBuscado); 
	}
	
	

}
