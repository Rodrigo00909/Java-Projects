package parcial;

import java.time.LocalDate;

public class Tarjeta {

	private int numero;
	private int codigoSeguridad;
	private LocalDate fechaVto;
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getCodigoSeguridad() {
		return codigoSeguridad;
	}

	public void setCodigoSeguridad(int codigoSeguridad) {
		this.codigoSeguridad = codigoSeguridad;
	}

	public LocalDate getFechaVto() {
		return fechaVto;
	}

	public void setFechaVto(LocalDate fechaVto) {
		this.fechaVto = fechaVto;
	}

	public boolean sosLaTarjeta(int numero2)
	{
		if (numero == numero2)
		{ 
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
	public boolean tarjetaVencida(int nroTarjeta) {
		if (nroTarjeta == 0) {
			return false;
		}
		else {
			return true;
		}
	}
}
