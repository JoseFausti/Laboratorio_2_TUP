package Clase_4.Clases.Ejercicio_7;

public class Main {
    public static void main(String[] args) {
        // Crear estaciones
        Pista[] pistasEstacion1 = {new Pista("E1", 5.2, "Dificil", 1), new Pista("E1", 3.5, "Moderado", 2)};
        Estacion estacion1 = new Estacion("E1", "Contacto1", "Dirección1", 10, "Estación1", 2, pistasEstacion1, "123456789");

        Pista[] pistasEstacion2 = {new Pista("E2", 6.8, "Dificil", 1), new Pista("E2", 4.3, "Moderado", 2)};
        Estacion estacion2 = new Estacion("E2", "Contacto2", "Dirección2", 15, "Estación2", 2, pistasEstacion2, "987654321");

        // Crear federaciones
        Estacion[] estacionesFederacion1 = {estacion1};
        Federacion federacion1 = new Federacion(estacionesFederacion1, "Federación1", 1000);

        Estacion[] estacionesFederacion2 = {estacion2};
        Federacion federacion2 = new Federacion(estacionesFederacion2, "Federación2", 1500);

        // Crear participantes
        Esquiador esquiador1 = new Esquiador("12345678A", 25, "01/01/1996", "Juan", 1, federacion1);
        Esquiador esquiador2 = new Esquiador("87654321B", 30, "01/01/1992", "Ana", 2, federacion2);
        Esquiador esquiador3 = new Esquiador("11111111C", 20, "01/01/2002", "Pedro", 3, federacion1);
        Esquiador esquiador4 = new Esquiador("22222222D", 35, "01/01/1987", "Maria", 4, federacion2);

        Esquiador[] esquiadoresEquipo1 = {esquiador1, esquiador2};
        Equipo equipo1 = new Equipo("Wolves","123", "Entrenador1", esquiadoresEquipo1,  2);

        Esquiador[] esquiadoresEquipo2 = {esquiador3, esquiador4};
        Equipo equipo2 = new Equipo("Winter rebels","456", "Entrenador2", esquiadoresEquipo2,  2);

        // Crear pruebas
        Participante[] participantesPrueba1 = {esquiador1, esquiador2};
        Prueba prueba1 = new Prueba("01/02/2024", "Prueba1", participantesPrueba1, 100, TipoPrueba.EQUIPOS);

        Participante[] participantesPrueba2 = {esquiador3, esquiador4};
        Prueba prueba2 = new Prueba("02/02/2024", "Prueba2", participantesPrueba2, 120, TipoPrueba.INDUVIDUAL);

        // Crear campeonato
        Prueba[] pruebasCampeonato = {prueba1, prueba2};
        Campeonato campeonato = new Campeonato("Campeonato1", pruebasCampeonato);

        // Obtener información de las instancias creadas
        System.out.println("Nombre de la estación 1: " + estacion1.getNombre());
        System.out.println("Nombre del esquiador 1: " + esquiador1.getNombre());
        System.out.println("Nombre de la federación 1: " + federacion1.getNombre());
        System.out.println("Nombre de la prueba 1: " + prueba1.getNombre());
        System.out.println("Nombre del equipo 1: " + equipo1.getNombre());
        System.out.println("Nombre del campeonato: " + campeonato.getNombre());
    }
}
