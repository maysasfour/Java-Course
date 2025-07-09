package A14June.FactoryMethod;

public class InternationalDelivery implements Delivery {
    private final double baseFee;
    private final double costPerKm;
    private final double customsFee;

    public InternationalDelivery(double baseFee, double costPerKm, double customsFee) {
        this.baseFee = baseFee;
        this.costPerKm = costPerKm;
        this.customsFee = customsFee;
    }

    @Override
    public double calculateCost(double distance) {
        return baseFee + (costPerKm * distance) + customsFee;
    }
}