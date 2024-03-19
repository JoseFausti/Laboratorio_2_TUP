package Clase_1.Pto_2;

// Definición de la clase Avion
public class Avion {
    private String modelo;
    private String fabricante;

    public Avion(String modelo, String fabricante) {
        this.modelo = modelo;
        this.fabricante = fabricante;
    }

    // Getters y setters

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

    // Método para mostrar la información
    public void informacion() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Fabricante: " + fabricante);
    }
}