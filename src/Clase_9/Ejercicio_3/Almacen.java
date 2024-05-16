package Clase_9.Ejercicio_3;

import java.util.ArrayList;
import java.util.List;

public class Almacen{

    //Atributos
    private List <Producto> productos;

    //Constructor
    public Almacen() {
        this.productos = new ArrayList<>();
    }

    //Getter y Setter
    public List<Producto> getProductos() {
        return productos;
    }
    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    //Metodos
    public void añadirProducto(Producto producto) {
        productos.add(producto);
    }
    public void imprimirProductos(List<? extends Producto>lista) {
        for (Producto producto : lista) {
            System.out.println("Nombre: " + producto.getNombre() + ", Precio: " + producto.getPrecio());
        }
    }
}
