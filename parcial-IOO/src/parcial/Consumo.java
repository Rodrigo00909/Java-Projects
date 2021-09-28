package parcial;

import java.time.LocalDate;
import java.util.ArrayList;


public class Consumo {
	private int mes;
	private int ano;
	private LocalDate fecha;
	private float monto;
	private String establecimiento;
	
	public Consumo() {
		super();
		this.mes = mes;
		this.ano = ano;
		this.fecha = fecha;
		this.monto = monto;
		this.establecimiento = establecimiento;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public float getMonto() {
		return monto;
	}

	public void setMonto(float monto) {
		this.monto = monto;
	}

	public String getEstablecimiento() {
		return establecimiento;
	}

	public void setEstablecimiento(String establecimiento) {
		this.establecimiento = establecimiento;
	}
	
	
}


