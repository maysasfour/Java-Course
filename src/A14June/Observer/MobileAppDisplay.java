package A14June.Observer;

public class MobileAppDisplay implements Observer {
    @Override
    public void update(double temperature) {
        System.out.println("Mobile App: " + temperature);
    }
}
