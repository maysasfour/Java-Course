package A14June.FactoryMethod;

public class DeliveryFactory {
    public static Delivery create(String type) {
        if (type == null) {
            throw new IllegalArgumentException("Delivery type cannot be null");
        }

        switch (type.toLowerCase()) {
            case "stand":
                return new StandardDelivery(5.0, 1.5);
            case "express":
                return new ExpressDelivery(10.0, 2.5);
            case "inter":
                return new InternationalDelivery(20.0, 3.0, 15.0);

            default:
                throw new IllegalArgumentException("Unknown delivery type: " + type);
        }
    }
}