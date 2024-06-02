package com.example.ProyectoJPA_H2.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

public abstract class Persona extends Base {

    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "nombre")
    protected String nombre;
    @Column(name = "apellido")
    protected String apellido;
    @Column(name = "telefono")
    protected String telefono;
    @Column(name = "email")
    protected String email;
    @Column(name = "fecha_nacimiento")
    protected String fechaNacimiento;

    @OneToOne
    @JoinColumn(name = "imagen_persona")
    protected Imagen imagenPersona;

    @OneToOne
    @JoinColumn(name = "usuario")
    protected Usuario usuario;

    //Constructor
    public Persona(){}

    public Persona(Long id, String nombre, String apellido, String telefono, String email, String fechaNacimiento, Imagen imagenPersona, Usuario usuario) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.email = email;
        this.fechaNacimiento = fechaNacimiento;
        this.imagenPersona = imagenPersona;
        this.usuario = usuario;
    }

    public Persona(Long id, Long id1, String nombre, String apellido, String telefono, String email, String fechaNacimiento, Imagen imagenPersona, Usuario usuario) {
        super(id);
        this.id = id1;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.email = email;
        this.fechaNacimiento = fechaNacimiento;
        this.imagenPersona = imagenPersona;
        this.usuario = usuario;
    }

    //Getter y Setter

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

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
        return LocalDate.parse(fechaNacimiento);
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Imagen getImagenPersona() {
        return imagenPersona;
    }

    public void setImagenPersona(Imagen imagenPersona) {
        this.imagenPersona = imagenPersona;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
