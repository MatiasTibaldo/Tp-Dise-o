package modelo;
// Generated 30/09/2016 14:45:49 by Hibernate Tools 5.1.0.Alpha1

import java.util.HashSet;
import java.util.Set;

/**
 * Usuario generated by hbm2java
 */
public class Usuario implements java.io.Serializable {

	private int id;
	private String nombre;
	private String contraseña;
	private Set<Prueba> pruebas = new HashSet<Prueba>(0);

	public Usuario() {
	}

	public Usuario(int id) {
		this.id = id;
	}

	public Usuario(int id, String nombre, String contraseña, Set<Prueba> pruebas) {
		this.id = id;
		this.nombre = nombre;
		this.contraseña = contraseña;
		this.pruebas = pruebas;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getContraseña() {
		return this.contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public Set<Prueba> getPruebas() {
		return this.pruebas;
	}

	public void setPruebas(Set<Prueba> pruebas) {
		this.pruebas = pruebas;
	}

}
