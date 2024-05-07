package Clase_8.Ejemplos_Dependencias_Polimorfismos_Comision_4.Estatico.Por_sobrecarga;

public class Main {
    public static void main(String[] args) {
        int a = 1;
        int b = 3;

        double da = 4.5;
        double db = 3.2;

        Sobrecarga sobrecarga = new Sobrecarga();

        System.out.println(sobrecarga.sumarNumeros(a,b));
        System.out.println(sobrecarga.sumarNumeros(da,db));
    }
}
