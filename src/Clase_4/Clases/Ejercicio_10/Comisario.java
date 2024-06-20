package Clase_4.Clases.Ejercicio_10;

import java.util.ArrayList;
import java.util.List;

public class Comisario {

	//Atributos
	private List<Evento> eventosInvolucrado;

	//Constructor
	public Comisario() {
		this.eventosInvolucrado = new ArrayList<>();
	}

	public Comisario(List<Evento> eventosInvolucrado) {
		this.eventosInvolucrado = new ArrayList<Evento>(eventosInvolucrado);
	}

	//Getters y Setters
	public List<Evento> getEventosInvolucrado() {
		return eventosInvolucrado;
	}

	public void setEventosInvolucrado(List<Evento> eventosInvolucrado) {
		this.eventosInvolucrado = eventosInvolucrado;
	}

	//Metodos
	public void agregarEvento(Evento evento) {
		this.eventosInvolucrado.add(evento);
	}
}
