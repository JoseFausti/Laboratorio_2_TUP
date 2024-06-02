package com.example.ProyectoJPA_H2.entities;


import jakarta.persistence.*;
import org.hibernate.annotations.Comment;

import java.util.Set;

@Entity
public class UnidadMedida {

    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "denominacion")
    private String denominacion;

    @OneToMany(mappedBy = "unidadMedida")
    @Column(name = "articulos")
    private Set<Articulo> articulos;

    //Constructor
    public UnidadMedida(){}

    public UnidadMedida(Long id, String denominacion, Set<Articulo> articulos) {
        this.id = id;
        this.denominacion = denominacion;
        this.articulos = articulos;
    }

    // Getters y setters

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

    public Set<Articulo> getArticulos() {
        return articulos;
    }

    public void setArticulos(Set<Articulo> articulos) {
        this.articulos = articulos;
    }
}