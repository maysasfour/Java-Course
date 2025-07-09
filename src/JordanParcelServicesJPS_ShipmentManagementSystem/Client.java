package JordanParcelServicesJPS_ShipmentManagementSystem;

import java.util.HashSet;
import java.util.Set;
public class Client extends Person {
    private String email;
    private String shipmentsSent;
    private static Set<String> clients = new HashSet<>();


    public Client(String name, String nationalID, String address, String email, String shipmentsSent) {
        super(name, nationalID, address);
        this.email = email;
        this.shipmentsSent = shipmentsSent;
        clients.add(super.getNationalID());
    }

    public Client(String email, String shipmentsSent) {
        this.email = email;
        this.shipmentsSent = shipmentsSent;

    }

    public Client(String name, String nationalID, String address) {
        super(name, nationalID, address);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getShipmentsSent() {
        return shipmentsSent;
    }

    public void setShipmentsSent(String shipmentsSent) {
        this.shipmentsSent = shipmentsSent;
    }

    public static Set<String> getClients() {
        return clients;
    }

    public static void setClients(Set<String> clients) {
        Client.clients = clients;
    }
}
