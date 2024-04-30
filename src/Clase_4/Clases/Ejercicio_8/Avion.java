package Clase_4.Clases.Ejercicio_8;

import java.util.Date;
import java.util.Map;

public class Avion {
	private Array array;

	//Atributos
	private Persona propietario;
	private String numeroMatricula;
	private TipoAvion tipo;
	private Date fechaAdquisicion;
	private Hangar hangar;
	private Map<Date,Servicio> servicios;

	//Constructor
	public Avion(Persona propietario, String numeroMatricula, TipoAvion tipo, Date fechaAdquisicion, Hangar hangar, Map<Date, Servicio> servicios) {
		this.propietario = propietario;
		this.numeroMatricula = numeroMatricula;
		this.tipo = tipo;
		this.fechaAdquisicion = fechaAdquisicion;
		this.hangar = hangar;
		this.servicios = servicios;
	}

	//Getter y Setter
	public Date getFechaAdquisicion() {
		return fechaAdquisicion;
	}
	public void setFechaAdquisicion(Date fechaAdquisicion) {
		this.fechaAdquisicion = fechaAdquisicion;
	}

	public Hangar getHangar() {
		return hangar;
	}
	public void setHangar(Hangar hangar) {
		this.hangar = hangar;
	}

	public String getNumeroMatricula() {
		return numeroMatricula;
	}
	public void setNumeroMatricula(String numeroMatricula) {
		this.numeroMatricula = numeroMatricula;
	}

	public Persona getPropietario() {
		return propietario;
	}
	public void setPropietario(Persona propietario) {
		this.propietario = propietario;
	}

	public Map<Date, Servicio> getServicios() {
		return servicios;
	}
	public void setServicios(Map<Date, Servicio> servicios) {
		this.servicios = servicios;
	}

	public TipoAvion getTipo() {
		return tipo;
	}
	public void setTipo(TipoAvion tipo) {
		this.tipo = tipo;
	}


	//Metodo
	public void realizarServicio(String [] tipo, int horas, Date fecha){

		Servicio servicio = new Servicio(fecha,horas,tipo);

		if (!servicios.containsKey(fecha)){
			servicios.put(fecha,servicio);
			System.out.println("Servicio agregado para el dia: " + servicios.get(fecha));
		}
		if (servicios.containsKey(fecha) && !servicios.containsValue(servicio)){
			if (servicios.get(fecha).equals(servicio.getFecha())) {
				servicios.remove(fecha, servicio);
				servicios.put(fecha,servicio);
				System.out.println("Servicio agregado para el dia: " + servicios.get(fecha));
			}
		}
		if (servicios.containsKey(fecha) && servicios.containsValue(servicio)){
			System.out.println(" El servicio ya estaba anteriormente programado.");
		}
	}
}