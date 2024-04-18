package Clase_5.Trabajo_Practico.Parte_B.Ejercicio_3;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        try {
            int numero = generarNumeroAleatorio();
            System.out.println("Número generado: " + numero);
            verificarParidad(numero);
        } catch (ParidadException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int generarNumeroAleatorio() {
        Random rand = new Random();
        return rand.nextInt(100); // Genera un número aleatorio entre 0 y 99
    }

    public static void verificarParidad(int numero) throws ParidadException {
        if (numero % 2 == 0) {
            throw new ParidadException("El número es par.");
        } else {
            throw new ParidadException("El número es impar.");
        }
    }
}

