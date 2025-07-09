package JordanParcelServicesJPS_ShipmentManagementSystem;

import java.util.Date;

public abstract class Shipment implements IPrintable {
    private int trackingNumber;
    private double weight;
    private Date shipmentDate;
    private Client sender;
    private Client receiver;
    private Driver assignedDriver;
    private Vehicle assignedVehicle;

    public Shipment(int trackingNumber, double weight, Date shipmentDate,
                    Client sender, Client receiver, Driver assignedDriver, Vehicle assignedVehicle) {
        this.trackingNumber = trackingNumber;
        this.weight = weight;
        this.shipmentDate = shipmentDate;
        this.sender = sender;
        this.receiver = receiver;
        this.assignedDriver = assignedDriver;
        this.assignedVehicle = assignedVehicle;
    }

    public int getTrackingNumber() {
        return trackingNumber;
    }

    public void setTrackingNumber(int trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Date getShipmentDate() {
        return shipmentDate;
    }

    public void setShipmentDate(Date shipmentDate) {
        this.shipmentDate = shipmentDate;
    }

    public Client getSender() {
        return sender;
    }

    public void setSender(Client sender) {
        this.sender = sender;
    }

    public Client getReceiver() {
        return receiver;
    }

    public void setReceiver(Client receiver) {
        this.receiver = receiver;
    }

    public Driver getAssignedDriver() {
        return assignedDriver;
    }

    public void setAssignedDriver(Driver assignedDriver) {
        this.assignedDriver = assignedDriver;
    }

    public Vehicle getAssignedVehicle() {
        return assignedVehicle;
    }

    public void setAssignedVehicle(Vehicle assignedVehicle) {
        this.assignedVehicle = assignedVehicle;
    }

    public void regularShipment() {
        System.out.println("Shipment is being processed");
    }

    public void expressShipment() {
        System.out.println("Shipment is being processed");
    }

    public abstract double calculateCost();

    @Override
    public void printDetails() {
        System.out.println("Tracking Number: " + trackingNumber);
        System.out.println("Weight: " + weight);
        System.out.println("Sender: " + sender.getName());
        System.out.println("Receiver: " + receiver.getName());
    }

    @Override
    public String toString() {
        return "Shipment{" +
                "trackingNumber=" + trackingNumber +
                ", weight=" + weight +
                ", shipmentDate=" + shipmentDate +
                ", sender=" + sender +
                ", receiver=" + receiver +
                ", assignedDriver=" + assignedDriver +
                ", assignedVehicle=" + assignedVehicle +
                '}';
    }
}
