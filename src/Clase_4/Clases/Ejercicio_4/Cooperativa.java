package Clase_4.Clases.Ejercicio_4;

import java.util.ArrayList;
import java.util.List;

public class Cooperativa {

	//Atributos
	private List <Agricultor> agricultores;

	//Constructor
	public Cooperativa(){
		this.agricultores = new ArrayList<>();
	}

	//Getter y Setter
	public List<Agricultor> getAgricultores() {
		return agricultores;
	}
	public void setAgricultores(List<Agricultor> agricultores) {
		this.agricultores = agricultores;
	}

}