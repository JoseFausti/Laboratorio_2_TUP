package Clase_4.Clases.Ejercicio_10;

import java.util.List;

public class ComplejoDeporteUnico extends ComplejoDeportivo {

	//Atributos
	private String informacionDeporte;

	//Constructor
	public ComplejoDeporteUnico(){

	}
	public ComplejoDeporteUnico(String areaOcupada, String jefeDeOrganizacion, String localizacion, List<AreaDesignada> areasDesignadas, String informacionDeporte) {
		super(areaOcupada, jefeDeOrganizacion, localizacion, areasDesignadas);
		this.informacionDeporte = informacionDeporte;
	}

	//Getters y Setters
	public String getInformacionDeporte() {
		return informacionDeporte;
	}

	public void setInformacionDeporte(String informacionDeporte) {
		this.informacionDeporte = informacionDeporte;
	}
}