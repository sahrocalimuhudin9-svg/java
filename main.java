package assigment;

import java.util.ArrayList;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<Delivery> deliveries = new ArrayList<>();

        System.out.print("How many deliveries? ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {

            System.out.print("Delivery " + i + " - type (R/E): ");
            String type = input.next();

            System.out.print("Delivery " + i + " - distance (km): ");
            int distance = input.nextInt();

            System.out.print("Delivery " + i + " - weight (kg): ");
            int weight = input.nextInt();

            if (type.equalsIgnoreCase("R")) {
                deliveries.add(new RegularDelivery(distance, weight));
            } else if (type.equalsIgnoreCase("E")) {
                deliveries.add(new ExpressDelivery(distance, weight));
            }
        }

        long total = 0;

        System.out.println("\n--- DELIVERY FEE SUMMARY ---");

        for (int i = 0; i < deliveries.size(); i++) {

            long fee = deliveries.get(i).calculateFee();

            System.out.println("Delivery " + (i + 1) + ": " + fee + " units");

            total += fee;
        }

        System.out.println("Total delivery fees: " + total + " units");

        input.close();
    }
}
