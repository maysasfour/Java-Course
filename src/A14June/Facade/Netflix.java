package A14June.Facade;

public class Netflix {
    public static void main(String[] args) {

        DVDPlayer dvdPlayer = new DVDPlayer();
        Projector projector = new Projector();
        SoundSystem soundSystem = new SoundSystem();
        Lights lights = new Lights();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(dvdPlayer, projector, soundSystem, lights);

        pause(1000);
        homeTheater.watchMovie("Fast and Furious 10 Part 1");

        pause(2000);
        homeTheater.pauseMovie();

        pause(1500);
        homeTheater.resumeMovie();

        pause(2000);
        homeTheater.seekMovie(85);

        pause(1500);
        homeTheater.loopMovie(2);

        pause(1500);
        homeTheater.diminishMovie();

        pause(1500);
        homeTheater.sleepSystem(3000);

        pause(2000);
        homeTheater.reloadMovie();

        pause(1500);
        homeTheater.restartMovie();

        pause(1500);
        homeTheater.hideMovie();

        pause(1500);
        homeTheater.quitMovie();
    }
    private static void pause(long milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            System.err.println("Pause interrupted: " + e.getMessage());
        }
    }
}
