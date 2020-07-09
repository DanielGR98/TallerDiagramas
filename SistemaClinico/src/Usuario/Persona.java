package Usuario;

import java.util.Date;

public class Persona {
	protected String usuario;
	protected String clave;
	protected String nombre;
	protected String apellido;
	protected String cedula;
	protected String direccion;
	protected Date fechaNac;
	public Persona(String usuario, String clave, String nombre, String apellido, String cedula, String direccion,
			Date fechaNac) {
		super();
		this.usuario = usuario;
		this.clave = clave;
		this.nombre = nombre;
		this.apellido = apellido;
		this.cedula = cedula;
		this.direccion = direccion;
		this.fechaNac = fechaNac;
	}
	public boolean logIn() {return true;}
	public boolean logOut() {return false;}
}
