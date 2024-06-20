package Clase_4.Clases.Ejercicio_10;

import java.util.ArrayList;
import java.util.List;

public abstract class JuegosOlimpicos {

	//Atributos
	private List<SedeOlimpiada>sedesOlimpiada;

	//Constructor
	public JuegosOlimpicos(List<SedeOlimpiada>sedesOlimpiada){
		this.sedesOlimpiada = new ArrayList<SedeOlimpiada>(sedesOlimpiada);
	}

	//Getters y Setters
	public List<SedeOlimpiada> getSedesOlimpiada() {
		return sedesOlimpiada;
	}

	public void setSedesOlimpiada(List<SedeOlimpiada> sedesOlimpiada) {
		this.sedesOlimpiada = sedesOlimpiada;
	}
}