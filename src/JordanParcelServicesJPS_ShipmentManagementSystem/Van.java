package JordanParcelServicesJPS_ShipmentManagementSystem;

public class Van extends Vehicle {
    private double maxVolume;
    public Van(String model, String manufacturer, String registrationCode, double maxVolume) {
        super(model, manufacturer, registrationCode);
        this.maxVolume = maxVolume;
    }
    @Override
    public double calculateFuelConsumption(double distance) {
        return distance * (0.15 + maxVolume * 0.02);
    }
}
