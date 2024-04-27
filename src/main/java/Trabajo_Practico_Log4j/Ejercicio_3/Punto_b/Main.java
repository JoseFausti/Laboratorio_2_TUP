package Trabajo_Practico_Log4j.Ejercicio_3.Punto_b;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
public class Main {
    // Obtener una instancia de Logger para la clase actual
    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        try {
            // Crear un manejador de archivos para redirigir el logging a un archivo llamado "log.txt"
            FileHandler fileHandler = new FileHandler("log.txt");
            // Formatear los mensajes de logging de manera sencilla
            fileHandler.setFormatter(new SimpleFormatter());
            // Agregar el manejador de archivos al Logger
            logger.addHandler(fileHandler);
        } catch (IOException e) {
            // Manejar cualquier excepción que pueda ocurrir al crear el manejador de archivos
            e.printStackTrace();
        }
        // Enviar un mensaje de logging
        logMessage("Este es un mensaje de prueba.");
    }

    // Método para enviar mensajes de logging
    private static void logMessage(String message) {
        // Loggear el mensaje con nivel INFO
        logger.log(Level.INFO, message);
    }
}


