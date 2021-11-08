package bookstore;

import java.math.BigDecimal;

public class Product {
    //Create a Product class w/ title and price and constructor that sets those properties
    private String title;
    double price;

    //default constructor
    public Product(){}

    public Product(String title) {
        this.title = title;
    }

    public Product(String title, double price){
        this.title = title;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getTitle() {
        return title;
    }
}
