package A14June.Facade;

public class SoundSystem {

    public SoundSystem() {
        System.out.println("Sound System initialized.");
    }

    public void on() {
        System.out.println("Sound system is ON.");
    }

    public void off() {
        System.out.println("Sound system is OFF.");
    }

    public void play() {
        System.out.println("Sound is playing.");
    }

    public void pause() {
        System.out.println("Sound playback paused.");
    }

    public void stop() {
        System.out.println("Sound playback stopped.");
    }

    public void restart() {
        System.out.println("Sound restarted from beginning.");
    }

    public void reload() {
        System.out.println("Reloading sound buffer.");
    }

    public void sleep(long milliseconds) {
        System.out.println("Sound system sleeping for " + milliseconds + " ms.");
    }

    public void dim(int level) {
        System.out.println("Dimming sound to level: " + level + "%.");
    }

    public void mix(int strength) {
        System.out.println("Mixing sound with strength: " + strength + "%.");
    }

    public void wave(int intensity) {
        System.out.println("Sound wave effect with intensity: " + intensity + "%.");
    }

    public void loop(int times) {
        System.out.println("Looping sound " + times + " times.");
    }

    public void mute() {
        System.out.println("Sound is muted.");
    }
}
