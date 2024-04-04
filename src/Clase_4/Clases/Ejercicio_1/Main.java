package Clase_4.Clases.Ejercicio_1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear instancias de Punto
        Punto punto1 = new Punto(0, 0);
        Punto punto2 = new Punto(1, 1);
        Punto punto3 = new Punto(2, 2);
        Punto punto4 = new Punto(3, 3);

        // Crear instancias de Lado
        Lado lado1 = new Lado();
        lado1.setPuntos(new Punto[]{punto1, punto2});

        Lado lado2 = new Lado();
        lado2.setPuntos(new Punto[]{punto2, punto3});

        Lado lado3 = new Lado();
        lado3.setPuntos(new Punto[]{punto3, punto4});

        Lado lado4 = new Lado();
        lado4.setPuntos(new Punto[]{punto4, punto1});

        // Crear instancias de Poligono
        Poligono poligono1 = new Poligono(3); // Triángulo
        poligono1.getLados().add(lado1);
        poligono1.getLados().add(lado2);
        poligono1.getLados().add(lado3);

        Poligono poligono2 = new Poligono(4); // Cuadrilátero
        poligono2.getLados().add(lado1);
        poligono2.getLados().add(lado2);
        poligono2.getLados().add(lado3);
        poligono2.getLados().add(lado4);

        // Crear instancia de Figura
        Figura figura = new Figura();

        // Agregar polígonos a la figura
        figura.getPoligonos().add(poligono1);
        figura.getPoligonos().add(poligono2);

        // Obtener los polígonos de la figura
        List<Poligono> poligonos = figura.getPoligonos();

        // Imprimir información de los polígonos
        for (Poligono poligono : poligonos) {
            System.out.println("Poligono:");
            List<Lado> lados = poligono.getLados();
            for (Lado lado : lados) {
                System.out.println("   Lado:");
                Punto[] puntos = lado.getPuntos();
                for (Punto punto : puntos) {
                    System.out.println("      Punto: (" + punto.getX() + ", " + punto.getY() + ")");
                }
            }
        }
    }
}
