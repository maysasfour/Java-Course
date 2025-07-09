package A14June.Facade;

public class DVDPlayer {

    private String currentMovie;

    public DVDPlayer() {
        System.out.println("DVD Player initialized.");
    }

    public void on() {
        System.out.println("DVD Player is ON.");
    }

    public void off() {
        System.out.println("DVD Player is OFF.");
    }

    public void load(String movie) {
        this.currentMovie = movie;
        System.out.println("Loading movie: " + movie);
    }

    public void play() {
        if (currentMovie == null) {
            System.out.println("No movie loaded to play.");
        } else {
            System.out.println("Playing movie: " + currentMovie);
        }
    }

    public void pause() {
        System.out.println("DVD is paused.");
    }

    public void resume() {
        System.out.println("Resuming movie playback.");
    }

    public void stop() {
        System.out.println("Stopping the movie.");
    }

    public void eject() {
        if (currentMovie != null) {
            System.out.println("Ejecting movie: " + currentMovie);
            currentMovie = null;
        } else {
            System.out.println("No movie to eject.");
        }
    }

    public void seek(int seconds) {
        System.out.println("Seeking to " + seconds + " seconds in the movie.");
    }

    public void loop(int times) {
        System.out.println("Looping movie " + (currentMovie != null ? currentMovie : "(none)") + " for " + times + " times.");
    }

    public void diminish() {
        System.out.println("Diminishing video quality (simulated).");
    }

    public void discard() {
        System.out.println("Discarding current movie.");
        currentMovie = null;
    }

    public void dim() {
        System.out.println("Dimming DVD playback visuals.");
    }

    public void flip() {
        System.out.println("Flipping DVD sides.");
    }
    public void reload() {
        System.out.println("Reloading DVD sides.");
    }
}
