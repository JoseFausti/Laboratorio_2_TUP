package Clase_4.Clases.Ejercicio_1;

import java.util.ArrayList;
import java.util.List;

public class Poligono extends Figura{
    //Atributos
    List<Lado> lados; //Relacion de Compocicion


    //Constructor
    public Poligono(int cantidadLados){
        this.lados = new ArrayList<>();
        if (cantidadLados >= 3) {
            for (int i = 0; i < cantidadLados; i++) {
                this.lados.add(new Lado());
            }
        }else {
            System.out.println("Debe ingresar mas de 3 lados.");
        }
    }

    //Getter y Setter
    public List<Lado> getLados() {
        return lados;
    }
    public void setLados(List<Lado> lados) {
        this.lados = lados;
    }


    //Metodos

}
