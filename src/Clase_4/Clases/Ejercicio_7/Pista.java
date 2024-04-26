package Clase_4.Clases.Ejercicio_7;
public class Pista {

	//Atributos
	private  String  codigoEstacion;
	private double longitud;
	private  String  nivelDificultad;
	private int numero;

	//Constructor
	public Pista(String codigoEstacion, double longitud, String nivelDificultad, int numero) {
		this.codigoEstacion = codigoEstacion;
		this.longitud = longitud;
		this.nivelDificultad = nivelDificultad;
		this.numero = numero;
	}

	//Getter y Setter
	public String getCodigoEstacion() {
		return codigoEstacion;
	}
	public void setCodigoEstacion(String codigoEstacion) {
		this.codigoEstacion = codigoEstacion;
	}

	public double getLongitud() {
		return longitud;
	}
	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}

	public String getNivelDificultad() {
		return nivelDificultad;
	}
	public void setNivelDificultad(String nivelDificultad) {
		this.nivelDificultad = nivelDificultad;
	}

	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
}