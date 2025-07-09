package A14June.Singleton;

import java.util.ArrayList;

public class Logger {
    private Logger logger;

    public Logger() {

    }


    private static Logger instance;

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();

        }


        return instance;
    }

 private    ArrayList <String> logBook = new ArrayList<String>();

    public void log(String message) {
        logBook.add(message);
    }
    public void printLogBook() {
        for (String s : logBook) {
            System.out.println(s);
        }
    }

    public Logger(Logger logger) {
        this.logger = logger;
    }
}
