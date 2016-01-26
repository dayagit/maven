package day;
import org.slf4j.*;
import org.slf4j.LoggerFactory;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      //System.out.println( "Hello World!" );
	Logger logger=LoggerFactory.getLogger(App.class);
	logger.info("Hello World");
    }
}
