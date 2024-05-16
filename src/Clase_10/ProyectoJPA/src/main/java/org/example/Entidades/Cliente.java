package org.example.Entidades;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;

@Entity //Indica que esta clase se debe guardar en la base de datos
@Table (name = "cliente") //Indica que esta va a ser una tabla en la base de datos
public class Cliente implements Serializable {
    @Serial // Decorador que hace referencia a que el atributo de clase es parte de la serializacion
    private static final long serialVersionUID = 1L;

    // Atributos

    @Id // Indica que va a ser la clave primaria
    @GeneratedValue(strategy =GenerationType.IDENTITY) // Hacemos que nuestro id sea de tipo auto incrementable
    private Long id;
    // Campos
    @Column(name = "nombre") // Indica que va a ser una columna en la base de datos
    private String nombre;
    @Column(name = "apellido")
    private String apellido;
    @Column(name = "dni",unique = true) // unique hace que no se puedan ingresar 2 registros con el mismo valor
    private int dni;
    @OneToOne(cascade = CascadeType.ALL) // hace que los cambios que ocurran en el padre tambien se vean reflejados en el hijo
    @JoinColumn(name = "fk_domicilio") // Creamos una columna que contenga la clave foranea
    private Domicilio domicilio;

    // Constructor
    public Cliente() {
    }
    public Cliente(String nombre, String apellido, int dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }
    public Cliente(String nombre, String apellido, int dni, Domicilio domicilio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.domicilio = domicilio;
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

    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }
    public void setDni(int dni) {
        this.dni = dni;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }
    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }
}
