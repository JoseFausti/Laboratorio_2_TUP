package Clase_9.Ejercicio_2;

public class Main {
    public static void main(String[] args) {
        // Crear una pila con capacidad para 5 elementos
        PilaArray<Integer> pila = new PilaArray<>(5);

        // Añadir elementos a la pila
        pila.aniadir(10);
        pila.aniadir(20);
        pila.aniadir(30);

        // Mostrar la pila
        System.out.println("Pila después de añadir elementos: " + pila);

        // Obtener el elemento en la cima de la pila
        System.out.println("Elemento en la cima de la pila: " + pila.primero());

        // Extraer un elemento de la pila
        System.out.println("Elemento extraído de la pila: " + pila.extraer());

        // Mostrar la pila después de extraer un elemento
        System.out.println("Pila después de extraer un elemento: " + pila);
    }
}

