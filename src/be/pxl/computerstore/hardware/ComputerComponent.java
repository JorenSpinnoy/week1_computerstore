package be.pxl.computerstore.hardware;

import java.util.Random;

public abstract class ComputerComponent {
    private String vendor;
    private String name;
    private double price;
    private String articleNumber;
    Random randomNumber = new Random();
    private static int counter = 0;


    public ComputerComponent(String vendor, String name, double price) {
        this.vendor = vendor;
        this.name = name;
        this.price = price;
        GenerateArticleNumber();
    }

    public String toString(){
        return name + " (" + articleNumber + ")";
    }

    public String getFullDescription(){
        return "ArticleNumber = " + getArticleNumber() + "\n"
                + "Vendor = " + getVendor() + "\n"
                + "Name = " + getName() + "\n"
                + "Price = " + getPrice() + "\n";
    }

    private String GenerateArticleNumber(){
        String vendorPart = vendor.toUpperCase();
        String uniqueNumberPart = Integer.toString(counter);
        counter++;

        while (vendorPart.length() < 3){
            vendorPart += "X";
        }

        while (uniqueNumberPart.length() < 5){
            uniqueNumberPart = 0 + uniqueNumberPart;
        }

        return vendorPart + "-" + uniqueNumberPart;
    }

    public String getVendor() {
        return vendor;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getArticleNumber() {
        return articleNumber;
    }
}
