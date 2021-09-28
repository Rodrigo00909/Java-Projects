package Supermercado;

import java.time.LocalDate;
import java.util.ArrayList;

public class Supermercado {
	
	private String nombre;
	private String direcc;
	
	
	public Supermercado(String nombre, String direcc) {
		super();
		this.nombre = nombre;
		this.direcc = direcc;
		
		proveedores = new ArrayList<Proveedor>();
		productos = new ArrayList<Producto>();
		
	}
	
	

	// Métodos de negocio
	public void crearNuevoProveedor(float cuit, String razonSocial, String domicilio, String telefono, String mail) {
		
		Proveedor newProveedor = buscarProveedor(cuit); 

		if (newProveedor == null) {
			newProveedor = new Proveedor(cuit, razonSocial, domicilio, telefono, mail); 
			proveedores.add(newProveedor); 
		}
	}

	private Proveedor buscarProveedor(float cuit) {
				for(int i=0; i < proveedores.size(); i++) { 
					Proveedor aux = proveedores.get(i);
					if(aux.sosElProveedor(cuit)) { 
						return aux; 
					}
				}
				return null;
				
	}

}
