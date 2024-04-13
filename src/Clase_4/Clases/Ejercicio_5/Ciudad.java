package Clase_4.Clases.Ejercicio_5;

import java.util.ArrayList;
import java.util.List;

public class Ciudad {

	//Atributos
	private String nombre;
	private List<Restaurante> restaurantes;

	//Constructor
	public Ciudad(String nombre) {
		this.nombre = nombre;
		this.restaurantes = new ArrayList<>();
	}

	//Getter y Setter
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Restaurante> getRestaurantes() {
		return restaurantes;
	}
	public void setRestaurantes(List<Restaurante> restaurantes) {
		this.restaurantes = restaurantes;
	}

}