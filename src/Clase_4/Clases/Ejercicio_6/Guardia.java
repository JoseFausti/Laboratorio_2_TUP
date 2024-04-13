package Clase_4.Clases.Ejercicio_6;

import java.util.List;

public class Guardia extends Personal {

	//Atributos
	private String nombre;
	private Vehiculo vehiculo;

	//Constructor
	public Guardia(String direccion, String dni, Entrada entrada, String n_SeguridadSocial, String nombre, float sueldo, String telefono, List<tipoPersonal> cargos, String nombre1, Vehiculo vehiculo) {
		super(direccion, dni, entrada, n_SeguridadSocial, nombre, sueldo, telefono, cargos);
		this.nombre = nombre1;
		this.vehiculo = vehiculo;
	}

	//Getter y Setter
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Vehiculo getVehiculo() {
		return vehiculo;
	}
	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}
}