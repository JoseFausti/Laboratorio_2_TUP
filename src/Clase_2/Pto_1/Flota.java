package Clase_1.Pto_1;

import java.util.ArrayList;
import java.util.List;

public class Flota {
    // Atributos privados
    private String empresa;
    private List<Avion> aviones;

    // Constructor
    public Flota(String empresa) {
        this.empresa = empresa;
        this.aviones = new ArrayList<>();
    }

    // Getter para empresa
    public String getEmpresa() {
        return empresa;
    }

    // Setter para empresa
    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    // Método para agregar un avión a la flota
    public void agregarAvion(Avion avion) {
        aviones.add(avion);
    }

    // Método para obtener la lista de aviones
    public List<Avion> getAviones() {
        return aviones;
    }

    // Método para imprimir la información de la flota
    public void Informacion() {
        System.out.println("Información de la flota:");
        System.out.println("Empresa: " + empresa);
        System.out.println("Aviones en la flota:");
        for (Avion avion : aviones) {
            avion.Informacion(); // Imprimir la información de cada avión
        }
    }
}
