package entities;

import javax.persistence.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "categorias")
public class Categoria {

    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "denominacion")
    private String denominacion;

    /*@OneToMany(mappedBy = "categoriaPadre")
    @Builder.Default
    private Set<Categoria> subcategorias = new HashSet<>();*/

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "categoria_padre_id")
    private List<Categoria> categoriasPadres;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "articulo")
    private List<Articulo> articulo;

    @ManyToMany(mappedBy = "categorias")
    private List<Sucursal> sucursales;

    //Constructor
    public Categoria(){}

    public Categoria(String denominacion, List<Categoria> categoriasPadres, List<Articulo> articulo, List<Sucursal> sucursales) {
        this.denominacion = denominacion;
        this.categoriasPadres = categoriasPadres;
        this.articulo = articulo;
        this.sucursales = sucursales;
    }

    //Getter y Setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getDenominacion() {
        return denominacion;
    }
    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public List<Categoria> getCategoriasPadres() {
        return categoriasPadres;
    }

    public void setCategoriasPadres(List<Categoria> categoriasPadres) {
        this.categoriasPadres = categoriasPadres;
    }

    public List<Articulo> getArticulo() {
        return articulo;
    }

    public void setArticulo(List<Articulo> articulo) {
        this.articulo = articulo;
    }

    public List<Sucursal> getSucursales() {
        return sucursales;
    }

    public void setSucursales(List<Sucursal> sucursales) {
        this.sucursales = sucursales;
    }
}