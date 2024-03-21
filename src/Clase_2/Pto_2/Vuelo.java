package Clase_1.Pto_2;

import java.util.Date;

// Definición de la clase Vuelo con composición de Avion
public class Vuelo {
    private String numeroVuelo;
    private String origen;
    private String destino;
    private Date fecha;
    private int capacidad;
    private Avion avion; // Relación de composición

    public Vuelo(String numeroVuelo, String origen, String destino, Date fecha, int capacidad, String modeloAvion, String fabricanteAvion) {
        this.numeroVuelo = numeroVuelo;
        this.origen = origen;
        this.destino = destino;
        this.fecha = fecha;
        this.capacidad = capacidad;
        this.avion = new Avion(modeloAvion, fabricanteAvion); // Creación del objeto Avion en el constructor
    }

    // Getters y setters

    public String getNumeroVuelo() {
        return numeroVuelo;
    }

    public void setNumeroVuelo(String numeroVuelo) {
        this.numeroVuelo = numeroVuelo;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public Avion getAvion() {
        return avion;
    }

    public void setAvion(Avion avion) {
        this.avion = avion;
    }

    // Método para mostrar la información
    public void informacion() {
        System.out.println("Número de vuelo: " + numeroVuelo);
        System.out.println("Origen: " + origen);
        System.out.println("Destino: " + destino);
        System.out.println("Fecha: " + fecha);
        System.out.println("Capacidad: " + capacidad);
        System.out.println("Información del Avión:");
        avion.informacion();
    }
}