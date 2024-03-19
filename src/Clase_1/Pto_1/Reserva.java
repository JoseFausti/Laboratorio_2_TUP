package Clase_1.Pto_1;

import java.util.ArrayList;

public class Reserva extends Persona {
    // Atributo privado
    private String reservaVuelo;
    private ArrayList<Vuelo> vuelos; // Relacion de Agregacion de la Clase Vuelos en la Clase Clase_1.Pto_1.Reserva

    // Constructor
    public Reserva(int id, int dni, String nombreCompleto, String reservaVuelo) {
        super(id, dni, nombreCompleto);
        this.reservaVuelo = reservaVuelo;
        this.vuelos = new ArrayList<>(); // Inicializar la lista de vuelos
    }

    // Getter para reservaVuelo
    public String getReservaVuelo() {
        return reservaVuelo;
    }

    // Setter para reservaVuelo
    public void setReservaVuelo(String reservaVuelo) {
        this.reservaVuelo = reservaVuelo;
    }

    // Método para agregar un vuelo a la reserva
    public void AgregarVuelo(Vuelo vuelo) {
        vuelos.add(vuelo); // Agregar el vuelo a la lista de vuelos
    }


    // Método para imprimir la información de la reserva
    @Override
    public void Informacion() {
        System.out.println("Información de la reserva:");
        System.out.println("ID: " + getId());
        System.out.println("DNI: " + getDni());
        System.out.println("Nombre: " + getNombreCompleto());
        System.out.println("Clase_1.Pto_1.Reserva de vuelo: " + reservaVuelo);
        for (Vuelo vuelo : vuelos) {
            vuelo.Informacion(); // Imprimir información de cada vuelo
        }
    }
}
