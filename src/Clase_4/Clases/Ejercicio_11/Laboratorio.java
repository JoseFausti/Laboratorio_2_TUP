package Clase_4.Clases.Ejercicio_11;

import java.util.List;

public class Laboratorio {

	//Atrbutos
	private String nombre;
	private int sector;
	private List<Producto> productos;

	//Constructor
	public Laboratorio(){

	}
	public Laboratorio(String nombre, int sector, List<Producto> productos) {
		this.nombre = nombre;
		this.sector = sector;
		this.productos = productos;
	}

	//Getters y Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getSector() {
		return sector;
	}

	public void setSector(int sector) {
		this.sector = sector;
	}

	public List<Producto> getProductos() {
		return productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}

	//Metodos
	public void agregarProductos(Producto producto){
		this.productos.add(producto);
	}
}