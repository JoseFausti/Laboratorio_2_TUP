package Clase_5.Trabajo_Practico.Parte_B.Ejercicio_2;

public abstract class Vehiculo {

    //Atributo
    private int velocidad = 0;

    //Constructor
    public Vehiculo(int velocidad) {
        this.velocidad = velocidad;
    }

    //Getter y Setter
    public int getVelocidad() {
        return velocidad;
    }
    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    //Metodos
    public void acelera()throws miException{
        this.velocidad += 10;
    }
    public void frena(){
        this.velocidad -= 10;
    }
}
