package Clase_5.Trabajo_Practico.Parte_B.Ejercicio_1;

public class Main {
    public static void main(String[] args) {
        try {
            int resultado = dividir(10, 0);
            System.out.println("El resultado de la división es: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: División entre cero.");
        }
    }

    public static int dividir(int dividendo, int divisor) {
        return dividendo / divisor;
    }
}

