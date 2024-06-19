package Clase_4.Clases.Ejercicio_9;

import java.util.ArrayList;
import java.util.List;

public class Museo {

	//Atributos
	private List<ColeccionDeObras> colecciones;
	private List<Exposicion> exposiciones;

	//Constructor
	public Museo() {
		this.colecciones = new ArrayList<>();
		this.exposiciones = new ArrayList<>();
	}

	//Getters y Setters
	public List<ColeccionDeObras> getColecciones() {
		return colecciones;
	}

	public void setColecciones(List<ColeccionDeObras> colecciones) {
		this.colecciones = colecciones;
	}

	public List<Exposicion> getExposiciones() {
		return exposiciones;
	}

	public void setExposiciones(List<Exposicion> exposiciones) {
		this.exposiciones = exposiciones;
	}

	//Metodos
	public void agregarColeccion(ColeccionDeObras coleccionDeObra){
		this.colecciones.add(coleccionDeObra);
	}
	public void agregarExposicion(Exposicion exposicion){
		this.exposiciones.add(exposicion);
	}
}