package Clase_5.Trabajo_Practico.Parte_B.Ejercicio_4;

public class Main {
    public static void main(String[] args) {
        try {
            metodo1();
        } catch (Exception e) {
            System.out.println("Excepción capturada en el método main: " + e.getMessage());
        }
    }

    public static void metodo1() throws Exception {
        metodo2();
    }

    public static void metodo2() throws Exception {
        metodo3();
    }

    public static void metodo3() throws Exception {
        metodo4();
    }

    public static void metodo4() throws Exception {
        throw new Exception("Excepción lanzada en el método metodo4");
    }
}
