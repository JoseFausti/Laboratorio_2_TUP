package Clase_4.Clases.Ejercicio_5;

import java.util.ArrayList;
import java.util.List;

public class Plato {

	//Atributos
	private String nombre;
	private String sucursal;
	private List<Persona>personas;

	//Constructor
	public Plato(String nombre, String sucursal) {
		this.nombre = nombre;
		this.sucursal = sucursal;
		this.personas = new ArrayList<>();
	}

	//Getter y Setter
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getSucursal() {
		return sucursal;
	}
	public void setSucursal(String sucursal) {
		this.sucursal = sucursal;
	}

	public List<Persona> getPersonas() {
		return personas;
	}
	public void setPersonas(List<Persona> personas) {
		this.personas = personas;
	}

}