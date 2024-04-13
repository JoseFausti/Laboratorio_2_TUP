package Clase_4.Clases.Ejercicio_4;
public class Cereal {

	//Atributos
	private String nombre;
	private TipoCereal tipo;

	//Constructor
	public Cereal(String nombre, TipoCereal tipo) {
		this.nombre = nombre;
		this.tipo = tipo;
	}

	//Getter y Setter
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public TipoCereal getTipo() {
		return tipo;
	}
	public void setTipo(TipoCereal tipo) {
		this.tipo = tipo;
	}
}