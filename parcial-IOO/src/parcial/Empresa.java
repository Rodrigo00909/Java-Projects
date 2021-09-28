package parcial;

import java.time.LocalDate;
import java.util.ArrayList;


public class Empresa {

	private ArrayList <Tarjeta> tarjetas;
	private ArrayList <Consumo> consumos;
	
	public Empresa() {
		super();
		tarjetas = new ArrayList<Tarjeta>();
		consumos = new ArrayList<Consumo>();	
	}
	
	public boolean crearConsumo(int nroTarjeta, float monto, String comercio) {
		if(buscarTarjeta(nroTarjeta) != null) {
			return true;
		}
		else {
			return false;
		}
		
		
	}
	
	public void crearNuevoConsumo(int mes, int ano, LocalDate fecha, float monto, String establecimiento)
	{

		Consumo newConsumo = buscarTarjeta(numero);
		if (newConsumo == null)
		{
			newConsumo = new Consumo(mes, ano, fecha, monto, establecimiento);
			consumos.add(newConsumo);
		}
		
	}
	
	private Tarjeta buscarTarjeta(int numero) 
	{
		for (int i=0; i<tarjetas.size();i++)
		{
			Tarjeta aux = tarjetas.get(i);
			if (aux.sosLaTarjeta(numero))
				return aux;
						
		}
		
		return null;
	}
	
	
	
}
