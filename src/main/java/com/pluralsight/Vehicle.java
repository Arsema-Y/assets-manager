package com.pluralsight;
//muscle car, super car, sports car

import java.time.LocalDate;

public class Vehicle extends Asset{
    //unique Attributes_______________________
      private String makeModel;
      private int year;
      private double odometer;

    //Constructor_____________________________

    public Vehicle(String description, String dateAquired, double originalCost,
                   String makeModel, int year, double odometer) {
        super(description, dateAquired, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    //Getter__________________________________

    public String getMakeModel() {
        return makeModel;
    }

    public int getYear() {
        return year;
    }

    public double getOdometer() {
        return odometer;
    }


    //Setter__________________________________

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setOdometer(double odometer) {
        this.odometer = odometer;
    }

    //overriding parent's getter----------------
    @Override
    public double getValue() {

        int currentYear = LocalDate.now().getYear();
        int age = currentYear - this.year;
        double value;
       // Calculate value based on age-----------------------------
        if (age >= 0 && age <= 3) {
            value = getOriginalCost() - (getOriginalCost() * (0.03 * age));
        } else if (age >= 4 && age <= 6) {
            value = getOriginalCost() - (getOriginalCost() * (0.06 * age));
        } else if (age >= 7 && age <= 10) {
            value = getOriginalCost() - (getOriginalCost() * (0.08 * age));
        } else {
            value = 1000.00;
        }
        // Reduces final value by 25%-----------------------------
        if (this.odometer > 100000
                && !makeModel.contains("honda")
                && !makeModel.contains("toyota")
        ) {value = value * 0.75;}

        //------------------------------------
        return value;
    }
}

