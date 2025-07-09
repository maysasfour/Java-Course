package JordanParcelServicesJPS_ShipmentManagementSystem;

import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args)
    {
        Client sender = new Client("Miso", "2000555680", "Dahyet Al rasheed", "", "1");
        Client receiver = new Client("Mido", "1951104053", "Um summaq", "mhmad.saleh95@yahoo.com", "2");

        System.out.println(sender.toString());
        System.out.println(receiver.toString());



        Set<String> langs = new HashSet<>(Arrays.asList("Arabic", "English"));
        Driver driver = new Driver("Fadi", "1122334455", "Zarqa");

        Vehicle truck = new Truck("T-500", "Volvo", "REG123", 10);
        Vehicle van = new Van("V-300", "Mercedes", "REG456", 20);

        Shipment s1 = ShipmentFactory.createShipment("Regular", 34354, 15.0, new Date(), sender, receiver, driver, truck, 0);
        Shipment s2 = ShipmentFactory.createShipment("Express", 35454, 10.0, new Date(), sender, receiver, driver, van, 2);

        Route route = new Route("Amman", "Irbid");
        route.addShipment(s1);
        route.addShipment(s2);

        for (Shipment s : route.getShipments()) {
            s.printDetails();
            System.out.println("Cost: " + s.calculateCost());
        }

        truck.getBlackBox().record("Engine started");
        truck.getBlackBox().record("Parcel loaded");

        System.out.println("Truck Logs: " + truck.getBlackBox().getLogs());
    }
    }

