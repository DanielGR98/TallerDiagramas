package Usuario;

import java.util.Date;

import HistoriaClinica.Cita;

public class Secretaria extends Persona{
	protected Cita cita;
	public Secretaria(String usuario, String clave, String nombre, String apellido, String cedula, String direccion,
			Date fechaNac) {
		super(usuario, clave, nombre, apellido, cedula, direccion, fechaNac);
	}
	
	public boolean verificarCita() {return true;}
	public void agendarCita() {}
}
