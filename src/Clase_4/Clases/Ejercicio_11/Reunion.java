package Clase_4.Clases.Ejercicio_11;

import java.util.Date;

public class Reunion {

	//Atributos
	private Date fechaProximaReunion;
	private Date fechaUltimaReunion;
	private EmpresaCosmetica empresaCosmetica;

	//Constructor
	public Reunion(){

	}
	public Reunion(Date fechaProximaReunion, Date fechaUltimaReunion) {
		this.fechaProximaReunion = fechaProximaReunion;
		this.fechaUltimaReunion = fechaUltimaReunion;
	}

	//Getters y Setters
	public Date getFechaProximaReunion() {
		return fechaProximaReunion;
	}

	public void setFechaProximaReunion(Date fechaProximaReunion) {
		this.fechaProximaReunion = fechaProximaReunion;
	}

	public Date getFechaUltimaReunion() {
		return fechaUltimaReunion;
	}

	public void setFechaUltimaReunion(Date fechaUltimaReunion) {
		this.fechaUltimaReunion = fechaUltimaReunion;
	}

	public EmpresaCosmetica getEmpresaCosmetica() {
		return empresaCosmetica;
	}

	public void setEmpresaCosmetica(EmpresaCosmetica empresaCosmetica) {
		this.empresaCosmetica = empresaCosmetica;
	}

	//Metodos
	public void programarReunion(Date nuevaFechaProximaReunion) {
		// Actualizar la fecha de la última reunión a la fecha de la próxima reunión actual
		this.fechaUltimaReunion = this.fechaProximaReunion;
		// Programar la nueva fecha de la próxima reunión
		this.fechaProximaReunion = nuevaFechaProximaReunion;

		// Opcionalmente, podrías añadir lógica para notificar a los representantes sobre la nueva reunión.
		if (empresaCosmetica != null) {
			empresaCosmetica.notificarRepresentantes(nuevaFechaProximaReunion);
		}
	}

}