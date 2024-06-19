package Clase_4.Clases.Ejercicio_9;
public class ObraDeArte {

	//Atributos
	private String pais;
	private Artista artista;
	private TipoCultura cultura;
	private TipoEpoca epoca;

	//Constructor
	public ObraDeArte(){

	}

	public ObraDeArte(String pais, Artista artista, TipoCultura cultura, TipoEpoca epoca) {
		this.pais = pais;
		this.artista = artista;
		this.cultura = cultura;
		this.epoca = epoca;
	}

	//Getters y Setters
	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public Artista getArtista() {
		return artista;
	}

	public void setArtista(Artista artista) {
		this.artista = artista;
	}

	public TipoCultura getCultura() {
		return cultura;
	}

	public void setCultura(TipoCultura cultura) {
		this.cultura = cultura;
	}

	public TipoEpoca getEpoca() {
		return epoca;
	}

	public void setEpoca(TipoEpoca epoca) {
		this.epoca = epoca;
	}

}