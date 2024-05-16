package Clase_9.Ejercicio_4;

public class Main {
    public static void main(String[] args) {
        Almacen almacen = new Almacen();
        Producto productoA = new Producto("Jabon",1.33);
        Producto productoB = new Producto("Smartphone",533.99);

        almacen.añadirElemento(productoA);
        almacen.añadirElemento(productoB);

        almacen.imprimirElementos(almacen.getElementos());
    }
}