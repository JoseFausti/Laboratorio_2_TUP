package Clase_4.Clases.Ejercicio_2;

import java.util.List;

public class Continente {

    private List<Pais>listapaises;
    private String continente;

    //Constructor
    public Continente(String continente,List<Pais> listapaises) {
        this.listapaises = listapaises;
        this.continente = continente;
    }

    //Getter y Setter
    public List<Pais> getpaises() {
        return listapaises;
    }

    public void setpaises(List<Pais> listapaises) {
        this.listapaises = listapaises;
    }

    public String getContinente() {
        return continente;
    }

    public void setContinente(String continente) {
        this.continente = continente;
    }
}
