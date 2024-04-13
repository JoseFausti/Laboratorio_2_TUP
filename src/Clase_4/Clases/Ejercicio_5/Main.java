package Clase_4.Clases.Ejercicio_5;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear una lista de sucursales para el restaurante
        List<Sucursal> sucursalesRestaurante = new ArrayList<>();
        Sucursal sucursalPrincipal = new Sucursal();
        sucursalesRestaurante.add(sucursalPrincipal);

        // Crear un restaurante
        Restaurante restaurantePrincipal = new Restaurante("La Terraza", sucursalesRestaurante);

        // Agregar platos al restaurante
        restaurantePrincipal.AgregarPlato(TipoPlatos.PASTA);
        restaurantePrincipal.AgregarPlato(TipoPlatos.ENSALADA);
        // Agregar más platos según sea necesario

        // Crear una persona
        Persona cliente1 = new Persona("María");

        // Agregar platos favoritos a la persona
        cliente1.getPlatosFavoritos().add(TipoPlatos.PASTA);
        cliente1.getPlatosFavoritos().add(TipoPlatos.ENSALADA);
        // Agregar más platos favoritos según sea necesario

        // Crear un plato en una sucursal específica del restaurante
        Plato platoPrincipal = new Plato("Spaghetti Carbonara", "Sucursal Principal");

        // Agregar el plato a la sucursal
        sucursalPrincipal.getPlatos().add(platoPrincipal);

        // Crear una ciudad
        Ciudad ciudadPrincipal = new Ciudad("Ciudad Metropolitana");

        // Agregar el restaurante a la ciudad
        ciudadPrincipal.getRestaurantes().add(restaurantePrincipal);
    }
}
