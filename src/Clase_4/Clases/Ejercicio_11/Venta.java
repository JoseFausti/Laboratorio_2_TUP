package Clase_4.Clases.Ejercicio_11;

import java.util.Date;

public class Venta {

	//Atributos
	private Date fechaVenta;
	private double precio;
	private Producto producto;
	private Cliente cliente;
	private Representante representante;

	//Constructor
	public Venta(){

	}
	public Venta(Date fechaVenta, double precio, Producto producto, Cliente cliente, Representante representante) {
		this.fechaVenta = fechaVenta;
		this.precio = precio;
		this.producto = producto;
		this.cliente = cliente;
		this.representante = representante;
	}

	//Getters y Setters
	public Date getFechaVenta() {
		return fechaVenta;
	}

	public void setFechaVenta(Date fechaVenta) {
		this.fechaVenta = fechaVenta;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Representante getRepresentante() {
		return representante;
	}

	public void setRepresentante(Representante representante) {
		this.representante = representante;
	}

	//Metodos
	public void obtenerDetallesVenta() {
		System.out.println("Detalles de la Venta:");
		System.out.println("Fecha de Venta: " + fechaVenta);
		System.out.println("Precio: " + precio);
		if (producto != null) {
			System.out.println("Producto: " + producto.getNombre());
		}
		if (cliente != null) {
			System.out.println("Cliente: " + cliente.getNombre() + ", Dirección: " + cliente.getDireccion() + ", Teléfono: " + cliente.getTelefono());
		}
		if (representante != null) {
			System.out.println("Representante: " + representante.getNombre());
		}
	}
}