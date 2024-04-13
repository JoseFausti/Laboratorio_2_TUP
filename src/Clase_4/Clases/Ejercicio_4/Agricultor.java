package Clase_4.Clases.Ejercicio_4;

import java.util.ArrayList;
import java.util.List;

public class Agricultor {

	//Atributos
	private int id;
	private String nombre;
	private List <Lote> lotes;

	//Constructor
	public Agricultor(int id, String nombre) {
		this.id = id;
		this.nombre = nombre;
		this.lotes = new ArrayList<>();
	}

	//Getter y Setter
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Lote> getLotes() {
		return lotes;
	}
	public void setLotes(List<Lote> lotes) {
		this.lotes = lotes;
	}
}