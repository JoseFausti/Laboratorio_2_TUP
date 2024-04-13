package Clase_4.Clases.Ejercicio_6;

import java.util.ArrayList;
import java.util.List;

public class Area {

	//Atributos
	private String nombre;
	private List<Especie> especies;
	private List<Guardia> guardias;

	//Constructor
	public Area(String nombre) {
		this.nombre = nombre;
		this.especies = new ArrayList<>();
		this.guardias = new ArrayList<>();
	}

	//Getter y Setter
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Especie> getEspecies() {
		return especies;
	}
	public void setEspecies(List<Especie> especies) {
		this.especies = especies;
	}

	public List<Guardia> getGuardias() {
		return guardias;
	}
	public void setGuardias(List<Guardia> guardias) {
		this.guardias = guardias;
	}

	//Metodos
	public void agregarEspecie(Especie especie){//Relacion de Agregacion
		this.especies.add(especie);
	}
}