package Clase_4.Clases.Ejercicio_8;

import java.util.Date;

public class Servicio {
	private Array array;

	//Atributos
	private Date fecha;
	private int horas;
	private String [] tipoTrabajo;

	//Constructor
	public Servicio(Date fecha, int horas, String [] tipoTrabajo) {
		this.fecha = fecha;
		this.horas = horas;
		this.tipoTrabajo = tipoTrabajo;
	}

	//Getter y Setter
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public int getHoras() {
		return horas;
	}
	public void setHoras(int horas) {
		this.horas = horas;
	}

	public String [] getTipoTrabajo() {
		return tipoTrabajo;
	}
	public void setTipoTrabajo(String [] tipoTrabajo) {
		this.tipoTrabajo = tipoTrabajo;
	}

	//Metodo
	public void agregarTipoTrabajo(String trabajo){
		array.agregarElemento(tipoTrabajo,trabajo);
	}
}