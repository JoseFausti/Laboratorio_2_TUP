package Clase_4.Clases.Ejercicio_8;

import java.util.Set;

public class Mecanico {

	//Atributos
	private double salario;
	private Set<TipoAvion> tiposAvionAutorizados;
	private String turno;

	//Constructor
	public Mecanico(double salario, Set<TipoAvion> tiposAvionAutorizados, String turno) {
		this.salario = salario;
		this.tiposAvionAutorizados = tiposAvionAutorizados;
		this.turno = turno;
	}

	//Getter y Setter
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}

	public Set<TipoAvion> getTiposAvionAutorizados() {
		return tiposAvionAutorizados;
	}
	public void setTiposAvionAutorizados(Set<TipoAvion> tiposAvionAutorizados) {
		this.tiposAvionAutorizados = tiposAvionAutorizados;
	}

	public String getTurno() {
		return turno;
	}
	public void setTurno(String turno) {
		this.turno = turno;
	}
}