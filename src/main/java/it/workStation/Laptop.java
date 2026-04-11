//package it.workStation;

public class Laptop {
    String model;
    int price;
    String serialNumber;

//    public String toString() {
//        return "Laptop: " + model + " Price: " + price;
//    }


    public String toString() {
        return "Laptop{" +
                "model='" + model + '\'' +
                ", price=" + price +
                ", serialNumber='" + serialNumber + '\'' +
                '}';
    }


    public boolean equals(Laptop that){
        return this.model.equals(that.model) && this.price == that.price;
    }
}