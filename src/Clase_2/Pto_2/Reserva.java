package Clase_1.Pto_2;

// Definición de la clase Reserva
public class Reserva extends Pasajero{
    private Persona pasajero;
    private int asiento;
    private Vuelo vuelo; // Relación de agregación

    //Contructor
    public Reserva(String nombre, String apellido, int edad, Persona pasajero, int asiento, Vuelo vuelo) {
        super(nombre, apellido, edad);
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

    // Método para mostrar la información
    public void informacion() {
        System.out.println("Información del Pasajero:");
        pasajero.informacion();
        System.out.println("Número de asiento: " + asiento);
        System.out.println("Información del Vuelo:");
        vuelo.informacion();
    }
}