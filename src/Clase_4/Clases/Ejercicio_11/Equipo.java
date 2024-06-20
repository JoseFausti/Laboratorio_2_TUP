package Clase_4.Clases.Ejercicio_11;

import java.util.List;

public class Equipo {

	//Atributos
	private String nombre;
	private Lider lider;
	private List<Representante> vendedores;

	//Constructor
	public Equipo(){

	}
	public Equipo(String nombre) {
		this.nombre = nombre;
	}

	//Getters y Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Lider getLider() {
		return lider;
	}

	public void setLider(Lider lider) {
		this.lider = lider;
	}

	public List<Representante> getVendedores() {
		return vendedores;
	}

	public void setVendedores(List<Representante> vendedores) {
		this.vendedores = vendedores;
	}
}