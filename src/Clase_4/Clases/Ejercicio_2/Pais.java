package Clase_4.Clases.Ejercicio_2;

import java.util.List;

public class Pais {
    private List<Provincia>listaprovincias;
    private String pais;

    //Constructor
    public Pais(String pais,List<Provincia> listaprovincias) {
        this.listaprovincias = listaprovincias;
        this.pais = pais;
    }

    //Getter y Setter
    public List<Provincia> getprovincias() {
        return listaprovincias;
    }

    public void setprovincias(List<Provincia> listaprovincias) {
        this.listaprovincias = listaprovincias;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
}
