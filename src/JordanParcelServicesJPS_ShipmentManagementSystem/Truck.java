package JordanParcelServicesJPS_ShipmentManagementSystem;

public class Truck extends Vehicle {
    private double loadCapacity;

    public Truck(String model, String manufacturer, String registrationCode, double loadCapacity) {
        super(model, manufacturer, registrationCode);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public double calculateFuelConsumption(double distance) {
        return distance * (0.2 + loadCapacity * 0.05);
    }
}
