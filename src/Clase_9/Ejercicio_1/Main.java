package Clase_9.Ejercicio_1;

public class Main {
    public static void main(String[] args){
        try {
            // Numeros enteros
            Calculadora<Integer> calculadoraEnteros = new Calculadora<>();
            int a = 10;
            int b = 5;
            System.out.println("Suma: " + calculadoraEnteros.sumar(a, b));
            System.out.println("Resta: " + calculadoraEnteros.restar(a, b));
            System.out.println("Multiplicación: " + calculadoraEnteros.multiplicar(a, b));
            System.out.println("División: " + calculadoraEnteros.dividir(a, b));

            System.out.println("---------------------------------------------------------------");

            // Numeros decimales
            Calculadora<Double> calculadoraDecimales = new Calculadora<>();
            double x = 7.5;
            double y = 2.5;
            System.out.println("Suma: " + calculadoraDecimales.sumar(x, y));
            System.out.println("Resta: " + calculadoraDecimales.restar(x, y));
            System.out.println("Multiplicación: " + calculadoraDecimales.multiplicar(x, y));
            System.out.println("División: " + calculadoraDecimales.dividir(x, y));

            System.out.println("---------------------------------------------------------------");

            // Numeros punto Flotante
            Calculadora<Float> calculadoraPuntoFlotantes = new Calculadora<>();
            float n1 = 2.332f;
            float n2 = 2.33f;
            System.out.println("Suma: " + calculadoraPuntoFlotantes.sumar(n1, n2));
            System.out.println("Resta: " + calculadoraPuntoFlotantes.restar(n1, n2));
            System.out.println("Multiplicación: " + calculadoraPuntoFlotantes.multiplicar(n1, n2));
            System.out.println("División: " + calculadoraPuntoFlotantes.dividir(n1, n2));

        }catch (Exception e){
            e.getCause();
        }
    }
}
