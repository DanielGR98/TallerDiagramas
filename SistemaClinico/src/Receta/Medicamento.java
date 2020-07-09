package Receta;

public class Medicamento {
	protected String medicina;
	protected String dosis;
	protected String observaciones;
	protected int cantidadTotal;
	protected String unidad;
	
	public Medicamento(String medicina, String dosis, String observaciones, int cantidadTotal, String unidad) {
		super();
		this.medicina = medicina;
		this.dosis = dosis;
		this.observaciones = observaciones;
		this.cantidadTotal = cantidadTotal;
		this.unidad = unidad;
	}
	
}
