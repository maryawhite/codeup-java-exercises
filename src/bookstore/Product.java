package bookstore;

import java.math.BigDecimal;

public class Product {
    //Create a Product class w/ title and price and constructor that sets those properties
    private String title;
    BigDecimal price;

    //default constructor
    public Product(){}

    public Product(String title) {
        this.title = title;
    }

    public Product(String title, BigDecimal price){
        this.title = title;
        this.price = new BigDecimal("price");  //not sure how to use BigDecimal...
    }

    public Product(BigDecimal price) {
        this.price = new BigDecimal("price");
    }

    public BigDecimal getPrice() {
        return price;
    }

    public String getTitle() {
        return title;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
