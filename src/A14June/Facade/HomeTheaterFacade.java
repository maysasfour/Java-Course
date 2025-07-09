package A14June.Facade;

public class HomeTheaterFacade {
    private final DVDPlayer dvd;
    private final Projector projector;
    private final SoundSystem sound;
    private final Lights lights;
    public HomeTheaterFacade(DVDPlayer dvd, Projector projector, SoundSystem sound, Lights lights) {
        this.dvd = dvd;
        this.projector = projector;
        this.sound = sound;
        this.lights = lights;
    }
    public void watchMovie(String movieTitle) {
        System.out.println("\n🎬 [Action] Preparing to watch: " + movieTitle);
        prepareEnvironment();
        dvd.load(movieTitle);
        dvd.play();
        sound.play();
        projector.play();
    }
    public void pauseMovie() {
        System.out.println("\n⏸ [Action] Pausing the movie...");
        dvd.pause();
        sound.pause();
        lights.on();
    }
    public void resumeMovie() {
        System.out.println("\n▶ [Action] Resuming the movie...");
        lights.dim();
        dvd.resume();
        sound.play();
    }
    public void stopMovie() {
        System.out.println("\n⏹ [Action] Stopping the movie...");
        dvd.stop();
        sound.stop();
        projector.stop();
        lights.on();
    }
    public void quitMovie() {
        System.out.println("\n❌ [Action] Quitting movie session...");
        stopMovie();
        dvd.eject();
        shutdownEnvironment();
    }
    public void loadMovie(String movieTitle) {
        System.out.println("\n📥 [Action] Loading movie: " + movieTitle);
        dvd.load(movieTitle);
    }
    public void seekMovie(int seconds) {
        System.out.println("\n⏩ [Action] Seeking movie to " + seconds + " seconds...");
        dvd.seek(seconds);
    }
    public void loopMovie(int times) {
        System.out.println("\n🔁 [Action] Looping movie " + times + " time(s)...");
        dvd.loop(times);
        sound.loop(times);
    }
    public void hideMovie() {
        System.out.println("\n🙈 [Action] Hiding movie (muting + turning off projector)...");
        sound.mute();
        projector.off();
    }
    public void diminishMovie() {
        System.out.println("\n🌫 [Action] Diminishing movie settings (visual/audio)...");
        dvd.diminish();
        projector.diminish();
        sound.dim(30);
        lights.dimTo(20);
    }
    public void restartMovie() {
        System.out.println("\n🔄 [Action] Restarting movie playback...");
        dvd.stop();
        dvd.play();
        sound.restart();
    }
    public void reloadMovie() {
        System.out.println("\n🔃 [Action] Reloading movie system...");
        dvd.reload();
        sound.reload();
    }
    public void sleepSystem(long millis) {
        System.out.println("\n😴 [Action] Putting system to sleep for " + millis + "ms...");
        sound.sleep(millis);
        lights.dimTo(10);
        projector.suspend();
    }
    public void discardMovie() {
        System.out.println("\n🗑 [Action] Discarding movie from system...");
        dvd.discard();
    }
    private void prepareEnvironment() {
        lights.dim();
        projector.on();
        projector.adjustFocus();
        projector.moveBackLeftRight();
        sound.on();
        dvd.on();
    }
    private void shutdownEnvironment() {
        lights.off();
        sound.off();
        projector.off();
        dvd.off();
    }
}
