package entities;

import javax.persistence.*;
import org.hibernate.annotations.Comment;

import java.util.Set;

@Entity
public class ArticuloInsumo {

    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "precio_compra")
    private Double precioCompra;
    @Column(name = "stock_actual")
    private Integer stockActual;
    @Column(name = "stock_maximo")
    private Integer stockMaximo;
    @Column(name = "es_para_elaborar")
    private Boolean esParaElaborar;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "articulo")
    private Articulo articulo;

    @OneToMany(mappedBy = "articuloInsumo")
    private Set<ArticuloManufacturadoDetalle> manufacturadoDetalles;

    //Constructor
    public ArticuloInsumo(){}

    public ArticuloInsumo(Double precioCompra, Integer stockActual, Integer stockMaximo, Boolean esParaElaborar, Articulo articulo, Set<ArticuloManufacturadoDetalle> manufacturadoDetalles) {
        this.precioCompra = precioCompra;
        this.stockActual = stockActual;
        this.stockMaximo = stockMaximo;
        this.esParaElaborar = esParaElaborar;
        this.articulo = articulo;
        this.manufacturadoDetalles = manufacturadoDetalles;
    }

    // Getters y setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(Double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public Integer getStockActual() {
        return stockActual;
    }

    public void setStockActual(Integer stockActual) {
        this.stockActual = stockActual;
    }

    public Integer getStockMaximo() {
        return stockMaximo;
    }

    public void setStockMaximo(Integer stockMaximo) {
        this.stockMaximo = stockMaximo;
    }

    public Boolean getEsParaElaborar() {
        return esParaElaborar;
    }

    public void setEsParaElaborar(Boolean esParaElaborar) {
        this.esParaElaborar = esParaElaborar;
    }

    public Set<ArticuloManufacturadoDetalle> getManufacturadoDetalles() {
        return manufacturadoDetalles;
    }

    public void setManufacturadoDetalles(Set<ArticuloManufacturadoDetalle> manufacturadoDetalles) {
        this.manufacturadoDetalles = manufacturadoDetalles;
    }

    public Articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }
}