package Clase_4.Clases.Ejercicio_1;

import java.util.ArrayList;
import java.util.List;

public class Poligono extends Figura{
    //Atributos
    private int numLados;
    private List<Lado> lados;

    public Poligono(int numLados, List<Lado> lados) {
        this.numLados = numLados;
        this.lados = lados;
    }

    //Getter y Setter
    public int getNumLados() {
        return numLados;
    }
    public void setNumLados(int numLados) {
        this.numLados = numLados;
    }

    public List<Lado> getLados() {
        return lados;
    }
    public void setLados(List<Lado> lados) {
        this.lados = lados;
    }

    //Metodos

}
