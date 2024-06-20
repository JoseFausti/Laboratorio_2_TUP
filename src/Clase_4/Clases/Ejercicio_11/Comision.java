package Clase_4.Clases.Ejercicio_11;

import java.util.Date;

public class Comision {

	//Atributos
	private Date fechaComision;
	private double monto;
	private Representante representante;

	//Constructor
	public Comision(){

	}
	public Comision(Date fechaComision, double monto) {
		this.fechaComision = fechaComision;
		this.monto = monto;
	}

	//Getters y Setters
	public Date getFechaComision() {
		return fechaComision;
	}

	public void setFechaComision(Date fechaComision) {
		this.fechaComision = fechaComision;
	}

	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}

	public Representante getRepresentante() {
		return representante;
	}

	public void setRepresentante(Representante representante) {
		this.representante = representante;
	}

	public void calcularComision() {
		// Ejemplo básico de cálculo de comisión
		// Como no hay detalles específicos, vamos a imprimir un mensaje genérico.
		System.out.println("Calculando comisión para el representante " + representante.getNombre() + "...");
		System.out.println("Monto de la comisión calculado: $" + monto);
	}

}