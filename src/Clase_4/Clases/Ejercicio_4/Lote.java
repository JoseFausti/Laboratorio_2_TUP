package Clase_4.Clases.Ejercicio_4;

import java.util.ArrayList;
import java.util.List;

public class Lote {

	//Atributos
	private List<Mineral> minerales;
	private List<Cereal> cereales;
	private TipoLote tipo;

	//Constructor
	public Lote(List<Mineral> minerales, TipoLote tipo) {
		this.minerales = new ArrayList<>();
		this.cereales = new ArrayList<>();
		this.tipo = tipo;
	}

	//Getter y Setter
	public List<Mineral> getMinerales() {
		return minerales;
	}
	public void setMinerales(List<Mineral> minerales) {
		this.minerales = minerales;
	}

	public TipoLote getTipo() {
		return tipo;
	}
	public void setTipo(TipoLote tipo) {
		this.tipo = tipo;
	}

	public List<Cereal> getCereales() {
		return cereales;
	}
	public void setCereales(List<Cereal> cereales) {
		this.cereales = cereales;
	}
}