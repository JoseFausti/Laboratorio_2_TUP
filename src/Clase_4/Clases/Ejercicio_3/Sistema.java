package Clase_4.Clases.Ejercicio_3;
public class Sistema {

	public Gasto gastos;
	public Impuesto impuesto;

	//Constructor
	public Sistema(Gasto gastos, Impuesto impuesto) {
		this.gastos = gastos;
		this.impuesto = impuesto;
	}

	//Getter y Setter
	public Gasto getGastos() {
		return gastos;
	}
	public void setGastos(Gasto gastos) {
		this.gastos = gastos;
	}

	public Impuesto getImpuesto() {
		return impuesto;
	}
	public void setImpuesto(Impuesto impuesto) {
		this.impuesto = impuesto;
	}

	//Metodos
	public void CalcularDeficit(){

	}
	public void InformeDeProvinciaConCiudad(){

	}
}