
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;


public class Main {
    final Level VERBOSE = Level.forName("VERBOSE", 150);

    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(final String... args)
    {

        Main app = new Main();

        if(logger.isErrorEnabled())
        logger.error("esto es un error");
        logger.info("Entering application.");
        logger.debug("esto es debug Logging!");
        logger.log(app.VERBOSE, "a verbose message");

    }
}
