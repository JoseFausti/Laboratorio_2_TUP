package Clase_4.Clases.Ejercicio_6;

import java.util.ArrayList;
import java.util.List;

public class Investigador extends Personal {

	//Atributos
	private String nombre;
	private List<Proyecto> titulacion;

	//Constructor
	public Investigador(String direccion, String dni, Entrada entrada, String n_SeguridadSocial, String nombre, float sueldo, String telefono, List<tipoPersonal> cargos, String nombre1) {
		super(direccion, dni, entrada, n_SeguridadSocial, nombre, sueldo, telefono, cargos);
		this.nombre = nombre1;
		this.titulacion = new ArrayList<>();
	}

	//Getter y Setter
	@Override
	public String getNombre() {
		return nombre;
	}
	@Override
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Proyecto> getTitulacion() {
		return titulacion;
	}
	public void setTitulacion(List<Proyecto> titulacion) {
		this.titulacion = titulacion;
	}
}