package Agenda;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Evento {
	
	private LocalDate fecha;
	private LocalDateTime horario;
	private String lugar;
	private String descripcion;
	private Contacto contacto; // Como Contacto ya está en el mismo package no tengo que importarlo
	
	public Evento(LocalDate fecha, LocalDateTime horario, String lugar, String descripcion) {
		super();
		this.fecha = fecha;
		this.horario = horario;
		this.lugar = lugar;
		this.descripcion = descripcion;
	}
	
	public Evento(LocalDate fecha, LocalDateTime horario, String lugar, String descripcion, Contacto contacto) {
		super();
		this.fecha = fecha;
		this.horario = horario;
		this.lugar = lugar;
		this.descripcion = descripcion;
		this.contacto = contacto;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public LocalDateTime getHorario() {
		return horario;
	}

	public void setHorario(LocalDateTime horario) {
		this.horario = horario;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Contacto getContacto() {
		return contacto;
	}

	public void setContacto(Contacto contacto) {
		this.contacto = contacto;
	}

	
}
