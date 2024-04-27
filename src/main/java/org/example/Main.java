package org.example;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    final Level VERBOSE = Level.forName("VERBOSE", 150);
    private static final Logger logger = LogManager.getLogger(Main.class);
    public static void main(String[] args) {
        Main app = new Main();
        if(logger.isErrorEnabled()){
            logger.error("Esto es un error");
            logger.info("Entering application");
            logger.debug("Esto es un debug Loggin");
            logger.log(app.VERBOSE, "A verbose message");
        }
    }
}