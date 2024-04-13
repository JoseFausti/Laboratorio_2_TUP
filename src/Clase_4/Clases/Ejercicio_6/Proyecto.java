package Clase_4.Clases.Ejercicio_6;

import java.util.ArrayList;
import java.util.List;

public class Proyecto {

	//Atributos
	private String nombre;
	private List<Especie> especiesInvestigadas;

	//Constructor
	public Proyecto(String nombre) {
		this.nombre = nombre;
		this.especiesInvestigadas = new ArrayList<>();
	}

	//Getter y Setter
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Especie> getEspeciesInvestigadas() {
		return especiesInvestigadas;
	}
	public void setEspeciesInvestigadas(List<Especie> especiesInvestigadas) {
		this.especiesInvestigadas = especiesInvestigadas;
	}
}