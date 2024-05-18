package org.example.Entidades;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "factura")
public class Factura implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "fecha")
    private String fecha;
    @Column(name = "numero")
    private int numero;
    @Column(name = "total")
    private int total;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "fk_cliente")
    private Cliente cliente;

    // @OneToMany(cascade = CascadeType.ALL,orphanRemoval = true) // orphanRemoval: elimina todos los detalles cuando elimino una factura
    // private List<DetalleFactura> detalleFacturas = new ArrayList<DetalleFactura>();

    @OneToMany(mappedBy = "factura",cascade = CascadeType.ALL,orphanRemoval = true) // orphanRemoval: elimina todos los detalles cuando elimino una factura
    private List<DetalleFactura> detalleFacturas = new ArrayList<DetalleFactura>();


    //Constructor
    public Factura(){}
    public Factura(String fecha, int numero,int total) {
        this.fecha = fecha;
        this.numero = numero;
        this.total = total;
    }

    public Factura(String fecha, int numero, int total, Cliente cliente) {
        this.fecha = fecha;
        this.numero = numero;
        this.total = total;
        this.cliente = cliente;
    }

    //Getter y Setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}