package Receta;

import java.util.Date;

import Usuario.Doctor;

public class Receta {
	protected Date fecha;
	protected PlanNutricional planNut;
	protected Medicamento[] medicamentos;
	protected Doctor doctor;
	public Receta(Date fecha, PlanNutricional planNut,Medicamento[] medicamentos) {
		super();
		this.fecha = fecha;
	}
}
