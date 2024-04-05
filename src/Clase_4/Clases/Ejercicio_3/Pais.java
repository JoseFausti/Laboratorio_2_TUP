package Clase_4.Clases.Ejercicio_3;
public class Pais {

	private long Id;
	private String Nombre;
	public Provincia m_Provincia;

	//Constructor
	public Pais(long id, String nombre, Provincia m_Provincia) {
		Id = id;
		Nombre = nombre;
		this.m_Provincia = m_Provincia;
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

	public Provincia getM_Provincia() {
		return m_Provincia;
	}
	public void setM_Provincia(Provincia m_Provincia) {
		this.m_Provincia = m_Provincia;
	}
}