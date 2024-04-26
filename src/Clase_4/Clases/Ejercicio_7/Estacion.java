package Clase_4.Clases.Ejercicio_7;
public class Estacion {

	//Atributos
	private  String  codigo;
	private  String  contacto;
	private  String  direccion;
	private int kmEsquiables;
	private  String  nombre;
	private int numeroDePistas;
	private Pista pistas[];
	private  String  telefono;

	//Constructor
	public Estacion(String codigo, String contacto, String direccion, int kmEsquiables, String nombre, int numeroDePistas, Pista[] pistas, String telefono) {
		this.codigo = codigo;
		this.contacto = contacto;
		this.direccion = direccion;
		this.kmEsquiables = kmEsquiables;
		this.nombre = nombre;
		this.numeroDePistas = numeroDePistas;
		this.pistas = pistas;
		this.telefono = telefono;
	}

	//Getter y Setter
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getContacto() {
		return contacto;
	}
	public void setContacto(String contacto) {
		this.contacto = contacto;
	}

	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getKmEsquiables() {
		return kmEsquiables;
	}
	public void setKmEsquiables(int kmEsquiables) {
		this.kmEsquiables = kmEsquiables;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumeroDePistas() {
		return numeroDePistas;
	}
	public void setNumeroDePistas(int numeroDePistas) {
		this.numeroDePistas = numeroDePistas;
	}

	public Pista[] getPistas() {
		return pistas;
	}
	public void setPistas(Pista[] pistas) {
		this.pistas = pistas;
	}

	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
}