package bookstore;

public class Author extends Person {
    //- Make an Author subclass that inherits from person,
    // add a counter for the number of books written
    private int counter;

    public Author(String name){
        super(name);
    }

    //getter for counter
    public int getCounter() {
        return counter;
    }

    //constructor for the counter
    public Author(int counter) {
        this.counter = counter;
    }
}
