package Clase_4.Clases.Ejercicio_3;

public class Impuesto3 extends Impuesto {

	// Constructor
	public Impuesto3(float montoRecaudado) {
		super(montoRecaudado);
	}

	// Método
	public double CalcularImpuesto() {
		return 0.2 * getMontoRecaudado();
	}
}
