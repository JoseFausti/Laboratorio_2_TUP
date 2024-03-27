package Clase_4.Clases.Ejercicio_1;

import java.util.ArrayList;
import java.util.List;

public class Punto {
    //Atributos
    private  float x;
    private float y;
    private List<Lado> lados; //Relacion de Composicion

    //Constructor
    public Punto(float x, float y) {
        this.x = x;
        this.y = y;
        this.lados = new ArrayList<>();
    }

    //Getter y Setter
    public float getX() {
        return x;
    }
    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }
    public void setY(float y) {
        this.y = y;
    }

    //Metodos
    public void AgregarLado(Lado lado){
        this.lados.add(lado);
    }

}
