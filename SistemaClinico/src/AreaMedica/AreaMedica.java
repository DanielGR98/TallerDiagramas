package AreaMedica;

import Usuario.Doctor;

public class AreaMedica {
	protected String especialidad;
	protected float costo;
	protected Doctor[] doctores;
	public AreaMedica(String especialidad, float costo, Doctor[] doctores) {
		super();
		this.especialidad = especialidad;
		this.costo = costo;
		this.doctores = doctores;
	}
}
