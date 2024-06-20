package Clase_4.Clases.Ejercicio_11;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EmpresaCosmetica {

	//Atributos
	private String nombre;
	private List<Reunion> reuniones;
	private List<Laboratorio> laboratorios;
	private List<Representante> representantes;

	//Constructor
	public EmpresaCosmetica(){

	}
	public EmpresaCosmetica(String nombre, List<Laboratorio> laboratorios) {
		this.nombre = nombre;
		this.reuniones = new ArrayList<>();
		this.representantes = new ArrayList<>();
		this.laboratorios = laboratorios;
	}

	//Getters y Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Reunion> getReuniones() {
		return reuniones;
	}

	public void setReuniones(List<Reunion> reuniones) {
		this.reuniones = reuniones;
	}

	public List<Laboratorio> getLaboratorios() {
		return laboratorios;
	}

	public void setLaboratorios(List<Laboratorio> laboratorios) {
		this.laboratorios = laboratorios;
	}

	public List<Representante> getRepresentantes() {
		return representantes;
	}

	public void setRepresentantes(List<Representante> representantes) {
		this.representantes = representantes;
	}

	//Metodos
	public void notificarRepresentantes(Date nuevaFechaProximaReunion) {
		for (Representante representante : representantes) {
			representante.notificar(nuevaFechaProximaReunion);
		}
	}
	public void agregarRepresentantes(Representante vendedor){
		this.representantes.add(vendedor);
	}
	public void agregarLaboratorio(Laboratorio laboratorio){
		this.laboratorios.add(laboratorio);
	}
}