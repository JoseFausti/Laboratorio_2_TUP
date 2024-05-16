package Clase_9.Ejercicio_4;

import java.util.ArrayList;
import java.util.List;

public class Almacen{
    private List<Producto> elementos;

    public Almacen() {
        this.elementos = new ArrayList<>();
    }

    //Getter y Setter
    public List<Producto> getElementos() {
        return elementos;
    }
    public void setElementos(List<Producto> elementos) {
        this.elementos = elementos;
    }

    public void añadirElemento(Producto elemento) {
        elementos.add(elemento);
    }

    public void imprimirElementos(List<? super Producto> lista) {
        for (int i = 0; i < lista.size(); i++) {
            Object elemento = lista.get(i);
            if (elemento instanceof Producto) {
                Producto producto = (Producto) elemento;
                System.out.println("Producto: " + producto.getNombre() + ", Precio: $" + producto.getPrecio());
            }
        }
    }
}


