package Clase_4.Clases.Ejercicio_9;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ColeccionDeObras {

	//Atributos
	private int id;
	private String titulo;
	private Date anioCreacion;
	private String descripcion;
	private Artista artista;
	private List<ObraDeArte> obrasDeArte;

	//Constructor
	public ColeccionDeObras(){

	}
	public ColeccionDeObras(int id, String titulo, Date anioCreacion, String descripcion, Artista artista, List<ObraDeArte> obrasDeArte) {
		this.id = id;
		this.titulo = titulo;
		this.anioCreacion = anioCreacion;
		this.descripcion = descripcion;
		this.artista = artista;
		this.obrasDeArte = new ArrayList<ObraDeArte>(obrasDeArte);
	}

	//Getters y Setters

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Date getAnioCreacion() {
		return anioCreacion;
	}

	public void setAnioCreacion(Date anioCreacion) {
		this.anioCreacion = anioCreacion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Artista getArtista() {
		return artista;
	}

	public void setArtista(Artista artista) {
		this.artista = artista;
	}

	public List<ObraDeArte> getObrasDeArte() {
		return obrasDeArte;
	}

	public void setObrasDeArte(List<ObraDeArte> obrasDeArte) {
		this.obrasDeArte = obrasDeArte;
	}

	//Metodos
	public void agregarObraDeArte(ObraDeArte obraDeArte){
		this.obrasDeArte.add(obraDeArte);
	}
}