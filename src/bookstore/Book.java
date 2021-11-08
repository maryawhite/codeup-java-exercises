package bookstore;

import java.math.BigDecimal;

public class Book extends Product{
    //- Create a Book class that inherits from product and adds an author property
    //  Book class’s author property should hold an Author typed object
    private Author author;

    public Book(String title, BigDecimal price, Author author) {
        super(title, price);
        this.author = author;
    }

    public Book(String title) {
        super(title);
    }
    public Book(BigDecimal price) {
        super(price);
    }

    public Book(Author author){
        this.author = author;
    }

    public Book(String title, String price, Author author) {
    }

    //getter
    public Author getAuthor() {
        return author;
    }

    //setter
    public void setAuthor(Author author) {
        this.author = author;
    }
}
