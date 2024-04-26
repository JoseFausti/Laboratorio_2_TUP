package Clase_4.Clases.Ejercicio_7;
public class Federacion {

	//Atributos
	private Estacion estaciones[];
	private String nombre;
	private int numeroFederados;

	//Constructor
	public Federacion(Estacion[] estaciones, String nombre, int numeroFederados) {
		this.estaciones = estaciones;
		this.nombre = nombre;
		this.numeroFederados = numeroFederados;
	}

	//Getter y Setter
	public Estacion[] getEstaciones() {
		return estaciones;
	}
	public void setEstaciones(Estacion[] estaciones) {
		this.estaciones = estaciones;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumeroFederados() {
		return numeroFederados;
	}
	public void setNumeroFederados(int numeroFederados) {
		this.numeroFederados = numeroFederados;
	}
}