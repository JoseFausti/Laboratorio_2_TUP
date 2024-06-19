package entities;

import entities.enums.TipoPromocion;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Promocion {

    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "denominacion")
    private String denominacion;
    @Column(name = "fecha_desde")
    private LocalDate fechaDesde;
    @Column(name = "fecha_hasta")
    private LocalDate fechaHasta;
    @Column(name = "hora_desde")
    private LocalTime horaDesde;
    @Column(name = "hora_hasta")
    private LocalTime horaHasta;
    @Column(name = "description_descuento")
    private String descriptionDescuento;
    @Column(name = "precio_promocional")
    private Double precioPromocional;

    @Enumerated(EnumType.STRING)
    private TipoPromocion tipoPromocion;

    @OneToMany
    private List<PromocionDetalle> promocionDetalles;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "imagen_promocion")
    private List<ImagenPromocion> imagenPromocion;

    @ManyToMany(mappedBy = "promociones")
    private List <Sucursal> sucursales;

    //Constructor
    public Promocion(){}

    public Promocion(String denominacion, LocalDate fechaDesde, LocalDate fechaHasta, LocalTime horaDesde, LocalTime horaHasta, String descriptionDescuento, Double precioPromocional, TipoPromocion tipoPromocion, List<PromocionDetalle> promocionDetalles, List<ImagenPromocion> imagenPromocion, List<Sucursal> sucursales) {
        this.denominacion = denominacion;
        this.fechaDesde = fechaDesde;
        this.fechaHasta = fechaHasta;
        this.horaDesde = horaDesde;
        this.horaHasta = horaHasta;
        this.descriptionDescuento = descriptionDescuento;
        this.precioPromocional = precioPromocional;
        this.tipoPromocion = tipoPromocion;
        this.promocionDetalles = promocionDetalles;
        this.imagenPromocion = imagenPromocion;
        this.sucursales = sucursales;
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

    public LocalDate getFechaDesde() {
        return fechaDesde;
    }

    public void setFechaDesde(LocalDate fechaDesde) {
        this.fechaDesde = fechaDesde;
    }

    public LocalDate getFechaHasta() {
        return fechaHasta;
    }

    public void setFechaHasta(LocalDate fechaHasta) {
        this.fechaHasta = fechaHasta;
    }

    public LocalTime getHoraDesde() {
        return horaDesde;
    }

    public void setHoraDesde(LocalTime horaDesde) {
        this.horaDesde = horaDesde;
    }

    public LocalTime getHoraHasta() {
        return horaHasta;
    }

    public void setHoraHasta(LocalTime horaHasta) {
        this.horaHasta = horaHasta;
    }

    public String getDescriptionDescuento() {
        return descriptionDescuento;
    }

    public void setDescriptionDescuento(String descriptionDescuento) {
        this.descriptionDescuento = descriptionDescuento;
    }

    public Double getPrecioPromocional() {
        return precioPromocional;
    }

    public void setPrecioPromocional(Double precioPromocional) {
        this.precioPromocional = precioPromocional;
    }

    public TipoPromocion getTipoPromocion() {
        return tipoPromocion;
    }

    public void setTipoPromocion(TipoPromocion tipoPromocion) {
        this.tipoPromocion = tipoPromocion;
    }

    public void setPromocionDetalles(List<PromocionDetalle> promocionDetalles) {
        this.promocionDetalles = promocionDetalles;
    }

    public void agregarPromocionDetalles(PromocionDetalle promocionDetalle) {
        this.promocionDetalles.add(promocionDetalle);
    }

    public List<PromocionDetalle> getPromocionDetalles() {
        return promocionDetalles;
    }

    public List<ImagenPromocion> getImagenPromocion() {
        return imagenPromocion;
    }

    public void setImagenPromocion(List<ImagenPromocion> imagenPromocion) {
        this.imagenPromocion = imagenPromocion;
    }

    public List<Sucursal> getSucursales() {
        return sucursales;
    }

    public void setSucursales(List<Sucursal> sucursales) {
        this.sucursales = sucursales;
    }
}
