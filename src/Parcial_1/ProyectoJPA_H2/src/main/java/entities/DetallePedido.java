package entities;

import javax.persistence.*;

@Entity
@Table(name = "detalle_pedido")
public class DetallePedido {

    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "cantidad")
    private Integer cantidad;

    @Column(name = "subtotal")
    private Double subtotal;

    @ManyToOne
    @JoinColumn(name = "articulo_id")
    private Articulo articulo;

    //Consructor
    public DetallePedido(){}

    public DetallePedido(Integer cantidad, Double subtotal, Articulo articulo) {
        this.cantidad = cantidad;
        this.subtotal = subtotal;
        this.articulo = articulo;
    }

    //Getter y Setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Double subtotal) {
        this.subtotal = subtotal;
    }

    public Articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }
}
