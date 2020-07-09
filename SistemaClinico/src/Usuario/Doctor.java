package Usuario;

import java.util.Date;

public class Doctor extends Persona{
	protected int regDoctor;
	protected String especialidad;
	public Doctor(String usuario, String clave, String nombre, String apellido, String cedula, String direccion,
			Date fechaNac, int regDoctor, String especialidad) {
		super(usuario, clave, nombre, apellido, cedula, direccion, fechaNac);
		this.regDoctor=regDoctor;
		this.especialidad=especialidad;
	}
	public void recetar() {}
	public void agregarPlanNut() {}
	public void imprimirReceta() {}
	public void registrarSecretaria() {}
	
}
