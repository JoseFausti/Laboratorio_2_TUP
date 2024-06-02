package com.example.ProyectoJPA_H2.entities;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Factura {

    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "fecha_facturacion")
    private LocalDate fechaFacturacion;
    @Column(name = "total_venta")
    private Double totalVenta;

    @ManyToOne
    @JoinColumn(name = "pedido_id")
    private Pedido pedido;

    //Constructor
    public Factura(){}

    public Factura(Long id, LocalDate fechaFacturacion, Double totalVenta, Pedido pedido) {
        this.id = id;
        this.fechaFacturacion = fechaFacturacion;
        this.totalVenta = totalVenta;
        this.pedido = pedido;
    }

    // Getters y setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getFechaFacturacion() {
        return fechaFacturacion;
    }

    public void setFechaFacturacion(LocalDate fechaFacturacion) {
        this.fechaFacturacion = fechaFacturacion;
    }

    public Double getTotalVenta() {
        return totalVenta;
    }

    public void setTotalVenta(Double totalVenta) {
        this.totalVenta = totalVenta;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
}
