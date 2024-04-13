package Clase_4.Clases.Ejercicio_6;
public class Especie {

	//Atributos
	private int cantidadIndividuos;
	private tipoEspecie especie_;
	private String nombreCientifico;
	private String nombreVulgar;

	//Constructor
	public Especie(String nombreCientifico, String nombreVulgar,int cantidadIndividuos, tipoEspecie especie_) {
		this.nombreVulgar = nombreVulgar;
		this.nombreCientifico = nombreCientifico;
		this.cantidadIndividuos = cantidadIndividuos;
		this.especie_ = especie_;
	}

	//Getter y Setter
	public int getCantidadIndividuos() {
		return cantidadIndividuos;
	}
	public void setCantidadIndividuos(int cantidadIndividuos) {
		this.cantidadIndividuos = cantidadIndividuos;
	}

	public tipoEspecie getEspecie_() {
		return especie_;
	}
	public void setEspecie_(tipoEspecie especie_) {
		this.especie_ = especie_;
	}

	public String getNombreCientifico() {
		return nombreCientifico;
	}
	public void setNombreCientifico(String nombreCientifico) {
		this.nombreCientifico = nombreCientifico;
	}

	public String getNombreVulgar() {
		return nombreVulgar;
	}
	public void setNombreVulgar(String nombreVulgar) {
		this.nombreVulgar = nombreVulgar;
	}
}