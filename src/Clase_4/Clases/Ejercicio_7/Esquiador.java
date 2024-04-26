package Clase_4.Clases.Ejercicio_7;
public class Esquiador extends Participante {

	//Atributos
	private int dorsal;
	private Federacion federacion;

	//Constructor
	public Esquiador(String dni, int edad, String fechaNacimiento, String nombre, int dorsal, Federacion federacion) {
		super(dni, edad, fechaNacimiento, nombre);
		this.dorsal = dorsal;
		this.federacion = federacion;
	}

	//Getter y Setter
	public int getDorsal() {
		return dorsal;
	}
	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public Federacion getFederacion() {
		return federacion;
	}
	public void setFederacion(Federacion federacion) {
		this.federacion = federacion;
	}
}