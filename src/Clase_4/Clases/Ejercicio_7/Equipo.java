package Clase_4.Clases.Ejercicio_7;
public class Equipo{

	//Atributos
	private String nombre;
	private String codigo;
	private String entrenador;
	private Esquiador esquiadores[];
	private int numeroEsquiadores;

	//Constructor
	public Equipo(String nombre,String codigo, String entrenador, Esquiador[] esquiadores, int numeroEsquiadores) {
		this.nombre = nombre;
		this.codigo = codigo;
		this.entrenador = entrenador;
		this.esquiadores = esquiadores;
		this.numeroEsquiadores = numeroEsquiadores;
	}

	//Getter y Setter
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getEntrenador() {
		return entrenador;
	}
	public void setEntrenador(String entrenador) {
		this.entrenador = entrenador;
	}

	public Esquiador[] getEsquiadores() {
		return esquiadores;
	}
	public void setEsquiadores(Esquiador[] esquiadores) {
		this.esquiadores = esquiadores;
	}

	public int getNumeroEsquiadores() {
		return numeroEsquiadores;
	}
	public void setNumeroEsquiadores(int numeroEsquiadores) {
		this.numeroEsquiadores = numeroEsquiadores;
	}
}