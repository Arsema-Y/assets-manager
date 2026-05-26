package com.pluralsight;

public class Asset {
    //attributes________________________
    private String description;
    private String dateAquired;
    private double originalCost;

    //Constructor_______________________
    public Asset(String description, String dateAcquired, double originalCost) {
        this.description = description;
        this.dateAquired = dateAcquired;
        this.originalCost = originalCost;
    }

    //Getters___________________________

    public String getDescription() {
        return description;
    }

    public String getDateAcquired() {
        return dateAquired;
    }

    public double getOriginalCost() {
        return originalCost;
    }

    //Setters___________________________

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDateAcquired(String dateAcquired) {
        this.dateAquired = dateAcquired;
    }

    public void setOriginalCost(double originalCost) {
        this.originalCost = originalCost;
    }

    //to be overridden---===============@@@
    public double getValue(){
        return originalCost;
    }

    public void setValue(){
        this.originalCost = originalCost;
    }
}
