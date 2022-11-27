package bookstore;

public class Book extends Product{
    private Author author;

    public Book(String title, double price, Author author) {
        super(title, price);
        this.author = author;
    }

    @Override
    public String toString() {
        return "Title: " + getTitle() + " " + "Price: " + getPrice() + " " + "Author: " + author.getName();
    }
}



//- Create a Book class that inherits from product and adds an author property
//  Book class’s author property should hold an Author typed object
