package Clase_4.Clases.Ejercicio_10;

import java.util.List;

public class ComplejoPolideportivo extends ComplejoDeportivo {

	//Atributos
	private String informacionDeportes;

	//Constructor
	public ComplejoPolideportivo(){

	}
	public ComplejoPolideportivo(String areaOcupada, String jefeDeOrganizacion, String localizacion, List<AreaDesignada> areasDesignadas, String informacionDeportes) {
		super(areaOcupada, jefeDeOrganizacion, localizacion, areasDesignadas);
		this.informacionDeportes = informacionDeportes;
	}

	//Getters y Setters
	public String getInformacionDeportes() {
		return informacionDeportes;
	}
	public void setInformacionDeportes(String informacionDeportes) {
		this.informacionDeportes = informacionDeportes;
	}
}