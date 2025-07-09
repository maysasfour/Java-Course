package JordanParcelServicesJPS_ShipmentManagementSystem;
import java.util.Date;
public class ShipmentFactory {
    public static Shipment createShipment(String type, int trackingNumber, double weight, Date date, Client sender, Client receiver, Driver driver, Vehicle vehicle, double urgencyLevel) {
        if ("Express".equalsIgnoreCase(type)) {
            return new ExpressShipment(trackingNumber, weight, date, sender, receiver, driver, vehicle, urgencyLevel);
        } else {
            return new RegularShipment(trackingNumber, weight, date, sender, receiver, driver, vehicle);
        }
    }
}
