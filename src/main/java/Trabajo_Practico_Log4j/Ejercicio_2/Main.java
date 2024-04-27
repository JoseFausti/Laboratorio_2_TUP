package Trabajo_Practico_Log4j.Ejercicio_2;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    final Level miLogLevel = Level.forName("nivel de logging personalizado", 150);
    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        Main app = new Main();
        if (logger.isErrorEnabled()){
            logger.log(app.miLogLevel,"mensaje desde log personalizado");
        }
    }

}

// Como crear el nuevo nivel de logging desde el archivo de configuración:
/*
    <?xml version="1.0" encoding="UTF-8"?>
    <Configuration status="INFO">
        <Appenders>
    <!-- Definir appenders aquí -->
        </Appenders>
            <Loggers>
                <Root level="DEBUG">
                    <AppenderRef ref="CONSOLE"/>
                    <AppenderRef ref="FILE"/>
                </Root>
    <!-- Configuración para nuestro nuevo nivel de logging personalizado -->
        <Logger name="com.example" level="miLogLevel" additivity="false">
        <AppenderRef ref="CUSTOM_APPENDER"/>
        </Logger>
        </Loggers>
    </Configuration>
*/