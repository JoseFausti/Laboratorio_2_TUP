package Clase_5.Trabajo_Practico.Parte_A.Ejercicio_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el primer numero: ");
        String numero1 = sc.nextLine();
        System.out.print("Ingrese el segundo numero: ");
        String numero2 = sc.nextLine();
        try {
            int resultado = parametrosNulos(numero1, numero2);
            System.out.println("Resultado: " + resultado);
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error durante la ejecucion.");
            System.out.println("Causa: " + e.getMessage());
        }
    }

    private static int parametrosNulos(String numero1, String numero2) throws Exception {
        if ((numero1 == null || numero2 == null) || (numero1 == "" || numero2 == "")){
            throw new IllegalArgumentException("No se ingresaron parámetros.");
        }
        int resultado = errorDeFormato(numero1, numero2);
        return resultado;
    }


    private static int errorDeFormato(String number1, String number2) throws Exception{
        try {
            int num1 = Integer.parseInt(number1);
            int num2 = Integer.parseInt(number2);

            int resultado = divisionPorCero(num1,num2);
            return resultado;

        }catch (NumberFormatException e) {
            throw new NumberFormatException("Formato incorrecto.");
        }
    }

    private static int divisionPorCero(int num1,int num2) {
        try {
            int resultado = num1/num2;
            return resultado;
        }catch (ArithmeticException e){
            throw new ArithmeticException("No se puede dividir por cero.");
        }
    }
}
