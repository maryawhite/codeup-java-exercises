package bookstore;

public class Person {
    //make a Person superclass w/ name property, set name w/ constructor
    private String name;

    //default constructor
    public Person(){
    }

    //constructor
    public Person(String name) {
        this.name = name;
    }

    //getter
    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }
}
