package Clase_4.Clases.Ejercicio_1;

import java.util.List;

public class Lado {
    //Atributos
    private Punto[] puntos; // Relacion de Compocicion


    //Constructor
    public Lado() {
        this.puntos = new Punto[2];
        for (int i = 0; i < puntos.length; i++) {
            puntos[i] = CrearPunto(puntos[i]);
        }
    }

    //Getter y Setter
    public Punto[] getPuntos() {
        return puntos;
    }
    public void setPuntos(Punto[] puntos) {
        this.puntos = new Punto[2];
        for (int i = 0; i < puntos.length; i++) {
            puntos[i] = CrearPunto(puntos[i]);
        }
    }

    //Metodos
    public Punto CrearPunto(@org.jetbrains.annotations.NotNull Punto punto){
        return new Punto(punto.getX(), punto.getY());
    }

}
