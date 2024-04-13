package Clase_4.Clases.Ejercicio_5;

import java.util.ArrayList;
import java.util.List;

public class Persona {

	//Atributos
	private String nombre;
	private List<TipoPlatos> platosFavoritos;

	//Constructor
	public Persona(String nombre) {
		this.nombre = nombre;
		this.platosFavoritos = new ArrayList<>();
	}

	//Getter y Setter
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<TipoPlatos> getPlatosFavoritos() {
		return platosFavoritos;
	}
	public void setPlatosFavoritos(List<TipoPlatos> platosFavoritos) {
		this.platosFavoritos = platosFavoritos;
	}
}