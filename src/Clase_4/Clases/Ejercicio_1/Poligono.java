package Clase_4.Clases.Ejercicio_1;

import java.util.ArrayList;
import java.util.List;

public class Poligono {
    //Atributos
    private List<Lado> lados = new ArrayList<>();

    //Constructor
    public Poligono(int cantLados) {
        for (int i = 0; i < cantLados; i++) {
            this.lados.add(new Lado());
        }
    }
}
