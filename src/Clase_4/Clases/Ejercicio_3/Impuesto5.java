package Clase_4.Clases.Ejercicio_3;

public class Impuesto5 extends Impuesto {

	// Constructor
	public Impuesto5(float montoRecaudado) {
		super(montoRecaudado);
	}

	// Método
	public double CalcularImpuesto() {
		return 0.3 * getMontoRecaudado();
	}
}
