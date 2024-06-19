package Clase_4.Clases.Ejercicio_9;
public class ObjetosColeccionPermanente extends PertenenciaAlMuseo{

	//Atributos
	private String fechaAdquisicion;
	private double coste;
	private TipoEstado tipoEstado;

	//Constructor
	public ObjetosColeccionPermanente(){

	}
	public ObjetosColeccionPermanente(String fechaAdquisicion, double coste, TipoEstado tipoEstado) {
		this.fechaAdquisicion = fechaAdquisicion;
		this.coste = coste;
		this.tipoEstado = tipoEstado;
	}

	//Getter y Setter
	public String getFechaAdquisicion() {
		return fechaAdquisicion;
	}

	public void setFechaAdquisicion(String fechaAdquisicion) {
		this.fechaAdquisicion = fechaAdquisicion;
	}

	public double getCoste() {
		return coste;
	}

	public void setCoste(double coste) {
		this.coste = coste;
	}

	public TipoEstado getTipoEstado() {
		return tipoEstado;
	}

	public void setTipoEstado(TipoEstado tipoEstado) {
		this.tipoEstado = tipoEstado;
	}
}