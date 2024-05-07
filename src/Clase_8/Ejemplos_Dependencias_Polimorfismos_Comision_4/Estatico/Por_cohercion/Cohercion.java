package Clase_8.Ejemplos_Dependencias_Polimorfismos_Comision_4.Estatico.Por_cohercion;

public class Cohercion { // Siempre devuelven el mismo tipo de dato
    //Constructor
    public Cohercion() {
    }
    //Metodos
    public double sumarNumeros(int a,int b){
        return a + b;
    }

    public double sumarNumeros(double a,double b){
        return a + b;
    }

    public double sumarNumeros(float a,float b){
        return a + b;
    }
}
