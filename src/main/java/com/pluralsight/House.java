package com.pluralsight;

public class House extends Asset{
    //unique Attributes_______________________
    private String address;
    private int condition;
    private int squareFoot;
    private int lotSize;

    //Constructor_____________________________

    public House(String description, String dateAquired, double originalCost, String address, int condition, int squareFoot, int lotSize) {
        super(description, dateAquired, originalCost);
        this.address = address;
        this.condition = condition;
        this.squareFoot = squareFoot;
        this.lotSize = lotSize;
    }

    //Getter__________________________________

    public String getAddress() {
        return address;
    }

    public int getCondition() {
        return condition;
    }

    public int getSquareFoot() {
        return squareFoot;
    }

    public int getLotSize() {
        return lotSize;
    }


    //Setter__________________________________

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public void setSquareFoot(int squareFoot) {
        this.squareFoot = squareFoot;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }

    //overriding parent's getter-------------
    @Override
    public double getValue(){
        return
        switch(condition){
            case 1 ->   ((180 * squareFoot) + (0.25 * lotSize));
            case 2 ->   ((130 * squareFoot) + (0.25 * lotSize));
            case 3 ->   ((90 * squareFoot) + (0.25 * lotSize));
            case 4 ->   ((80 * squareFoot) + (0.25 * lotSize));
            default ->  0;
        };

    }

}
