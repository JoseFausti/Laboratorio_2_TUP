package Clase_9.Ejercicio_2;

import java.util.NoSuchElementException;

public class PilaArray<E> {

    private E[] arrayGenerico;
    private int contador;
    private int capacidad;

    public PilaArray(int capacidad) {
        this.capacidad = capacidad;
        arrayGenerico = (E[]) new Object[capacidad];
        contador = 0;
    }

    public boolean estaVacia() {
        return contador == 0;
    }

    public boolean aniadir(E elemento) {
        if (contador < capacidad) {
            arrayGenerico[contador++] = elemento;
            return true; // Se añadió correctamente
        } else {
            return false; // No se pudo añadir (pila llena)
        }
    }

    public E primero() {
        if (estaVacia()) {
            throw new NoSuchElementException("La pila está vacía");
        }
        return arrayGenerico[contador - 1]; // Devuelve el último elemento añadido
    }

    public E extraer() {
        if (estaVacia()) {
            throw new NoSuchElementException("La pila está vacía");
        }
        contador--; // Decrementa el contador
        E elementoExtraido = arrayGenerico[contador]; // Extrae el elemento
        arrayGenerico[contador] = null; // Elimina la referencia al elemento para evitar fugas de memoria
        return elementoExtraido;
    }

    //Sobreescritura del metodo toString()
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < contador; i++) {
            sb.append(arrayGenerico[i]);
            if (i < contador - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}

