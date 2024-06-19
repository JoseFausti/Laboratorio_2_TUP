package Clase_4.Clases.Ejercicio_9;
public class Escultura extends Tipo{

	//Atributos
	private String estilo;
	private double altura;
	private double peso;
	private TipoMaterial tipoMaterial;

	//Constructor
	public Escultura(){

	}
	public Escultura(String estilo, double altura, double peso, TipoMaterial tipoMaterial) {
		this.estilo = estilo;
		this.altura = altura;
		this.peso = peso;
		this.tipoMaterial = tipoMaterial;
	}

	//Getter y Setter
	public String getEstilo() {
		return estilo;
	}

	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public TipoMaterial getTipoMaterial() {
		return tipoMaterial;
	}

	public void setTipoMaterial(TipoMaterial tipoMaterial) {
		this.tipoMaterial = tipoMaterial;
	}
}