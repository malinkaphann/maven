package malinka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 *
 */
public class App {

    private static final Logger logger = LoggerFactory.getLogger(App.class);

    public static void main( String[] args ) {
        logger.info("here is info");
        System.out.println( "Hello World!" );
        logger.info("here is info end");
    }
}
