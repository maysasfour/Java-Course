package A14June.FactoryMethod;

public class StandardDelivery implements Delivery {
    private final double baseFee;
    private final double costPerKm;

    public StandardDelivery(double baseFee, double costPerKm) {
        this.baseFee = baseFee;
        this.costPerKm = costPerKm;
    }

    @Override
    public double calculateCost(double distance) {
        return baseFee + (costPerKm * distance);
    }
}