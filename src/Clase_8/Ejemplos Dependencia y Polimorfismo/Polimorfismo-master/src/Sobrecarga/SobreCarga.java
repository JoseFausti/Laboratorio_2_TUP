package Sobrecarga;

public class SobreCarga {

    void test() {
        System.out.println("No parámetros");
    }

    // Sobrecarga el método test con un parámetro entero.

    void test(int a) {
        System.out.println("Parametro entero : " + a);
    }

    // Sobrecarga el método test con dos parámetros enteros.

    void test(int a, int b) {
        System.out.println("Parametros a y b: " + a + "  y " + b);
    }
// Sobrecarga el método test con un parámetro doble.

    double test(double a) {
        System.out.println("double de a: " + a);
        return a * a;
    }
}
