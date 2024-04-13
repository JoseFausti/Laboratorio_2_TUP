package Clase_4.Clases.Ejercicio_5;

import java.util.ArrayList;
import java.util.List;

public class Restaurante {

	//Atributos
	private String nombre;
	private List<TipoPlatos> platosServidos;
	private List<Sucursal> sucursales;

	//Constructor
	public Restaurante(String nombre,List<Sucursal>sucursales) {
		this.nombre = nombre;
		this.platosServidos = new ArrayList<>();
		this.sucursales = new ArrayList<>(sucursales);//Relacion de Compocision
	}

	//Getter y Setter
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<TipoPlatos> getPlatosServidos() {
		return platosServidos;
	}
	public void setPlatosServidos(List<TipoPlatos> platosServidos) {
		this.platosServidos = platosServidos;
	}

	public List<Sucursal> getSucursales() {
		return sucursales;
	}
	public void setSucursales(List<Sucursal> sucursales) {
		this.sucursales = sucursales;
	}

	//Metodos
	public void AgregarPlato(TipoPlatos plato){
		this.platosServidos.add(plato);
	}
}