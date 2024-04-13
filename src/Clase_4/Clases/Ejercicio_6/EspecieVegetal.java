package Clase_4.Clases.Ejercicio_6;
public class EspecieVegetal extends Especie {

	//Atributos
	private String periodoFloracion;
	private boolean floracion;

	//Constructor
	public EspecieVegetal(String nombreCientifico, String nombreVulgar, int cantidadIndividuos, tipoEspecie especie_,String periodoFloracion,boolean floracion) {
		super(nombreCientifico, nombreVulgar, cantidadIndividuos, especie_);
		this.periodoFloracion = periodoFloracion;
		this.floracion = floracion;
	}

	//Getter y Setter
	public String getPeriodoFloracion() {
		return periodoFloracion;
	}
	public void setPeriodoFloracion(String periodoFloracion) {
		this.periodoFloracion = periodoFloracion;
	}

	public boolean isFloracion() {
		return floracion;
	}
	public void setFloracion(boolean floracion) {
		this.floracion = floracion;
	}
}