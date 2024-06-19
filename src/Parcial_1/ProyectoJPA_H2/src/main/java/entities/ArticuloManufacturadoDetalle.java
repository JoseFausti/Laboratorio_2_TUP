package entities;

import javax.persistence.*;

@Entity
public class ArticuloManufacturadoDetalle {

    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "cantidad")
    private Integer cantidad;

    @ManyToOne
    @JoinColumn(name = "articuloManufacturado_id")
    private ArticuloManufacturado articuloManufacturado;

    @ManyToOne
    @JoinColumn(name = "articuloInsumo_id")
    private ArticuloInsumo articuloInsumo;

    //Constructor
    public ArticuloManufacturadoDetalle(){}

    public ArticuloManufacturadoDetalle(Integer cantidad, ArticuloManufacturado articuloManufacturado, ArticuloInsumo articuloInsumo) {
        this.cantidad = cantidad;
        this.articuloManufacturado = articuloManufacturado;
        this.articuloInsumo = articuloInsumo;
    }

    // Getters y setters

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

    public ArticuloManufacturado getArticuloManufacturado() {
        return articuloManufacturado;
    }

    public void setArticuloManufacturado(ArticuloManufacturado articuloManufacturado) {
        this.articuloManufacturado = articuloManufacturado;
    }

    public ArticuloInsumo getArticuloInsumo() {
        return articuloInsumo;
    }

    public void setArticuloInsumo(ArticuloInsumo articuloInsumo) {
        this.articuloInsumo = articuloInsumo;
    }
}
