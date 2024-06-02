package com.example.ProyectoJPA_H2.entities;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "categorias")
public class Categoria extends Base{

    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "denominacion")
    private String denominacion;

    /*@OneToMany(mappedBy = "categoriaPadre")
    @Builder.Default
    private Set<Categoria> subcategorias = new HashSet<>();*/

    @ManyToOne
    @JoinColumn(name = "categoria_padre_id")
    private Categoria categoriaPadre;

    //Constructor
    public Categoria(){}
    public Categoria(Long id, String denominacion, Categoria categoriaPadre) {
        this.id = id;
        this.denominacion = denominacion;
        this.categoriaPadre = categoriaPadre;
    }

    public Categoria(Long id, Long id1, String denominacion, Categoria categoriaPadre) {
        super(id);
        this.id = id1;
        this.denominacion = denominacion;
        this.categoriaPadre = categoriaPadre;
    }

    //Getter y Setter
    @Override
    public Long getId() {
        return id;
    }
    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public String getDenominacion() {
        return denominacion;
    }
    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public Categoria getCategoriaPadre() {
        return categoriaPadre;
    }
    public void setCategoriaPadre(Categoria categoriaPadre) {
        this.categoriaPadre = categoriaPadre;
    }
}