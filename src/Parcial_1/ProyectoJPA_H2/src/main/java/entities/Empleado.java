package entities;

import entities.enums.Rol;

import javax.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "empleados")
public class Empleado {
    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido")
    private String  apellido;

    @Column(name = "telefono")
    private String telefono;

    @Column(name = "email")
    private String email;

    @Column(name = "fecha_nacimiento")
    private LocalDate fechaNacimiento;

    @Enumerated(EnumType.STRING)
    private Rol rol;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "id_sucursal")
    private Sucursal sucursal;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "imagen_empleado")
    private ImagenEmpleado imagenEmpleado;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "usuario_empleado")
    private UsuarioEmpleado usuarioEmpleado;

    //Constructor
    public Empleado(){}

    public Empleado(String nombre, String apellido, String telefono, String email, LocalDate fechaNacimiento, Rol rol, Sucursal sucursal, ImagenEmpleado imagenEmpleado, UsuarioEmpleado usuarioEmpleado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.email = email;
        this.fechaNacimiento = fechaNacimiento;
        this.rol = rol;
        this.sucursal = sucursal;
        this.imagenEmpleado = imagenEmpleado;
        this.usuarioEmpleado = usuarioEmpleado;
    }

    //Getter y Setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    public ImagenEmpleado getImagenEmpleado() {
        return imagenEmpleado;
    }

    public void setImagenEmpleado(ImagenEmpleado imagenEmpleado) {
        this.imagenEmpleado = imagenEmpleado;
    }

    public UsuarioEmpleado getUsuarioEmpleado() {
        return usuarioEmpleado;
    }

    public void setUsuarioEmpleado(UsuarioEmpleado usuarioEmpleado) {
        this.usuarioEmpleado = usuarioEmpleado;
    }
}
