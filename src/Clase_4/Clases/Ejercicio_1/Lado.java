package Clase_4.Clases.Ejercicio_1;

import java.util.List;

public class Lado {
    //Atributos
    private List<Poligono> poligonos; //Relacion de Composicion
    private Punto[] puntos;


    //Constructor
    public Lado() {
        this.puntos = new Punto[2];
        for (int i = 0; i < puntos.length; i++) {
            puntos[i] = CrearPunto(puntos[i]);
        }
    }

    //Getter y Setter
    public List<Poligono> getPoligonos() {
        return poligonos;
    }
    public void setPoligonos(List<Poligono> poligonos) {
        this.poligonos = poligonos;
    }

    //Metodos
    public Punto CrearPunto(@org.jetbrains.annotations.NotNull Punto punto){
        return new Punto(punto.getX(), punto.getY());
    }

}
