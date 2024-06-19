package entities;

import javax.persistence.*;

@Entity
@Table(name = "imagen_cliente")
public class ImagenCliente {

    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "denominacion")
    private String denominacion;

    //Constructor
    public ImagenCliente(){}

    public ImagenCliente(String denominacion) {
        this.denominacion = denominacion;
    }

    //Getter y Setter

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
