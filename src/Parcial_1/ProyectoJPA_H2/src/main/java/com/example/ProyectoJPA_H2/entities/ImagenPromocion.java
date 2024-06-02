package com.example.ProyectoJPA_H2.entities;

import jakarta.persistence.*;

@Entity
public class ImagenPromocion {

    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "denominacion")
    private String denominacion;

    //Constructor
    public ImagenPromocion(){}

    public ImagenPromocion(Long id, String denominacion) {
        this.id = id;
        this.denominacion = denominacion;
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
}