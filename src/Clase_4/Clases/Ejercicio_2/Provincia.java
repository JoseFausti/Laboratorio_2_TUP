package Clase_4.Clases.Ejercicio_2;

import java.util.List;

public class Provincia {
    private List<Ciudad> listaciudades;
    private String provincia;

    //Constructor
    public Provincia(String ciudad,List<Ciudad>ciudades) {
        this.listaciudades = ciudades;
        this.provincia = ciudad;
    }
    //Getter y Setter
    public List<Ciudad> getCiudades() {
        return listaciudades;
    }

    public void setCiudades(List<Ciudad> ciudades) {
        this.listaciudades = ciudades;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String ciudad) {
        this.provincia = ciudad;
    }
}
