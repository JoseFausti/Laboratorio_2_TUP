package Clase_5.Trabajo_Practico.Parte_B.Ejercicio_2;

public class Main {
    public static void main(String[] args) {
        // Crear un objeto Matricula con una fecha de vencimiento válida
        Matricula matricula1 = new Matricula(12345, false);

        // Crear un objeto Matricula con una fecha de vencimiento vencida
        Matricula matricula2 = new Matricula(54321, true);

        // Crear un Chofer con una matrícula válida
        try {
            Chofer chofer1 = new Chofer("Juan", matricula1);
            chofer1.matriculaVencida();
            System.out.println("El Chofer " + chofer1.getNombre() + " ha sido creado correctamente.");
        } catch (matriculaVencidaException e) {
            System.out.println("No se pudo crear el Chofer debido a una matrícula vencida: " + e.getMessage());
        }

        // Crear un Chofer con una matrícula vencida
        try {
            Chofer chofer2 = new Chofer("Pedro", matricula2);
            chofer2.matriculaVencida();
            System.out.println("El Chofer " + chofer2.getNombre() + " ha sido creado correctamente.");
        } catch (matriculaVencidaException e) {
            System.out.println("No se pudo crear el Chofer debido a una matrícula vencida: " + e.getMessage());
        }

        // Crear un Auto
        Auto auto = new Auto(0);
        System.out.println("Se ha creado un Auto.");

        // Crear un Camion
        Camion camion = new Camion(0);
        System.out.println("Se ha creado un Camion.");

        // Intentar acelerar el Auto
        try {
            auto.acelera();
            System.out.println("El Auto ha acelerado correctamente.");
            System.out.println("Velocidad: " + auto.getVelocidad());
        } catch (miException e) {
            System.out.println("El Auto no pudo acelerar debido a una excepción: " + e.getMessage());
        }

        // Intentar acelerar el Camion
        try {
            camion.acelera();
            System.out.println("El Camion ha acelerado correctamente.");
            System.out.println("Velocidad: " + camion.getVelocidad());
        } catch (miException e) {
            System.out.println("El Camion no pudo acelerar debido a una excepción: " + e.getMessage());
        }
    }
}
