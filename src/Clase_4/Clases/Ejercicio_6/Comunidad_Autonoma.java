package Clase_4.Clases.Ejercicio_6;

import java.util.ArrayList;
import java.util.List;

public class Comunidad_Autonoma {

	//Atributos
	private String nombre;
	private List<Organismo> organismoResponsables;
	private List<Parque> parques;

	//Constructor
	public Comunidad_Autonoma(String nombre, List<Organismo> organismoResponsables, List<Parque> parques) {
		this.nombre = nombre;
		this.organismoResponsables = organismoResponsables;
		this.parques = new ArrayList<>(parques); //Composicion
	}

	//Getter y Setter
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Organismo> getOrganismoResponsables() {
		return organismoResponsables;
	}
	public void setOrganismoResponsables(List<Organismo> organismoResponsables) {
		this.organismoResponsables = organismoResponsables;
	}

	public List<Parque> getParques() {
		return parques;
	}
	public void setParques(List<Parque> parques) {
		this.parques = parques;
	}
}