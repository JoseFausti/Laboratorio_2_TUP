package Clase_4.Clases.Ejercicio_6;

import java.util.ArrayList;
import java.util.List;

public class Excursion {

	//Atributos
	private String codigo ;
	private String dia;
	private String hora;
	private List<PersonaVisitante> personas;

	//Constructor
	public Excursion(String codigo, String dia, String hora) {
		this.codigo = codigo;
		this.dia = dia;
		this.hora = hora;
		this.personas = new ArrayList<>();
	}

	//Getter y Setter
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDia() {
		return dia;
	}
	public void setDia(String dia) {
		this.dia = dia;
	}

	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}

	public List<PersonaVisitante> getPersonas() {
		return personas;
	}
	public void setPersonas(List<PersonaVisitante> personas) {
		this.personas = personas;
	}
}