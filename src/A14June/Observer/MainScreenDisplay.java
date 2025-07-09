package A14June.Observer;

public class MainScreenDisplay implements Observer {
    @Override
    public void update(double temperature) {
        System.out.println("Main Screen: " + temperature);
    }
}
