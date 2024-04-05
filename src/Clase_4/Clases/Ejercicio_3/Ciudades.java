package Clase_4.Clases.Ejercicio_3;
public class Ciudades {

	private int CantHabitantes;
	private int CodigoPostal;
	private long Id;
	private String Nombre;
	public Impuesto Impuesto;

	//Constructor
	public Ciudades(int cantHabitantes, int codigoPostal, long id, String nombre, Impuesto impuesto) {
		this.CantHabitantes = cantHabitantes;
		this.CodigoPostal = codigoPostal;
		this.Id = id;
		this.Nombre = nombre;
		this.Impuesto = impuesto;
	}

	//Getter y Setter
	public int getCantHabitantes() {
		return this.CantHabitantes;
	}
	public void setCantHabitantes(int cantHabitantes) {
		this.CantHabitantes = cantHabitantes;
	}

	public int getCodigoPostal() {
		return this.CodigoPostal;
	}
	public void setCodigoPostal(int codigoPostal) {
		this.CodigoPostal = codigoPostal;
	}

	public long getId() {
		return this.Id;
	}
	public void setId(long id) {
		this.Id = id;
	}

	public String getNombre() {
		return this.Nombre;
	}
	public void setNombre(String nombre) {
		this.Nombre = nombre;
	}

	public Impuesto getImpuesto() {
		return this.Impuesto;
	}
	public void setImpuesto(Impuesto impuesto) {
		this.Impuesto = impuesto;
	}
}