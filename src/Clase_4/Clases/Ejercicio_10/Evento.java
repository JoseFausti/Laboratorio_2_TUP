package Clase_4.Clases.Ejercicio_10;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Evento {

	//Atributos
	private String duracion;
	private Date fecha;
	private TipoMaterial materialNecesario;
	private int numeroComisarios;
	private int numeroParticipantes;
	private List<Comisario> comisarios;

	//Constructor
	public Evento() {
		this.comisarios = new ArrayList<>();
	}
	public Evento(String duracion, Date fecha, TipoMaterial materialNecesario, int numeroComisarios, int numeroParticipantes) {
		this.duracion = duracion;
		this.fecha = fecha;
		this.materialNecesario = materialNecesario;
		this.numeroComisarios = numeroComisarios;
		this.numeroParticipantes = numeroParticipantes;
		this.comisarios = new ArrayList<>();
		crearComisarios();
	}

	//Getters y Setters
	public String getDuracion() {
		return duracion;
	}

	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public TipoMaterial getMaterialNecesario() {
		return materialNecesario;
	}

	public void setMaterialNecesario(TipoMaterial materialNecesario) {
		this.materialNecesario = materialNecesario;
	}

	public int getNumeroComisarios() {
		return numeroComisarios;
	}

	public void setNumeroComisarios(int numeroComisarios) {
		this.numeroComisarios = numeroComisarios;
	}

	public int getNumeroParticipantes() {
		return numeroParticipantes;
	}

	public void setNumeroParticipantes(int numeroParticipantes) {
		this.numeroParticipantes = numeroParticipantes;
	}

	public List<Comisario> getComisarios() {
		return comisarios;
	}

	//Metodos
	private void crearComisarios() {
		for (int i = 0; i < numeroComisarios; i++) {
			Comisario comisario = new Comisario();
			comisarios.add(comisario);
		}
	}
}
