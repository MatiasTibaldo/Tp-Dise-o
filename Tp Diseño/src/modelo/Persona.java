package modelo;
// Generated 30/09/2016 14:45:49 by Hibernate Tools 5.1.0.Alpha1

/**
 * Persona generated by hbm2java
 */
public class Persona implements java.io.Serializable {

	private int dni;
	private Character nombre;
	private Domicilio domicilio;

	public Persona() {
	}

	public Persona(int dni) {
		this.dni = dni;
	}

	public Persona(int dni, Character nombre, Domicilio domicilio) {
		this.dni = dni;
		this.nombre = nombre;
		this.domicilio = domicilio;
	}

	public int getDni() {
		return this.dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public Character getNombre() {
		return this.nombre;
	}

	public void setNombre(Character nombre) {
		this.nombre = nombre;
	}

	public Domicilio getDomicilio() {
		return this.domicilio;
	}

	public void setDomicilio(Domicilio domicilio) {
		this.domicilio = domicilio;
	}

}
