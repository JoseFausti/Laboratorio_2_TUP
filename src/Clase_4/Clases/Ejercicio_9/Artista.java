package Clase_4.Clases.Ejercicio_9;

import java.util.Date;

public class Artista {

	//Atributos
	private String nombre;
	private String paisOrigen;
	private String epoca;
	private String  estiloPrincipal;
	private String descripcion;
	private Date fechaNacimiento;
	private Date fechaDefuncion;

	//Constructor
	public Artista(){

	}
	public Artista(String nombre, String paisOrigen, String epoca, String estiloPrincipal, String descripcion, Date fechaNacimiento, Date fechaDefuncion) {
		this.nombre = nombre;
		this.paisOrigen = paisOrigen;
		this.epoca = epoca;
		this.estiloPrincipal = estiloPrincipal;
		this.descripcion = descripcion;
		this.fechaNacimiento = fechaNacimiento;
		this.fechaDefuncion = fechaDefuncion;
	}

	//Getter y Setter
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPaisOrigen() {
		return paisOrigen;
	}

	public void setPaisOrigen(String paisOrigen) {
		this.paisOrigen = paisOrigen;
	}

	public String getEpoca() {
		return epoca;
	}

	public void setEpoca(String epoca) {
		this.epoca = epoca;
	}

	public String getEstiloPrincipal() {
		return estiloPrincipal;
	}

	public void setEstiloPrincipal(String estiloPrincipal) {
		this.estiloPrincipal = estiloPrincipal;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Date getFechaDefuncion() {
		return fechaDefuncion;
	}

	public void setFechaDefuncion(Date fechaDefuncion) {
		this.fechaDefuncion = fechaDefuncion;
	}
}