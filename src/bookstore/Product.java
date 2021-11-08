package bookstore;

import java.math.BigDecimal;

public class Product {
    private String title;
//    private float price;       //should use BigDecimal for currency....
    BigDecimal price;

    //default constructor
    public Product(){}

    public Product(String title) {
        this.title = title;
    }

    public Product(BigDecimal price) {
        this.price = price;
    }


}
