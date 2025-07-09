package A14June.FactoryMethod;

import java.util.Scanner;

public class FactoryDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            while (true) {
                printMenu();
                String choice = sc.next();

                if (choice.equalsIgnoreCase("exit")) {
                    break;
                }

                try {
                    Delivery delivery = DeliveryFactory.create(choice);

                    System.out.print("Enter distance in km: ");
                    double distance = sc.nextDouble();

                    double cost = delivery.calculateCost(distance);
                    System.out.printf("Delivery cost for %.2f km: $%.2f%n", distance, cost);

                    System.out.println("Press Enter to continue or type 'exit' to quit");
                    sc.nextLine();
                    if (sc.nextLine().equalsIgnoreCase("exit")) {
                        break;
                    }
                } catch (IllegalArgumentException e) {
                    System.out.println("Error: " + e.getMessage());
                }
            }
        } finally {
            sc.close();
            System.out.println("Thank you for using our delivery calculator!");
        }
    }

    private static void printMenu() {
        System.out.println("\n===== Delivery Calculator =====");
        System.out.println("1. Enter 'stand' for Standard Delivery");
        System.out.println("2. Enter 'express' for Express Delivery");
        System.out.println("3. Enter 'inter' for International Delivery");
        System.out.println("4. Enter 'exit' to quit");
        System.out.print("Your choice: ");
    }
}