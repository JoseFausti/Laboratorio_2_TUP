package com.example.ProyectoJPA_H2.entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "pais")
public class Provincia {

    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "nombre")
    private String nombre;

    /*

    @OneToMany(mappedBy = "provincia",orphanRemoval = true)
    private List<Localidad>localidades = new ArrayList<Localidad>();

     */

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "fk_pais")
    private Pais pais;

    //Constructor
    public Provincia(){}

    public Provincia(Long id, String nombre, Pais pais) {
        this.id = id;
        this.nombre = nombre;
        this.pais = pais;
    }

    //Getter y Setter

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }
}
