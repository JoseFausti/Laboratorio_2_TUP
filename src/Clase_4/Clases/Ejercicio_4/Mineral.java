package Clase_4.Clases.Ejercicio_4;

public class Mineral {

    //Atributos
    private String nombre;
    private TipoMineral tipo;

    //Constructor
    public Mineral(String nombre, TipoMineral tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    //Getter y Setter
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TipoMineral getTipo() {
        return tipo;
    }
    public void setTipo(TipoMineral tipo) {
        this.tipo = tipo;
    }
}

