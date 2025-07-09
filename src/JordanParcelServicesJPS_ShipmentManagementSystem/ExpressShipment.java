package JordanParcelServicesJPS_ShipmentManagementSystem;

import java.util.Date;

public class ExpressShipment extends Shipment {
    private double urgencyLevel;

    public ExpressShipment(int trackingNumber, double weight, Date shipmentDate, Client sender, Client receiver, Driver assignedDriver, Vehicle assignedVehicle, double urgencyLevel) {
        super(trackingNumber, weight, shipmentDate, sender, receiver, assignedDriver, assignedVehicle);
        this.urgencyLevel = urgencyLevel;
    }

    @Override
    public double calculateCost() {
        return getWeight() * 2.0 * urgencyLevel;
    }
}
