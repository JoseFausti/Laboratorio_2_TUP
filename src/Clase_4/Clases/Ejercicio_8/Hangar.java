package Clase_4.Clases.Ejercicio_8;
public class Hangar {

	//Atributos
	private int capacidad;
	private int numero;
	private String ubicacion;

	//Constructor
	public Hangar(int capacidad, int numero, String ubicacion) {
		this.capacidad = capacidad;
		this.numero = numero;
		this.ubicacion = ubicacion;
	}

	//Getter y Setter
	public int getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
}