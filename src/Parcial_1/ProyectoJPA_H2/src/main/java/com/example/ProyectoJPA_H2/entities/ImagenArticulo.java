package com.example.ProyectoJPA_H2.entities;

import jakarta.persistence.*;

@Entity
public class ImagenArticulo {

    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "denominacion")
    private String denominacion;

    @OneToOne
    @JoinColumn(name = "articulo")
    private Articulo articulo;

    //Constructor
    public ImagenArticulo(){}

    public ImagenArticulo(Long id, String denominacion, Articulo articulo) {
        this.id = id;
        this.denominacion = denominacion;
        this.articulo = articulo;
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

    public Articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }
}