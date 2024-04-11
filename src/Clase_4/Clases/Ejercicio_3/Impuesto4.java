package Clase_4.Clases.Ejercicio_3;

public class Impuesto4 extends Impuesto {

	// Constructor
	public Impuesto4(float montoRecaudado) {
		super(montoRecaudado);
	}

	// Método
	public double CalcularImpuesto() {
		return 0.25 * getMontoRecaudado();
	}
}
