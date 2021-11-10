package bookstore;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Product {
    //Create a Product class w/ title and price and constructor that sets those properties
    private String title;
    private BigDecimal price;

    //default constructor
    public Product(){}

    public Product(String title) {
        this.title = title;
    }

    public Product(String title, double price){  //parameter can be double...
        this.title = title;
        this.price = new BigDecimal(price).setScale(2, RoundingMode.HALF_UP);
    }

//    public double getPrice() {
//        return this.price;
//    }

    public BigDecimal getPrice() {
        return price;
    }

    public String getTitle() {
        return title;
    }

    public static void main(String[] args) {
        Product product = new Product("a Book", 19.99);
        System.out.println(product.getPrice().setScale(2, RoundingMode.HALF_UP));

    }
}
