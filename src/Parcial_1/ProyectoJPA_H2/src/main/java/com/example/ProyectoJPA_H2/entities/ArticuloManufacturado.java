package com.example.ProyectoJPA_H2.entities;


import jakarta.persistence.*;
import java.util.Set;

@Entity
public class ArticuloManufacturado {

    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "tiempo_estimado_minutos")
    private Integer tiempoEstimadoMinutos;
    @Column(name = "preparacion")
    private String preparacion;

    @OneToMany(mappedBy = "articuloManufacturado")
    private Set<ArticuloManufacturadoDetalle> detalles;

    //Constructor
    public ArticuloManufacturado(){}

    public ArticuloManufacturado(Long id, String descripcion, Integer tiempoEstimadoMinutos, String preparacion, Set<ArticuloManufacturadoDetalle> detalles) {
        this.id = id;
        this.descripcion = descripcion;
        this.tiempoEstimadoMinutos = tiempoEstimadoMinutos;
        this.preparacion = preparacion;
        this.detalles = detalles;
    }

    // Getters y setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getTiempoEstimadoMinutos() {
        return tiempoEstimadoMinutos;
    }

    public void setTiempoEstimadoMinutos(Integer tiempoEstimadoMinutos) {
        this.tiempoEstimadoMinutos = tiempoEstimadoMinutos;
    }

    public String getPreparacion() {
        return preparacion;
    }

    public void setPreparacion(String preparacion) {
        this.preparacion = preparacion;
    }

    public Set<ArticuloManufacturadoDetalle> getDetalles() {
        return detalles;
    }

    public void setDetalles(Set<ArticuloManufacturadoDetalle> detalles) {
        this.detalles = detalles;
    }
}
