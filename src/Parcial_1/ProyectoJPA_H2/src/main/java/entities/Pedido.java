package entities;


import entities.enums.Estado;
import entities.enums.FormaPago;
import entities.enums.TipoEnvio;

import javax.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "pedidos")
public class Pedido {

    //Atributos

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "hora_estimada_finalizacion")
    private LocalTime horaEstimadaFinalizacion;
    @Column(name = "total")
    private Double total;
    @Column(name = "total_costo")
    private Double totalCosto;
    @Enumerated(EnumType.STRING)
    private Estado estado;
    @Enumerated(EnumType.STRING)
    private TipoEnvio tipoEnvio;
    @Enumerated(EnumType.STRING)
    private FormaPago formaPago;
    @Column(name = "fecha_pedido")
    private LocalDate fechaPedido;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "factura")
    private Factura factura;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "domicilio_id")
    private Domicilio domicilio;

    @ManyToOne
    @JoinColumn(name = "sucursal_id")
    private Sucursal sucursal;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "detalle_pedido")
    private List<DetallePedido> detallePedidos;

    @ManyToOne
    @JoinColumn(name = "empleado")
    private Empleado empleado;

    //Constructor
    public Pedido(){}

    public Pedido(LocalTime horaEstimadaFinalizacion, Double total, Double totalCosto, Estado estado, TipoEnvio tipoEnvio, FormaPago formaPago, LocalDate fechaPedido, Factura factura, Cliente cliente, Domicilio domicilio, Sucursal sucursal, Empleado empleado) {
        this.horaEstimadaFinalizacion = horaEstimadaFinalizacion;
        this.total = total;
        this.totalCosto = totalCosto;
        this.estado = estado;
        this.tipoEnvio = tipoEnvio;
        this.formaPago = formaPago;
        this.fechaPedido = fechaPedido;
        this.factura = factura;
        this.cliente = cliente;
        this.domicilio = domicilio;
        this.sucursal = sucursal;
        this.detallePedidos = new ArrayList<>();
        this.empleado = empleado;
    }

    //Getter y Setter
    public LocalTime getHoraEstimadaFinalizacion() {
        return horaEstimadaFinalizacion;
    }

    public void setHoraEstimadaFinalizacion(LocalTime horaEstimadaFinalizacion) {
        this.horaEstimadaFinalizacion = horaEstimadaFinalizacion;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Double getTotalCosto() {
        return totalCosto;
    }

    public void setTotalCosto(Double totalCosto) {
        this.totalCosto = totalCosto;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public TipoEnvio getTipoEnvio() {
        return tipoEnvio;
    }

    public void setTipoEnvio(TipoEnvio tipoEnvio) {
        this.tipoEnvio = tipoEnvio;
    }

    public FormaPago getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(FormaPago formaPago) {
        this.formaPago = formaPago;
    }

    public LocalDate getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(LocalDate fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public List<DetallePedido> getDetallePedidos() {
        return detallePedidos;
    }

    public void agregarDetallePedido(DetallePedido detallePedido) {
        this.detallePedidos.add(detallePedido);
    }
}
