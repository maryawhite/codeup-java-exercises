package bookstore;

import java.math.BigDecimal;

public class Book extends Product{
    private Author author;

    public Book(String title) {
        super(title);
    }

    public Book(String title, BigDecimal price, Author author) {
        super(title, price);
        this.author = author;
    }

        public Book(BigDecimal price) {
        super(price);
    }

    //- Create a Book class that inherits from product and adds an author property
    //  Book class’s author property should hold an Author typed object
    public Book(Author author){
        this.author = author;
    }


}
