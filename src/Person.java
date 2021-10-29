public class Person {

    private String name;

    //this is the constructor
    public Person(String entername){
        this.name = entername;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String fname){
        //change the name property to the passed value. use this
        this.name = fname;
    }

    public void sayHello(){
        //print a message to the console using the person's name
        System.out.println("Hello " + name + " !");
    }

    public static void main(String[] args) {

        //Create a `main` method on the class that creates a new `Person` object and
        //tests the above methods.
        Person mary = new Person("Mary W.");

        System.out.println("Return the person's name");
        System.out.println(mary.getName());


        mary.sayHello();
        mary.setName("Maria");    //set name doesn't print to console
        System.out.println("I am changing my first name: " + mary.getName());

        //for each block of code below, think about what the code will output then uncomment it to see if you're right
//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());

    }

}
