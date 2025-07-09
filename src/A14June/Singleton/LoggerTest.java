package A14June.Singleton;
import java.time.LocalDate;
import java.time.LocalTime;

public class LoggerTest {
    public static void main(String[] args) {
        Logger logger =  Logger.getInstance();
        logger.log("Application started " + LocalDate.now()+ " "+ LocalTime.now());
        logger.log("User login successful " + LocalDate.now()+ " "+ LocalTime.now());
        logger.printLogBook();
    }
}
