public class Person {

    private String name;

    public String getName(){
        return name;
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

        Person mary = new Person();
        mary.name = "Mary W.";

        System.out.println("Return the person's name");
        System.out.println(mary.getName());


        mary.sayHello();
        mary.setName("Maria");    //set name doesn't print to console
        System.out.println("I am changing my first name: " + mary.getName());

    }

}
