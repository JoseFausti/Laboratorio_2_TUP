package Trabajo_Practico_Log4j.Ejercicio_1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Main {
    private static final Logger logger = LogManager.getLogger(org.example.Main.class);

    public static void main(String[] args) {
        Main app = new Main();
        if(logger.isErrorEnabled()) {
            logger.info("La aplicación se ha iniciado");
        }
    }
}
