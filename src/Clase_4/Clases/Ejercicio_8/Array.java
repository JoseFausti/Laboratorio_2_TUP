package Clase_4.Clases.Ejercicio_8;

import org.jetbrains.annotations.NotNull;

public class Array <A>{

    //Constructor
    protected Array() {
    }

    //Metodo
    @NotNull
    protected  <A> Object[] agregarElemento(A [] array , A elemento){
        // Obtener el tamaño actual del arreglo
        int tamanio = array.length;

        // Crear un nuevo arreglo con un tamaño incrementado en 1
        A[] nuevoArray = (A[]) new Object[tamanio + 1];

        // Copiar los elementos existentes al nuevo arreglo
        System.arraycopy(array, 0, nuevoArray, 0, tamanio);

        // Agregar el nuevo elemento al final del nuevo arreglo
        nuevoArray[tamanio] = elemento;

        return nuevoArray;
    }
}
