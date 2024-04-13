package Clase_4.Clases.Ejercicio_6;

import java.util.List;

public class Personal {

	//Atributos
	private String direccion;
	private String dni;
	private Entrada entrada;
	private String n_SeguridadSocial;
	private String nombre;
	private float sueldo;
	private String telefono;
	private List<tipoPersonal> cargos;

	//Constructor
	public Personal(String direccion, String dni, Entrada entrada, String n_SeguridadSocial, String nombre, float sueldo, String telefono, List<tipoPersonal> cargos) {
		this.direccion = direccion;
		this.dni = dni;
		this.entrada = entrada;
		this.n_SeguridadSocial = n_SeguridadSocial;
		this.nombre = nombre;
		this.sueldo = sueldo;
		this.telefono = telefono;
		this.cargos = cargos;
	}

	//Getter y Setter
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}

	public Entrada getEntrada() {
		return entrada;
	}
	public void setEntrada(Entrada entrada) {
		this.entrada = entrada;
	}

	public String getN_SeguridadSocial() {
		return n_SeguridadSocial;
	}
	public void setN_SeguridadSocial(String n_SeguridadSocial) {
		this.n_SeguridadSocial = n_SeguridadSocial;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getSueldo() {
		return sueldo;
	}
	public void setSueldo(float sueldo) {
		this.sueldo = sueldo;
	}

	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public List<tipoPersonal> getCargos() {
		return cargos;
	}
	public void setCargos(List<tipoPersonal> cargos) {
		this.cargos = cargos;
	}
}