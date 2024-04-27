package Trabajo_Practico_Log4j.Ejercicio_3.Punto_a;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    // Obtener una instancia de Logger para la clase actual
    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        // Enviar un mensaje de logging
        logMessage("Este es un mensaje de prueba.");
    }

    // Método para enviar mensajes de logging
    private static void logMessage(String message) {
        // Loggear el mensaje con nivel INFO
        logger.log(Level.INFO, message);
    }
}

