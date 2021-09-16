package Agenda;

import java.util.ArrayList;

public class Agenda {

	private String propietario;
	private String domicilio;
	private String mail;
	private String telefono;
	private ArrayList <Contacto> contactos;
	private ArrayList <Evento> eventos;
	
	public Agenda(String propietario, String domicilio, String mail, String telefono) {
		super();
		// Cuando yo me compre una agenda no tendré mi lista de contactos ni lista de eventos xq las tendré que agregar, entonces acá las destildo 
		this.propietario = propietario;
		this.domicilio = domicilio;
		this.mail = mail;
		this.telefono = telefono;
		
		// Crear colección vacía lista para recibir cosas
		// Creo estos nuevos dos objetos con NEW, cuyo constructor instanciado es el Contacto o el Evento
		contactos = new ArrayList<Contacto>();
		eventos = new ArrayList<Evento>();
		
	}
	
	// Al ser una Agenda Nueva, yo puedo permitir que el dueño pise el domicilio, el mail, el telefono y el propietario actuales,
	// pero los contactos y eventos todavia no. Entonces los destildo. 
	
	// Si quiere modificar un contacto debe usar los métodos de dentro de la agenda.
	
	// En este caso Limito los getters y setters: privacidad de datos por requerimiento de negocios

	public String getPropietario() {
		return propietario;
	}

	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
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
	
	
	// Métodos de negocio
	public void crearContactoNuevo(String nombre, String dom, String tel, String mail, LocalDate cumple) {
		// Para crear un nuevo contacto deberia saber si existe.
		Contacto newContacto = buscarContacto(nombre); // Método para buscarContacto. El experto en conocer contactos es la agenda entonces lo reciclamos
	}
	
	
	
}


