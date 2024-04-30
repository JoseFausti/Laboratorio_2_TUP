package Clase_4.Clases.Ejercicio_8;

public class Persona {

	//Atributos
	private String direccion;
	private String nombre;
	private String numeroSeguridadSocial;
	private String telefono;

	//Constructor
	public Persona(String direccion, String nombre, String numeroSeguridadSocial, String telefono) {
		this.direccion = direccion;
		this.nombre = nombre;
		this.numeroSeguridadSocial = numeroSeguridadSocial;
		this.telefono = telefono;
	}

	//Getter y Setter
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNumeroSeguridadSocial() {
		return numeroSeguridadSocial;
	}
	public void setNumeroSeguridadSocial(String numeroSeguridadSocial) {
		this.numeroSeguridadSocial = numeroSeguridadSocial;
	}

	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
}