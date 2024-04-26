package Clase_4.Clases.Ejercicio_7;
public class Campeonato {

	//Atributos
	private String nombre;
	private Prueba pruebas[];

	//Constructor
	public Campeonato(String nombre, Prueba[] pruebas) {
		this.nombre = nombre;
		this.pruebas = pruebas;
	}

	//getter y Setter
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Prueba[] getPruebas() {
		return pruebas;
	}
	public void setPruebas(Prueba[] pruebas) {
		this.pruebas = pruebas;
	}
}