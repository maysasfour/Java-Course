package A14June.FactoryMethod;

public class ExpressDelivery implements Delivery {
    private final double baseFee;
    private final double costPerKm;

    public ExpressDelivery(double baseFee, double costPerKm) {
        this.baseFee = baseFee;
        this.costPerKm = costPerKm;
    }

    @Override
    public double calculateCost(double distance) {
        return baseFee + (costPerKm * distance);
    }
}