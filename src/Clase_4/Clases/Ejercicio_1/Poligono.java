package Clase_4.Clases.Ejercicio_1;

import java.util.ArrayList;
import java.util.List;

public class Poligono extends Figura{
    //Atributos
    List<Figura> figuras; //Relacion de Agregacion

    //Constructor
    public Poligono() {
        this.figuras = new ArrayList<>();
    }

    //Getter y Setter
    public List<Figura> getFiguras() {
        return figuras;
    }
    public void setFiguras(List<Figura> figuras) {
        this.figuras = figuras;
    }


    //Metodos

}
