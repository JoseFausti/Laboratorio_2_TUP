package Clase_4.Clases.Ejercicio_6;

import java.util.List;

public class EspecieAnimal extends Especie { //Herencia

	//Atributos
	private String periodoCelo;
	private TipoAlimentacion alimentacion;
	private List<Especie> alimentos;

	//Constructor
	public EspecieAnimal(String nombreCientifico, String nombreVulgar, int cantidadIndividuos, tipoEspecie especie_, String periodoCelo, TipoAlimentacion alimentacion, List<Especie> alimentos) {
		super(nombreCientifico, nombreVulgar, cantidadIndividuos, especie_);
		this.periodoCelo = periodoCelo;
		this.alimentacion = alimentacion;
		this.alimentos = alimentos;
	}

	//Getter y Setter
	public String getPeriodoCelo() {
		return periodoCelo;
	}
	public void setPeriodoCelo(String periodoCelo) {
		this.periodoCelo = periodoCelo;
	}

	public TipoAlimentacion getAlimentacion() {
		return alimentacion;
	}
	public void setAlimentacion(TipoAlimentacion alimentacion) {
		this.alimentacion = alimentacion;
	}

	public List<Especie> getAlimentos() {
		return alimentos;
	}
	public void setAlimentos(List<Especie> alimentos) {
		this.alimentos = alimentos;
	}
}