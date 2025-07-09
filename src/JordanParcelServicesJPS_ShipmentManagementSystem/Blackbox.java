package JordanParcelServicesJPS_ShipmentManagementSystem;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Blackbox {
    private ArrayList<String> log = new ArrayList<>();
    private static Blackbox instance;

    private Blackbox() {
        log.add("Blackbox has been created");
    }

    public static Blackbox getInstance() {
        if (instance == null) {
            synchronized (Blackbox.class) {
                if (instance == null) {
                    instance = new Blackbox();
                }
            }
        }
        return instance;
    }

    public void record(String event) {
        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        log.add("[" + timestamp + "] " + event);
    }

    public void printLogBook() {
        for (String s : log) {
            System.out.println(s);
        }
    }

    public void clearLog() {
        log.clear();
        log.add("Log cleared.");
    }

    public String getLogs() {
        String logs = "";
        for (String s : log) {
            logs += s + "\n";
        }
        return logs;
    }
}
