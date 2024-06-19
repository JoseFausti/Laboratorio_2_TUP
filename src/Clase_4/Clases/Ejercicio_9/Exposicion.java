package Clase_4.Clases.Ejercicio_9;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Exposicion {

	//Atributos
	private String nombre;
	private Date fechaInicio;
	private Date fechaFin;
	private List<ColeccionDeObras> obrasExhibidas;

	//Constructor
	public Exposicion(){

	}
	public Exposicion(String nombre, Date fechaInicio, Date fechaFin) {
		this.nombre = nombre;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.obrasExhibidas = new ArrayList<>();
	}

	//Getters y Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Date getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}

	public List<ColeccionDeObras> getObrasExhibidas() {
		return obrasExhibidas;
	}

	public void setObrasExhibidas(List<ColeccionDeObras> obrasExhibidas) {
		this.obrasExhibidas = obrasExhibidas;
	}

	//Metodos
	public void agregarObraExhibida(ColeccionDeObras coleccionDeObra){
		this.obrasExhibidas.add(coleccionDeObra);
	}
}