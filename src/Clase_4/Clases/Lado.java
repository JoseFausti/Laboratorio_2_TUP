package Clase_4.Clases;

public class Lado {
    private Punto[]puntos = new Punto[2];

    //Constructor
    public Lado(){
        for (Punto punto : puntos) {
            punto = new Punto(punto.getX(),punto.getY());
        }
    }

    //Metodos

}
