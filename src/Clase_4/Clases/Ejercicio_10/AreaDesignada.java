package Clase_4.Clases.Ejercicio_10;
public class AreaDesignada {

	//Atributos
	private TipoIndicadorSituacion indicadorSituacion;

	//Constructor
	public AreaDesignada(){

	}
	public AreaDesignada(TipoIndicadorSituacion indicadorSituacion) {
		this.indicadorSituacion = indicadorSituacion;
	}

	//Getters y Setters
	public TipoIndicadorSituacion getIndicadorSituacion() {
		return indicadorSituacion;
	}

	public void setIndicadorSituacion(TipoIndicadorSituacion indicadorSituacion) {
		this.indicadorSituacion = indicadorSituacion;
	}
}