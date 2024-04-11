package Clase_4.Clases.Ejercicio_3;

public class Impuesto2 extends Impuesto {

	// Constructor
	public Impuesto2(float montoRecaudado) {
		super(montoRecaudado);
	}

	// Método
	public double CalcularImpuesto() {
		return 0.15 * getMontoRecaudado();
	}
}
