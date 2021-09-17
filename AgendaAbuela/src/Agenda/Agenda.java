package Agenda;

import java.time.LocalDate;
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
		// Si el nuevo contacto es NULO entonces lo crearé
		if (newContacto == null) {
			newContacto = new Contacto(nombre, mail, tel, dom, cumple); // Creo el contacto
			contactos.add(newContacto); // Añado a la coleccion contactos el nuevo contacto
		}
	}

	private Contacto buscarContacto(String nombre) {
		// Iterar sobre la ArrayList para buscar el contacto con un FOR comun y corriente o con una iteracion
		for(int i=0; i < contactos.size(); i++) { // Mientras i sea menor que Contactos.Size es decir la cant de elementos del array, le sumo 1 a i
			// Saco el Contacto de la coleccion con una variable auxiliar
			Contacto aux = contactos.get(i); // Ahora en aux tengo el contacto en la posición i
			if(aux.sosElContacto(nombre)) { // le pregunto a aux si tiene el contacto
				return aux; // Si es verdadero (q encuentra al contacto) devuelve al contacto encontrado en aux
			}
		}
		// Si el contacto no existe devuelvo nulo
		return null;
		
	}
	

	
	
	
}


