package Clase_4.Clases.Ejercicio_1;

import java.util.ArrayList;
import java.util.List;

public class Figura {
    List<Poligono> poligonos; // Relacion de Agregacion

    // Constructor
    public Figura() {
        this.poligonos = new ArrayList<>();
    }

    //Getter y Setter
    public List<Poligono> getPoligonos() {
        return poligonos;
    }

    public void setPoligonos(List<Poligono> poligonos) {
        this.poligonos = poligonos;
    }
}
