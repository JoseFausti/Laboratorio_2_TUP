package Sobrecarga;

public class TestSobreCarga {

    public static void main(String[] args) {

        SobreCarga sob = new SobreCarga();
        double Resultado;

        // Llama a todas las versiones del test().

        sob.test();
        sob.test(10);
        sob.test(10, 20);
        Resultado = sob.test(123.25);
        System.out.println("Resultado con parametro double sob.test(123.25): " + Resultado);
    }
    }

