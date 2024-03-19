package Clase_1.Pto_2;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Crear instancia de Piloto y volar
        Piloto piloto1 = new Piloto("Carlos", "Gonzalez", "Licencia123");
        piloto1.volar(); // Sobrescribiendo el método volar() de la interfaz Volador

        // Crear instancia de Avion y mostrar información
        Avion avion1 = new Avion("Boeing 737", "Boeing");
        System.out.println("Avión Modelo: " + avion1.getModelo());
        System.out.println("Avión Fabricante: " + avion1.getFabricante());

        // Crear instancia de Vuelo y mostrar información
        Vuelo vuelo1 = new Vuelo("ABC123", "Ciudad A", "Ciudad B", new Date(), 200, avion1.getModelo(), avion1.getFabricante());
        System.out.println("Número de Vuelo: " + vuelo1.getNumeroVuelo());
        System.out.println("Origen: " + vuelo1.getOrigen());
        System.out.println("Destino: " + vuelo1.getDestino());
        System.out.println("Fecha: " + vuelo1.getFecha());
        System.out.println("Capacidad: " + vuelo1.getCapacidad());

        // Crear instancia de Pasajero y mostrar información
        Pasajero pasajero1 = new Pasajero("Juan", "Perez", 30);
        System.out.println("Nombre del Pasajero: " + pasajero1.nombre);
        System.out.println("Apellido del Pasajero: " + pasajero1.apellido);
        System.out.println("Edad del Pasajero: " + pasajero1.getEdad());

        // Crear instancia de Reserva y mostrar información
        Reserva reserva1 = new Reserva(pasajero1, 15, vuelo1);
        System.out.println("Reserva realizada para el asiento: " + reserva1.getAsiento());
    }
}
