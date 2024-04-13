package Clase_4.Clases.Ejercicio_6;

import java.util.ArrayList;
import java.util.List;

public class Entrada {

	//Atributos
	private List<Celador> celadores;
	private String fechaVisita;
	private static int numeroEntrada;
	private List<PersonaVisitante> visitantes;

	//Constructor
	public Entrada(String fechaVisita) {
		this.fechaVisita = fechaVisita;
		this.visitantes = new ArrayList<>();
		this.celadores = new ArrayList<>();
	}

	//Getter y Setter
	public List<Celador> getCeladores() {
		return celadores;
	}
	public void setCeladores(List<Celador> celadores) {
		this.celadores = celadores;
	}

	public String getFechaVisita() {
		return fechaVisita;
	}
	public void setFechaVisita(String fechaVisita) {
		this.fechaVisita = fechaVisita;
	}

	public static int getNumeroEntrada() {
		return numeroEntrada;
	}
	public static void setNumeroEntrada(int numeroEntrada) {
		Entrada.numeroEntrada = numeroEntrada;
	}

	public List<PersonaVisitante> getVisitantes() {
		return visitantes;
	}
	public void setVisitantes(List<PersonaVisitante> visitantes) {
		this.visitantes = visitantes;
	}
}