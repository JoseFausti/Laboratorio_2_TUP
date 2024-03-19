package Clase_1.Pto_2;

// Definición de la clase Reserva
public class Reserva {
    private Persona pasajero;
    private int asiento;
    private Vuelo vuelo; // Relación de agregación

    public Reserva(Persona pasajero, int asiento, Vuelo vuelo) {
        this.pasajero = pasajero;
        this.asiento = asiento;
        this.vuelo = vuelo;
    }

    // Getters y setters

    public Persona getPasajero() {
        return pasajero;
    }

    public void setPasajero(Persona pasajero) {
        this.pasajero = pasajero;
    }

    public int getAsiento() {
        return asiento;
    }

    public void setAsiento(int asiento) {
        this.asiento = asiento;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }
}