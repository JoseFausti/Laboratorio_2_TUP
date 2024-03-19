package Clase_1.Pto_2;

// Definición de la clase Piloto que implementa la interfaz Volador
public class Piloto extends Persona implements Volador {
    private String licencia;

    public Piloto(String nombre, String apellido, String licencia) {
        super(nombre, apellido);
        this.licencia = licencia;
    }

    @Override
    public void volar() {
        System.out.println("El piloto " + nombre + " " + apellido + " está volando.");
    }

    // Getters y setters

    public String getLicencia() {
        return licencia;
    }

    public void setLicencia(String licencia) {
        this.licencia = licencia;
    }
}