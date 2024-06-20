package Clase_4.Clases.Ejercicio_10;

import java.util.ArrayList;
import java.util.List;

public class SedeOlimpiada {

	//Atributos
	private int numeroComplejos;
	private double presupuesto;
	private List<ComplejoDeportivo> complejosDeportivos;

	//Constructor
	public SedeOlimpiada() {
		this.complejosDeportivos = new ArrayList<>();
	}
	public SedeOlimpiada(int numeroComplejos, double presupuesto) {
		this.numeroComplejos = numeroComplejos;
		this.presupuesto = presupuesto;
		this.complejosDeportivos = new ArrayList<>();
		crearComplejosDeportivos();
	}

	//Getters y Setters
	public int getNumeroComplejos() {
		return numeroComplejos;
	}

	public void setNumeroComplejos(int numeroComplejos) {
		this.numeroComplejos = numeroComplejos;
	}

	public double getPresupuesto() {
		return presupuesto;
	}

	public void setPresupuesto(double presupuesto) {
		this.presupuesto = presupuesto;
	}

	public List<ComplejoDeportivo> getComplejosDeportivos() {
		return complejosDeportivos;
	}

	//Metodos
	private void crearComplejosDeportivos() {
		for (int i = 0; i < numeroComplejos; i++) {
			ComplejoDeportivo complejo = new ComplejoDeportivo();
			complejosDeportivos.add(complejo);
		}
	}
}
