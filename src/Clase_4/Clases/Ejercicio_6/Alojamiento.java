package Clase_4.Clases.Ejercicio_6;

import java.util.ArrayList;
import java.util.List;

public class Alojamiento {

	//Atributos
	private String nombre;
	private int capacidad;
	private String categoria;
	private String fechaInicio;
	private List<Habitacion> habitaciones;
	private List<Excursion> excursiones;


	//Constructor
	public Alojamiento(String nombre, int capacidad, String categoria, String fechaInicio, List<Habitacion> habitaciones, List<Excursion> excursiones) {
		this.nombre = nombre;
		this.capacidad = capacidad;
		this.categoria = categoria;
		this.fechaInicio = fechaInicio;
		this.habitaciones = new ArrayList<>(habitaciones);
		this.excursiones = new ArrayList<>(excursiones);
	}

	//Getter y Setter
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(String fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public List<Habitacion> getHabitaciones() {
		return habitaciones;
	}
	public void setHabitaciones(List<Habitacion> habitaciones) {
		this.habitaciones = habitaciones;
	}

	public List<Excursion> getExcursiones() {
		return excursiones;
	}
	public void setExcursiones(List<Excursion> excursiones) {
		this.excursiones = excursiones;
	}
}