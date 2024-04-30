package Clase_4.Clases.Ejercicio_8;

public class Aerodromo {
	private Array array = new Array();

	//Atributos
	private Avion aviones[];
	private Hangar hangares[];
	private Mecanico mecanicos[];
	private Persona personas[];
	private Piloto pilotos[];

	//Constructor
	public Aerodromo(Avion[] aviones, Hangar[] hangares, Mecanico[] mecanicos, Persona[] personas, Piloto[] pillotos) {
		this.aviones = aviones;
		this.hangares = hangares;
		this.mecanicos = mecanicos;
		this.personas = personas;
		this.pilotos = pillotos;
	}

	//Getter y Setter
	public Avion[] getAviones() {
		return aviones;
	}
	public void setAviones(Avion[] aviones) {
		this.aviones = aviones;
	}

	public Hangar[] getHangares() {
		return hangares;
	}
	public void setHangares(Hangar[] hangares) {
		this.hangares = hangares;
	}

	public Mecanico[] getMecanicos() {
		return mecanicos;
	}
	public void setMecanicos(Mecanico[] mecanicos) {
		this.mecanicos = mecanicos;
	}

	public Persona[] getPersonas() {
		return personas;
	}
	public void setPersonas(Persona[] personas) {
		this.personas = personas;
	}

	public Piloto[] getPilotos() {
		return pilotos;
	}
	public void setPilotos(Piloto[] pilotos) {
		this.pilotos = pilotos;
	}


	//Metodos
	public void agregarAvion(Avion avion){
		array.agregarElemento(aviones,avion);
	}


	public void agregarHangar(Hangar hangar){
		array.agregarElemento(hangares,hangar);
	}


	public void agregarMecanico(Mecanico mecanico){
		array.agregarElemento(mecanicos,mecanico);
	}

	public void agregarPersona(Persona persona){
		array.agregarElemento(personas,persona);
	}

	public void agregarPiloto(Piloto piloto){
		array.agregarElemento(pilotos,piloto);
	}

}