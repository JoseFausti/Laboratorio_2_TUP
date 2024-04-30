package Clase_4.Clases.Ejercicio_8;

import java.util.Set;

public class Piloto {

	//Atributos
	private String numeroLicencia;
	private String restricciones;
	private Set<TipoAvion> tiposAvionAutorizados;

	//Constructor
	public Piloto(String numeroLicencia, String restricciones, Set<TipoAvion> tiposAvionAutorizados) {
		this.numeroLicencia = numeroLicencia;
		this.restricciones = restricciones;
		this.tiposAvionAutorizados = tiposAvionAutorizados;
	}

	//Getter y Setter
	public String getNumeroLicencia() {
		return numeroLicencia;
	}
	public void setNumeroLicencia(String numeroLicencia) {
		this.numeroLicencia = numeroLicencia;
	}

	public String getRestricciones() {
		return restricciones;
	}
	public void setRestricciones(String restricciones) {
		this.restricciones = restricciones;
	}

	public Set<TipoAvion> getTiposAvionAutorizados() {
		return tiposAvionAutorizados;
	}
	public void setTiposAvionAutorizados(Set<TipoAvion> tiposAvionAutorizados) {
		this.tiposAvionAutorizados = tiposAvionAutorizados;
	}
}