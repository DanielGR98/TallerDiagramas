package HistoriaClinica;
import java.util.Date;
import Cobrar.Pago;
import Usuario.Paciente;

public class Cita {
	protected Date fecha;
	protected boolean pagada;
	protected String registradoPor;
	protected Paciente paciente;
	
	public Cita(Date fecha, boolean pagada, String registradoPor) {
		super();
		this.fecha = fecha;
		this.pagada = pagada;
		this.registradoPor = registradoPor;
	}

	public void realizarPago(Pago pago){}
}
