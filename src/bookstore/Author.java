package bookstore;

public class Author extends Person {
    //- Make an Author subclass that inherits from person,
    // add a counter for the number of books written
    private String name;
    private int counter;

    public Author(String name){
        super(name);
    }

    public String getAuthorName(String name){
        return this.name;
    }



}
