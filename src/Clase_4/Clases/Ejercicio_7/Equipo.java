package Clase_4.Clases.Ejercicio_7;
public class Equipo extends Participante {

	//Atributos
	private String codigo;
	private String entrenador;
	private Esquiador esquiadores[];
	private int numeroEsquiadores;

	//Constructor
	public Equipo(String dni, int edad, String fechaNacimiento, String nombre, String codigo, String entrenador, Esquiador[] esquiadores, int numeroEsquiadores) {
		super(dni, edad, fechaNacimiento, nombre);
		this.codigo = codigo;
		this.entrenador = entrenador;
		this.esquiadores = esquiadores;
		this.numeroEsquiadores = numeroEsquiadores;
	}

	//Getter y Setter
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