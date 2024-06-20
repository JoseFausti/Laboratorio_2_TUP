package Clase_4.Clases.Ejercicio_10;

import java.util.ArrayList;
import java.util.List;

public class ComplejoDeportivo {

	//Atributos
	private String areaOcupada;
	private String jefeDeOrganizacion;
	private String localizacion;
	private List<Evento> serieDeEventos;
	private List<AreaDesignada> areasDesignadas;

	//Constructor
	public ComplejoDeportivo() {
		this.serieDeEventos = new ArrayList<>();
		this.areasDesignadas = new ArrayList<>();
	}

	public ComplejoDeportivo(String areaOcupada, String jefeDeOrganizacion, String localizacion, List<AreaDesignada> areasDesignadas) {
		this.areaOcupada = areaOcupada;
		this.jefeDeOrganizacion = jefeDeOrganizacion;
		this.localizacion = localizacion;
		this.serieDeEventos = new ArrayList<>();
		this.areasDesignadas = new ArrayList<>(areasDesignadas);
	}

	//Getters y Setters
	public String getAreaOcupada() {
		return areaOcupada;
	}

	public void setAreaOcupada(String areaOcupada) {
		this.areaOcupada = areaOcupada;
	}

	public String getJefeDeOrganizacion() {
		return jefeDeOrganizacion;
	}

	public void setJefeDeOrganizacion(String jefeDeOrganizacion) {
		this.jefeDeOrganizacion = jefeDeOrganizacion;
	}

	public String getLocalizacion() {
		return localizacion;
	}

	public void setLocalizacion(String localizacion) {
		this.localizacion = localizacion;
	}

	public List<Evento> getSerieDeEventos() {
		return serieDeEventos;
	}

	public void setSerieDeEventos(List<Evento> serieDeEventos) {
		this.serieDeEventos = serieDeEventos;
	}

	public List<AreaDesignada> getAreasDesignadas() {
		return areasDesignadas;
	}

	public void setAreasDesignadas(List<AreaDesignada> areasDesignadas) {
		this.areasDesignadas = areasDesignadas;
	}

	//Metodos
	public void agregarEventos(Evento evento) {
		this.serieDeEventos.add(evento);
	}
}
