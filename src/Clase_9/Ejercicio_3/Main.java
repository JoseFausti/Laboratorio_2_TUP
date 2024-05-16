package Clase_9.Ejercicio_3;

public class Main {
    public static void main(String[] args) {
        // Crear una instancia de Almacen
        Almacen almacen = new Almacen();

        // Añadir varios productos de diferentes tipos
        Producto alimento = new Producto("Manzana", 2.5);
        Producto electronico = new Producto("Smartphone", 599.99);
        Producto ropa = new Producto("Camiseta", 19.99);

        almacen.añadirProducto(alimento);
        almacen.añadirProducto(electronico);
        almacen.añadirProducto(ropa);

        // Imprimir los productos almacenados
        System.out.println("Productos almacenados:");
        almacen.imprimirProductos(almacen.getProductos());
    }
}
