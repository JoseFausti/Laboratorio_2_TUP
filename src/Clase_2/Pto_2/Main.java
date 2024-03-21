package Clase_1.Pto_2;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Crear instancia de Piloto y mostrar información
        Piloto piloto1 = new Piloto("Carlos", "Gonzalez", "Licencia123");
        piloto1.volar(); // Sobrescribiendo el método volar() de la interfaz Volador
        piloto1.informacion(); // Mostrar información del piloto

        // Crear instancia de Avion y mostrar información
        Avion avion1 = new Avion("Boeing 737", "Boeing");
        avion1.informacion(); // Mostrar información del avión

        // Crear instancia de Vuelo y mostrar información
        Vuelo vuelo1 = new Vuelo("ABC123", "Ciudad A", "Ciudad B", new Date(), 200, avion1.getModelo(), avion1.getFabricante());
        vuelo1.informacion(); // Mostrar información del vuelo

        // Crear instancia de Pasajero y mostrar información
        Pasajero pasajero1 = new Pasajero("Juan", "Perez", 30);
        pasajero1.informacion(); // Mostrar información del pasajero

        // Crear instancia de Reserva y mostrar información
        Reserva reserva1 = new Reserva("Juan Pablo","Fernandez",31,pasajero1, 15, vuelo1);
        reserva1.informacion(); // Mostrar información de la reserva
    }
}

