package Clase_4.Clases.Ejercicio_9;

import java.util.Date;

public class ObjetosEnPrestamo extends PertenenciaAlMuseo{

	//Atributos
	private String nombreColeccion;
	private Date fechaDevolucion;
	private Date fechaRecepcion;

	//Constructor
	public ObjetosEnPrestamo(){

	}
	public ObjetosEnPrestamo(String nombreColeccion, Date fechaDevolucion, Date fechaRecepcion) {
		this.nombreColeccion = nombreColeccion;
		this.fechaDevolucion = fechaDevolucion;
		this.fechaRecepcion = fechaRecepcion;
	}

	//Getter y Setter
	public String getNombreColeccion() {
		return nombreColeccion;
	}

	public void setNombreColeccion(String nombreColeccion) {
		this.nombreColeccion = nombreColeccion;
	}

	public Date getFechaDevolucion() {
		return fechaDevolucion;
	}

	public void setFechaDevolucion(Date fechaDevolucion) {
		this.fechaDevolucion = fechaDevolucion;
	}

	public Date getFechaRecepcion() {
		return fechaRecepcion;
	}

	public void setFechaRecepcion(Date fechaRecepcion) {
		this.fechaRecepcion = fechaRecepcion;
	}
}