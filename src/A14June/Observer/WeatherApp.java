package A14June.Observer;

public class WeatherApp {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        weatherStation.addObserver(new MainScreenDisplay());
        weatherStation.addObserver(new MobileAppDisplay());
        weatherStation.addObserver(new EmailAlert());

        weatherStation.setTemperature(30.0);
        System.out.println("*****************");
        weatherStation.setTemperature(40.0);
    }
}
