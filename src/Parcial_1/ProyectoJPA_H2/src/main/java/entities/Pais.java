package entities;

import javax.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "pais")
public class Pais {

    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "nombre")
    private String nombre;

      /*

    @OneToMany(mappedBy = "pais",orphanRemoval = true)
    private List<Provincia>provincias = new ArrayList<Provincia>();

     */

    //Constructor
    public Pais(){}

    public Pais( String nombre) {
        this.nombre = nombre;
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
}
