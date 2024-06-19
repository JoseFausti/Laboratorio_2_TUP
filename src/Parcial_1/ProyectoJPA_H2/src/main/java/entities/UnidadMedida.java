package entities;


import javax.persistence.*;
import org.hibernate.annotations.Comment;

import java.util.Set;

@Entity
public class UnidadMedida {

    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "denominacion")
    private String denominacion;

    //Constructor
    public UnidadMedida(){}

    public UnidadMedida(String denominacion) {
        this.denominacion = denominacion;
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

}