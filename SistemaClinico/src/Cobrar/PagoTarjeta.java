package Cobrar;

import java.util.Date;

public class PagoTarjeta implements Pago {
	protected float monto;
	protected String numero;
	protected Date expira;
	protected String propietario;
	protected String banco;
	
	public PagoTarjeta(float monto, String numero, Date expira, String propietario, String banco) {
		super();
		this.monto = monto;
		this.numero = numero;
		this.expira = expira;
		this.propietario = propietario;
		this.banco = banco;
	}

	public boolean realizarPago(float monto) {
		return false;
	}
}
