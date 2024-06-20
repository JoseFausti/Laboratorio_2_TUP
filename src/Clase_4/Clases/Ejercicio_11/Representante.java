package Clase_4.Clases.Ejercicio_11;

import org.jetbrains.annotations.Nullable;

import java.util.Date;
import java.util.List;

public class Representante {

	//Atributos
	private String CUIT_CUIL;
	private String direccion;
	private Date fechaIncorporacion;
	private Date fechaNacimiento;
	@Nullable
	private Date fechaPromocionLider;
	private String nombre;
	private String telefono;
	private Equipo equipo;
	private List<Venta> ventas;
	private List<Cliente> clientes;
	private List<Comision> comisiones;

	//Constructor
	public Representante(){

	}
	public Representante(String CUIT_CUIL, String direccion, Date fechaIncorporacion, Date fechaNacimiento, @Nullable Date fechaPromocionLider, String nombre, String telefono) {
		this.CUIT_CUIL = CUIT_CUIL;
		this.direccion = direccion;
		this.fechaIncorporacion = fechaIncorporacion;
		this.fechaNacimiento = fechaNacimiento;
		this.fechaPromocionLider = fechaPromocionLider;
		this.nombre = nombre;
		this.telefono = telefono;
	}

	//Getters y Setters
	public String getCUIT_CUIL() {
		return CUIT_CUIL;
	}

	public void setCUIT_CUIL(String CUIT_CUIL) {
		this.CUIT_CUIL = CUIT_CUIL;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Date getFechaIncorporacion() {
		return fechaIncorporacion;
	}

	public void setFechaIncorporacion(Date fechaIncorporacion) {
		this.fechaIncorporacion = fechaIncorporacion;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Date getFechaPromocionLider() {
		return fechaPromocionLider;
	}

	public void setFechaPromocionLider(Date fechaPromocionLider) {
		this.fechaPromocionLider = fechaPromocionLider;
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

	public Equipo getEquipo() {
		return equipo;
	}

	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}

	public List<Venta> getVentas() {
		return ventas;
	}

	public void setVentas(List<Venta> ventas) {
		this.ventas = ventas;
	}

	public List<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}

	public List<Comision> getComisiones() {
		return comisiones;
	}

	public void setComisiones(List<Comision> comisiones) {
		this.comisiones = comisiones;
	}

	//Metodos
	public void obtenerDetalles() {
		System.out.println("Detalles del Representante:");
		System.out.println("Nombre: " + nombre);
		System.out.println("CUIT/CUIL: " + CUIT_CUIL);
		System.out.println("Dirección: " + direccion);
		System.out.println("Teléfono: " + telefono);
		System.out.println("Fecha de Nacimiento: " + fechaNacimiento);
		System.out.println("Fecha de Incorporación: " + fechaIncorporacion);
		if (fechaPromocionLider != null) {
			System.out.println("Fecha de Promoción a Líder: " + fechaPromocionLider);
		} else {
			System.out.println("No ha sido promovido a Líder.");
		}
		if (equipo != null) {
			System.out.println("Equipo: " + equipo.getNombre());
		} else {
			System.out.println("No pertenece a ningún equipo.");
		}
		System.out.println("Número de Ventas: " + (ventas != null ? ventas.size() : 0));
		System.out.println("Número de Clientes: " + (clientes != null ? clientes.size() : 0));
		System.out.println("Número de Comisiones: " + (comisiones != null ? comisiones.size() : 0));
	}

	public void notificar(Date nuevaFechaProximaReunion) {
		// Aquí puedes implementar la lógica para enviar un correo electrónico o un mensaje
		// Por simplicidad, imprimiremos un mensaje en la consola
		System.out.println("Notificación a " + nombre + ": La próxima reunión se ha programado para el " + nuevaFechaProximaReunion);
	}
}