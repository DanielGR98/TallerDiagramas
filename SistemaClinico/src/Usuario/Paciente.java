package Usuario;
import java.util.Date;
import HistoriaClinica.Cita;
import HistoriaClinica.HistoriaClinica;
import Receta.Receta;

public class Paciente extends Persona{
	protected String email;
	protected Cita cita; 
	protected HistoriaClinica historia;
	protected Receta[] recetas;
	
	public Paciente(String usuario, String clave, String nombre, String apellido, String cedula, String direccion,
			Date fechaNac,String email,HistoriaClinica historia) {
		super(usuario, clave, nombre, apellido, cedula, direccion, fechaNac);
		this.email=email;
		this.historia=historia;
	}
	
	public boolean solicitarCita() {return true;}
	
}
