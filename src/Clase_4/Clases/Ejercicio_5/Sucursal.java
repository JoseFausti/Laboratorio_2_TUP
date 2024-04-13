package Clase_4.Clases.Ejercicio_5;

import java.util.ArrayList;
import java.util.List;

public class Sucursal {

	//Atributos
	private String nombre;
	private List<Plato>platos;

	//Constructor
	public Sucursal(String nombre) {
		this.nombre = nombre;
		this.platos = new ArrayList<>();
	}

	//Getter y Setter
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Plato> getPlatos() {
		return platos;
	}
	public void setPlatos(List<Plato> platos) {
		this.platos = platos;
	}
}