package entities;

import javax.persistence.*;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "sucursal")
public class Sucursal {

    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "horario_apertura")
    private LocalTime horarioApertura;

    @Column(name = "horario_cierre")
    private LocalTime horarioCierre;

    @Column(name = "casa_matriz")
    private boolean casaMatriz;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "domicilio")
    private Domicilio domicilio;

    @OneToMany(mappedBy = "sucursal",cascade = CascadeType.PERSIST,orphanRemoval = true)
    private List<Empleado> empleados = new ArrayList<Empleado>();

    @OneToMany(mappedBy = "sucursal",cascade = CascadeType.PERSIST,orphanRemoval = true)
    private List<Pedido> pedidos = new ArrayList<Pedido>();

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "sucursal_categoria",
            joinColumns = @JoinColumn(name = "sucursal_id"),
            inverseJoinColumns = @JoinColumn(name = "categoria_id")
    )
    private List<Categoria> categorias;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "sucursal_promocion",
            joinColumns = @JoinColumn(name = "sucursal_id"),
            inverseJoinColumns = @JoinColumn(name = "promocion_id")
    )
    private List<Promocion> promociones;

    @ManyToOne
    @JoinColumn(name = "sucursal_id")
    private Empresa empresa;

    //Constructor
    public Sucursal(){}

    public Sucursal(String nombre, LocalTime horarioApertura, LocalTime horarioCierre, boolean casaMatriz, Domicilio domicilio, List<Empleado> empleados, List<Pedido> pedidos, List<Categoria> categorias, List<Promocion> promociones, Empresa empresa) {
        this.nombre = nombre;
        this.horarioApertura = horarioApertura;
        this.horarioCierre = horarioCierre;
        this.casaMatriz = casaMatriz;
        this.domicilio = domicilio;
        this.empleados = empleados;
        this.pedidos = pedidos;
        this.categorias = categorias;
        this.promociones = promociones;
        this.empresa = empresa;
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

    public LocalTime getHorarioApertura() {
        return horarioApertura;
    }

    public void setHorarioApertura(LocalTime horarioApertura) {
        this.horarioApertura = horarioApertura;
    }

    public LocalTime getHorarioCierre() {
        return horarioCierre;
    }

    public void setHorarioCierre(LocalTime horarioCierre) {
        this.horarioCierre = horarioCierre;
    }

    public boolean isCasaMatriz() {
        return casaMatriz;
    }

    public void setCasaMatriz(boolean casaMatriz) {
        this.casaMatriz = casaMatriz;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public List<Categoria> getCategorias() {
        return categorias;
    }

    public void setCategorias(List<Categoria> categorias) {
        this.categorias = categorias;
    }

    public List<Promocion> getPromociones() {
        return promociones;
    }

    public void setPromociones(List<Promocion> promociones) {
        this.promociones = promociones;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
}