package Clase_4.Clases.Ejercicio_6;
public class PersonaVisitante {

	//Atributos
	private String nombre;
	private String dni;
	private String direccion;
	private String profesion;

	//Constructor
	public PersonaVisitante(String nombre, String dni, String direccion, String profesion) {
		this.nombre = nombre;
		this.dni = dni;
		this.direccion = direccion;
		this.profesion = profesion;
	}

	//Getter y Setter
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getProfesion() {
		return profesion;
	}
	public void setProfesion(String profesion) {
		this.profesion = profesion;
	}
}