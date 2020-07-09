package Cobrar;

public class PagoEfectivo implements Pago {
	protected float monto;

	public PagoEfectivo(float monto) {
		super();
		this.monto = monto;
	}

	public boolean realizarPago(float monto) {
		return false;
	}
}
