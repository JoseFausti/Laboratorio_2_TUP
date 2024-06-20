package Clase_4.Clases.Ejercicio_11;

import java.util.Date;

public class Lider {

	//Atributos
	private String CUIT_CUIL;
	private String direccion;
	private Date fechaIncorporacion;
	private Date fechaNacimiento;
	private Date FechaPromocion;
	private String nombre;
	private String telefono;
	private Equipo equipo;

	//Constructor
	public Lider(){

	}
	public Lider(String CUIT_CUIL, String direccion, Date fechaIncorporacion, Date fechaNacimiento, Date fechaPromocion, String nombre, String telefono) {
		this.CUIT_CUIL = CUIT_CUIL;
		this.direccion = direccion;
		this.fechaIncorporacion = fechaIncorporacion;
		this.fechaNacimiento = fechaNacimiento;
		FechaPromocion = fechaPromocion;
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

	public Date getFechaPromocion() {
		return FechaPromocion;
	}

	public void setFechaPromocion(Date fechaPromocion) {
		FechaPromocion = fechaPromocion;
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
}