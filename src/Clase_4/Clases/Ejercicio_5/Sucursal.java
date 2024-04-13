package Clase_4.Clases.Ejercicio_5;

import java.util.ArrayList;
import java.util.List;

public class Sucursal {

	//Atributos
	private List<Plato>platos;

	//Constructor
	public Sucursal() {
		this.platos = new ArrayList<>();
	}

	//Getter y Setter
	public List<Plato> getPlatos() {
		return platos;
	}
	public void setPlatos(List<Plato> platos) {
		this.platos = platos;
	}
}