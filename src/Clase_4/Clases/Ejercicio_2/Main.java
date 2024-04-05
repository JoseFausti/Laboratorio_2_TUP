package Clase_4.Clases.Ejercicio_2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear ciudades
        Ciudad ciudad1 = new Ciudad("Ciudad A");
        Ciudad ciudad2 = new Ciudad("Ciudad B");
        Ciudad ciudad3 = new Ciudad("Ciudad C");

        // Crear provincias
        List<Ciudad> ciudadesProvincia1 = new ArrayList<>();
        ciudadesProvincia1.add(ciudad1);
        ciudadesProvincia1.add(ciudad2);
        Provincia provincia1 = new Provincia("Provincia A",ciudadesProvincia1);

        List<Ciudad> ciudadesProvincia2 = new ArrayList<>();
        ciudadesProvincia2.add(ciudad3);
        Provincia provincia2 = new Provincia("Provincia B",ciudadesProvincia2);

        // Crear países
        List<Provincia> provinciasPais1 = new ArrayList<>();
        provinciasPais1.add(provincia1);
        Pais pais1 = new Pais("Pais A",provinciasPais1);

        List<Provincia> provinciasPais2 = new ArrayList<>();
        provinciasPais2.add(provincia2);
        Pais pais2 = new Pais("Pais B",provinciasPais2);

        // Crear continentes
        List<Pais> paisesContinente = new ArrayList<>();
        paisesContinente.add(pais1);
        paisesContinente.add(pais2);
        Continente continente = new Continente("Continente A",paisesContinente);


        // Ejemplo de acceso a las ciudades de una provincia
        System.out.println("Ciudades en " + provincia1.getProvincia());
        for (Ciudad ciudad : provincia1.getCiudades()) {
            System.out.println(ciudad.getCiudad());
        }
        System.out.println("Ciudades en " + provincia2.getProvincia());
        for (Ciudad ciudad : provincia2.getCiudades()) {
            System.out.println(ciudad.getCiudad());
        }

        System.out.println("----------------------------------------");

        // Ejemplo de acceso a las provincias de un país
        System.out.println("Provincias en " + pais1.getPais());
        for (Provincia provincia : pais1.getprovincias()) {
            System.out.println(provincia.getProvincia());
        }
        System.out.println("Provincias en " + pais2.getPais());
        for (Provincia provincia : pais2.getprovincias()) {
            System.out.println(provincia.getProvincia());
        }

        System.out.println("----------------------------------------");

        // Ejemplo de acceso a los países de un continente
        System.out.println("Países en " + continente.getContinente());
        for (Pais pais : continente.getpaises()) {
            System.out.println(pais.getPais());
        }
    }
}
