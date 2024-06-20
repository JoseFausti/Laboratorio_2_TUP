package Clase_4.Clases.Ejercicio_11;

import java.util.Date;
import java.util.List;

public class Cliente {

	//Atributos
	private String direccion;
	private Date fechaIngreso;
	private Date fechaNacimiento;
	private String nombre;
	private String telefono;
	private List <Venta> ventas;
	private Representante vendedor;

	//Constructor
	public Cliente(){

	}
	public Cliente(String direccion, Date fechaIngreso, Date fechaNacimiento, String nombre, String telefono, List<Venta> ventas, Representante vendedor) {
		this.direccion = direccion;
		this.fechaIngreso = fechaIngreso;
		this.fechaNacimiento = fechaNacimiento;
		this.nombre = nombre;
		this.telefono = telefono;
		this.ventas = ventas;
		this.vendedor = vendedor;
	}

	//Getter y Setter
	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Date getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public List<Venta> getVentas() {
		return ventas;
	}

	public void setVentas(List<Venta> ventas) {
		this.ventas = ventas;
	}

	public Representante getVendedor() {
		return vendedor;
	}

	public void setVendedor(Representante vendedor) {
		this.vendedor = vendedor;
	}

	public void obtenerHistorialCompras() {
		System.out.println("Historial de Compras del Cliente: " + nombre);
		for (Venta venta : ventas) {
			System.out.println("Fecha de Venta: " + venta.getFechaVenta());
			System.out.println("Producto: " + venta.getProducto().getNombre());
			System.out.println("Precio: " + venta.getPrecio());
			System.out.println("-------------------------");
		}
	}
}