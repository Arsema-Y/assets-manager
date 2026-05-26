package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class App {

        public static void main(String[] args) {
            // Create an ArrayList of Asset objects -------------------------
            List<Asset> assets = new ArrayList<>();

            // Load it with at least 2 Houses -------------------------------
            House house1;
            House house2;

            house1 = new House("Austin House", "2018-05-12", 250000, "123 Main St", 1, 1000, 2500);
            house2 = new House("Houston House", "2022-08-20", 150000, "456 Pine Ln", 3, 3000, 8000);

            assets.add(house1);
            assets.add(house2);

            // Load it with at least 2 Houses --------------------------------
            Vehicle car1;
            Vehicle car2;

            car1 = new Vehicle("Commute Sedan", "2020-03-15", 30000, "Toyota Camry", 2020, 45000);
            car2 = new Vehicle("Road trip Suv", "2012-11-02", 45000, "Jeep Wrangler", 2022, 140000);

            assets.add(car1);
            assets.add(car2);

            // Loop through the Asset collection ---------------------------------
            for (Asset asset : assets) {
                System.out.println("=========================================");
                System.out.println("Description:  " + asset.getDescription());
                System.out.println("Date Acquired: " + asset.getDateAcquired());
                System.out.println("Original Cost: $" + asset.getOriginalCost());
                System.out.println("Current Value: $" + asset.getValue());

                // downcastiing

            }
            System.out.println("\n-----==E==N==D==------------------------");
        }
    }

