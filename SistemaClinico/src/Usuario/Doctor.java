package Usuario;

import java.util.Date;

import HistoriaClinica.Cita;
import Receta.Receta;


public class Doctor extends Persona{
	protected int regDoctor;
	protected String especialidad;
	protected Secretaria secretaria;
	protected Cita[] citasPendientes;
	protected Receta[] recetas;
	public Doctor(String usuario, String clave, String nombre, String apellido, String cedula, String direccion,
			Date fechaNac, int regDoctor, String especialidad, Secretaria secretaria) {
		super(usuario, clave, nombre, apellido, cedula, direccion, fechaNac);
		this.regDoctor=regDoctor;
		this.especialidad=especialidad;
		this.secretaria=secretaria;
	}
	public void recetar() {}
	public void agregarPlanNut() {}
	public void imprimirReceta() {}
	public void registrarSecretaria() {}
	
}
