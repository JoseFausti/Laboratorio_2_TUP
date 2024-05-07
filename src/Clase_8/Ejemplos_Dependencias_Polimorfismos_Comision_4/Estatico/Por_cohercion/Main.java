package Clase_8.Ejemplos_Dependencias_Polimorfismos_Comision_4.Estatico.Por_cohercion;

public class Main {
    public static void main(String[] args) {
        int a = 4;
        int b = 3;
        float c = 2;
        float d = 5;
        double e = 7;
        double f = 8;

        Cohercion cohercion = new Cohercion();

        System.out.println(cohercion.sumarNumeros(a,b));
        System.out.println(cohercion.sumarNumeros(c,d));
        System.out.println(cohercion.sumarNumeros(e,f));
    }
}
