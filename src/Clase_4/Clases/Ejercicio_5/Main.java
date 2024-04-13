package Clase_4.Clases.Ejercicio_5;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear instancias de las clases
        Persona cliente1 = new Persona("María");
        Sucursal sucursalPrincipal = new Sucursal("La Terraza - San Martín");
        Restaurante restaurantePrincipal = new Restaurante("La Terraza", List.of(sucursalPrincipal));
        Plato platoPrincipal = new Plato("Spaghetti Carbonara", "Sucursal Principal");
        Ciudad ciudadPrincipal = new Ciudad("Ciudad Metropolitana");

        // Agregar platos al restaurante
        restaurantePrincipal.AgregarPlato(TipoPlatos.PASTA);
        restaurantePrincipal.AgregarPlato(TipoPlatos.ENSALADA);

        // Agregar platos favoritos a la persona
        cliente1.getPlatosFavoritos().add(TipoPlatos.PASTA);
        cliente1.getPlatosFavoritos().add(TipoPlatos.ENSALADA);

        // Agregar el plato a la sucursal
        sucursalPrincipal.getPlatos().add(platoPrincipal);

        // Agregar el restaurante a la ciudad
        ciudadPrincipal.getRestaurantes().add(restaurantePrincipal);

        // Mostrar los resultados por pantalla
        System.out.println("Restaurante:");
        System.out.println(restaurantePrincipal.getNombre());

        System.out.println("\nPersona:");
        System.out.println(cliente1.getNombre());

        System.out.println("\nSucursal:");
        System.out.println(sucursalPrincipal.getNombre());

        System.out.println("\nCiudad:");
        System.out.println(ciudadPrincipal.getNombre());
    }
}
