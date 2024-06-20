package Clase_4.Clases.Ejercicio_11;

import java.util.List;

public class Producto {

	//Atributos
	private String nombre;
	private double precio;
	private List<Venta> ventas;

	//Constructor
	public Producto(){

	}
	public Producto(String nombre, double precio, List<Venta> ventas) {
		this.nombre = nombre;
		this.precio = precio;
		this.ventas = ventas;
	}

	//Getters y Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public List<Venta> getVentas() {
		return ventas;
	}

	public void setVentas(List<Venta> ventas) {
		this.ventas = ventas;
	}
}