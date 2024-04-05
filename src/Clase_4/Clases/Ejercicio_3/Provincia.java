package Clase_4.Clases.Ejercicio_3;
public class Provincia {

	private long Id;
	private String Nombre;
	public Ciudades m_Ciudades;

	//Constructor
	public Provincia(long id, String nombre, Ciudades m_Ciudades) {
		Id = id;
		Nombre = nombre;
		this.m_Ciudades = m_Ciudades;
	}

	//Getter y Setter
	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
	}

	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public Ciudades getM_Ciudades() {
		return m_Ciudades;
	}
	public void setM_Ciudades(Ciudades m_Ciudades) {
		this.m_Ciudades = m_Ciudades;
	}
}