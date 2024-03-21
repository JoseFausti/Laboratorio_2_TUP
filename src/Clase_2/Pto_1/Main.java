package Clase_1.Pto_1;

public class Main {
    public static void main(String[] args) {
        // Crear instancias de las clases

        // Instancias de Clase_1.Pto_1.Avion
        Avion avion1 = new Avion("Boeing 737", "Boeing", 200);

        // Instancias de Clase_1.Pto_1.Piloto
        Piloto piloto1 = new Piloto(1, 12345678, "John Doe", 1001, "Airline Inc.");

        // Instancias de Clase_1.Pto_1.Flota
        Flota flota1 = new Flota("Airline Inc.");
        // Agregar avión a la flota
        flota1.agregarAvion(avion1);

        // Instancias de Clase_1.Pto_1.Reserva y Clase_1.Pto_1.Vuelo
        Reserva reserva1 = new Reserva(1, 98765432, "Jane Smith", "ABC123");
        // Agregar vuelo a la reserva
        reserva1.AgregarVuelo(new Vuelo(avion1,"Turkish Airlines" ,"2024-03-15"));

        Vuelo vuelo1 = new Vuelo(avion1, "Catar Airways","2024-03-16");

        // Llamar a métodos e imprimir información

        // Imprimir información de la flota
        flota1.Informacion();

        // Imprimir información del piloto
        piloto1.Informacion();

        // Imprimir información de la reserva
        reserva1.Informacion();

        // Imprimir información del vuelo
        vuelo1.Informacion();

        // Imprimir información del avion
        avion1.Informacion();
    }
}
