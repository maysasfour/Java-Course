package A14June.Facade;

public class Lights {

    private int brightness = 100;

    public Lights() {
        System.out.println("Lights system initialized.");
    }

    public void on() {
        brightness = 100;
        System.out.println("Lights turned ON at full brightness.");
    }

    public void off() {
        brightness = 0;
        System.out.println("Lights turned OFF.");
    }

    public void dim() {
        brightness = 50;
        System.out.println("Lights dimmed to 50%.");
    }

    public void dimTo(int level) {
        if (level < 0) level = 0;
        if (level > 100) level = 100;
        brightness = level;
        System.out.println("Lights dimmed to " + brightness + "%.");
    }

    public int getBrightness() {
        return brightness;
    }
}
