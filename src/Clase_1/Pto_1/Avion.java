package Clase_1.Pto_1;

public class Avion {
    private String modelo;
    private String fabricante;
    private int capacidadPasajeros;

    public Avion(String modelo, String fabricante, int capacidadPasajeros) {
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.capacidadPasajeros = capacidadPasajeros;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public int getCapacidadPasajeros() {
        return capacidadPasajeros;
    }

    public void setCapacidadPasajeros(int capacidadPasajeros) {
        this.capacidadPasajeros = capacidadPasajeros;
    }

    // Método para imprimir la información del avión
    public void Informacion() {
        System.out.println("Información del avión:");
        System.out.println("Modelo: " + modelo);
        System.out.println("Fabricante: " + fabricante);
        System.out.println("Capacidad de Pasajeros: " + capacidadPasajeros);
    }
}
