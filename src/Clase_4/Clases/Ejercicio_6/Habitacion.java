package Clase_4.Clases.Ejercicio_6;

import java.util.ArrayList;
import java.util.List;

public class Habitacion {

	//Atributos
	private String nombre;
	private List<PersonaVisitante> personasAlojadas;

	//Constructor
	public Habitacion(String nombre) {
		this.nombre = nombre;
		this.personasAlojadas = new ArrayList<>();
	}

	//Getter y Setter
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<PersonaVisitante> getPersonasAlojadas() {
		return personasAlojadas;
	}
	public void setPersonasAlojadas(List<PersonaVisitante> personasAlojadas) {
		this.personasAlojadas = personasAlojadas;
	}
}