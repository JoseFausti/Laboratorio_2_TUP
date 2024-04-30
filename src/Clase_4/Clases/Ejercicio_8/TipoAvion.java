package Clase_4.Clases.Ejercicio_8;
public class TipoAvion {

	//Atributos
	private int capacidad;
	private String numeroModelo[];
	private double peso;

	//Constructor
	public TipoAvion(int capacidad, String[] numeroModelo, double peso) {
		this.capacidad = capacidad;
		this.numeroModelo = numeroModelo;
		this.peso = peso;
	}

	//Getter y Setter
	public int getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public String[] getNumeroModelo() {
		return numeroModelo;
	}
	public void setNumeroModelo(String[] numeroModelo) {
		this.numeroModelo = numeroModelo;
	}

	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
}