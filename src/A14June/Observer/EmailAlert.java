package A14June.Observer;

public class EmailAlert implements Observer {
    @Override
    public void update(double temperature) {
        System.out.println("Email Alert: " + temperature);
    }
}
