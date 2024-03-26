package Clase_4.Clases.Ejercicio_1;

public class Punto {
    //Atributos
    private  float x;
    private float y;

    //Constructor
    public Punto(float x, float y) {
        this.x = x;
        this.y = y;
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
    public Punto CrearPuntos(int x,int y){
        Punto puntos = new Punto(x,y);
        return puntos;
    }
}
