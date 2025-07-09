package A14June.Observer;

import java.util.ArrayList;


public class WeatherStation {
    private double temperature;
    private final ArrayList<Observer> observers = new ArrayList<>();

    public void addObserver(Observer o) {
        observers.add(o);
    }

    public void setTemperature(double temp) {
        temperature = temp;
        notifyObservers();
    }

    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature);
        }
    }
}
