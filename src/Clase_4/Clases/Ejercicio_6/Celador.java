package Clase_4.Clases.Ejercicio_6;

import java.util.List;

public class Celador extends Personal {

	//Atributos
	private String nombre;

	//Constructor
	public Celador(String direccion, String dni, Entrada entrada, String n_SeguridadSocial, String nombre, float sueldo, String telefono, List<tipoPersonal> cargos, String nombre1) {
		super(direccion, dni, entrada, n_SeguridadSocial, nombre, sueldo, telefono, cargos);
		this.nombre = nombre1;
	}

	//Getter y Setter
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}