package com.example.ProyectoJPA_H2.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serializable;

@Entity
public abstract class Base implements Serializable {

    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;

    //Constructor
    public Base(){}
    public Base(Long id) {
        this.id = id;
    }

    //Getter y Setter
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
}
