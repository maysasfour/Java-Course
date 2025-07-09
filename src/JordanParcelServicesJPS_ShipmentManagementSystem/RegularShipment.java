package JordanParcelServicesJPS_ShipmentManagementSystem;

import java.util.Date;

public class RegularShipment extends Shipment {
    public RegularShipment(int trackingNumber, double weight, Date shipmentDate, Client sender, Client receiver, Driver assignedDriver, Vehicle assignedVehicle) {
        super(trackingNumber, weight, shipmentDate, sender, receiver, assignedDriver, assignedVehicle);
    }

    @Override
    public double calculateCost() {
        return getWeight() * 1.5;
    }
}
