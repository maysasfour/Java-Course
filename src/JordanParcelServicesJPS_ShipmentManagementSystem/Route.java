package JordanParcelServicesJPS_ShipmentManagementSystem;

import java.util.LinkedList;
import java.util.Iterator;
public class Route {
    private String sourceCity;
    private String destinationCity;
    private LinkedList<Shipment> shipments;
    public Route(String sourceCity, String destinationCity) {
        this.sourceCity = sourceCity;
        this.destinationCity = destinationCity;
        shipments = new LinkedList<>();
    }
    public String getSourceCity() {
        return sourceCity;
    }
    public void setSourceCity(String sourceCity) {
        this.sourceCity = sourceCity;
    }
    public String getDestinationCity() {
        return destinationCity;
    }
    public void setDestinationCity(String destinationCity) {
        this.destinationCity = destinationCity;
    }
    public LinkedList<Shipment> getShipments() {
        return shipments;
    }
    public void setShipments(LinkedList<Shipment> shipments) {
        this.shipments = shipments;
    }
    public void addShipment(Shipment shipment) {
        shipments.add(shipment);
    }
    public Iterator<Shipment> shipmentIterator() {
        return shipments.iterator();
    }
    @Override
    public String toString() {
        return "Route{" +
                "sourceCity='" + sourceCity + '\'' +
                ", destinationCity='" + destinationCity + '\'' +
                ", shipments=" + shipments +
                '}';
    }
}
