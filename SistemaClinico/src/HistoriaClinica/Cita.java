package HistoriaClinica;
import java.util.Date;
public class Cita {
	protected Date fecha;
	protected boolean pagada;
	protected String registradoPor;
	
	public Cita(Date fecha, boolean pagada, String registradoPor) {
		super();
		this.fecha = fecha;
		this.pagada = pagada;
		this.registradoPor = registradoPor;
	}

	public void realizarPago(){}
}
