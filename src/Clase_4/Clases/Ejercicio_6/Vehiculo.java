package Clase_4.Clases.Ejercicio_6;

import java.util.ArrayList;
import java.util.List;

public class Vehiculo {

	//Atributos
	private String matricula;
	private String tipo;
	private List<Guardia>guardiasAsignados;

	//Constructor
	public Vehiculo(String matricula, String tipo) {
		this.matricula = matricula;
		this.tipo = tipo;
		this.guardiasAsignados = new ArrayList<>();
	}

	//Getter y Setter
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public List<Guardia> getGuardiasAsignados() {
		return guardiasAsignados;
	}
	public void setGuardiasAsignados(List<Guardia> guardiasAsignados) {
		this.guardiasAsignados = guardiasAsignados;
	}
}