package Clase_4.Clases.Ejercicio_3;

public class Impuesto1 extends Impuesto {

	// Constructor
	public Impuesto1(float montoRecaudado) {
		super(montoRecaudado);
	}

	// Método
	public double CalcularImpuesto() {
		return 0.1 * getMontoRecaudado();
	}
}
