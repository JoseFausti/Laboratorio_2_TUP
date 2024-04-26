package Clase_4.Clases.Ejercicio_7;
public class Prueba {

	//Atributos
	private String fecha;
	private String nombre;
	private Participante participantes[];
	private int tiempoVencedor;
	private TipoPrueba tipo;

	//Constructor
	public Prueba(String fecha, String nombre, Participante[] participantes, int tiempoVencedor, TipoPrueba tipo) {
		this.fecha = fecha;
		this.nombre = nombre;
		this.participantes = participantes;
		this.tiempoVencedor = tiempoVencedor;
		this.tipo = tipo;
	}

	//Getter y Setter
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Participante[] getParticipantes() {
		return participantes;
	}
	public void setParticipantes(Participante[] participantes) {
		this.participantes = participantes;
	}

	public int getTiempoVencedor() {
		return tiempoVencedor;
	}
	public void setTiempoVencedor(int tiempoVencedor) {
		this.tiempoVencedor = tiempoVencedor;
	}

	public TipoPrueba getTipo() {
		return tipo;
	}
	public void setTipo(TipoPrueba tipo) {
		this.tipo = tipo;
	}
}