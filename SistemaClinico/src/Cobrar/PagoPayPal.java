package Cobrar;

public class PagoPayPal implements Pago{
	protected float monto;
	protected String email;
	
	public PagoPayPal(float monto, String email) {
		super();
		this.monto = monto;
		this.email = email;
	}

	public boolean realizarPago(float monto) {
		return true;
	}
}
