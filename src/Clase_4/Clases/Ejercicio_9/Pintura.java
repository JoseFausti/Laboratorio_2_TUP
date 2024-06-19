package Clase_4.Clases.Ejercicio_9;
public class  Pintura extends Tipo{

	//Atributos
	private TipoEstilo tipoEstilo;
	private TipoPintura tipoPintura;
	private TipoSoporte tipoSoporte;

	//Constructor
	public  Pintura(){

	}
	public Pintura(TipoEstilo tipoEstilo, TipoPintura tipoPintura, TipoSoporte tipoSoporte) {
		this.tipoEstilo = tipoEstilo;
		this.tipoPintura = tipoPintura;
		this.tipoSoporte = tipoSoporte;
	}

	//Getter y Setter
	public TipoEstilo getTipoEstilo() {
		return tipoEstilo;
	}

	public void setTipoEstilo(TipoEstilo tipoEstilo) {
		this.tipoEstilo = tipoEstilo;
	}

	public TipoPintura getTipoPintura() {
		return tipoPintura;
	}

	public void setTipoPintura(TipoPintura tipoPintura) {
		this.tipoPintura = tipoPintura;
	}

	public TipoSoporte getTipoSoporte() {
		return tipoSoporte;
	}

	public void setTipoSoporte(TipoSoporte tipoSoporte) {
		this.tipoSoporte = tipoSoporte;
	}
}

