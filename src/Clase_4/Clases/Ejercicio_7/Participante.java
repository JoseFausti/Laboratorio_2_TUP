package Clase_4.Clases.Ejercicio_7;
public  class Participante {

	//Atributos
	private  String  dni;
	private int edad;
	private  String  fechaNacimiento;
	private  String  nombre;

	//Constructor
	public Participante(String dni, int edad, String fechaNacimiento, String nombre) {
		this.dni = dni;
		this.edad = edad;
		this.fechaNacimiento = fechaNacimiento;
		this.nombre = nombre;
	}

	//Getter y Setter
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}