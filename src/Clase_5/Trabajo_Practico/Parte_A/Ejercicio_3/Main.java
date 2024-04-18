package Clase_5.Trabajo_Practico.Parte_A.Ejercicio_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número entero: ");
        String input = sc.nextLine();
        try {
            int numero = Integer.parseInt(input);
            System.out.println("El número ingresado es: " + numero + ".");
        }catch (NumberFormatException e){
            System.out.println("Error: El valor ingresado no es un número entero.");
            System.out.println("Mensaje de la excepción: " + e.getMessage());
        }
    }
}
