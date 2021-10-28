public class LecturePerson {

    public String firstName;
    public String lastName;
    public int age;

    //instance method
    public String joinChat(){
        return firstName + " has joined the chat!";
    }

    //make a static property, you can use underscores in place of commas for big numbers
    public static long worldPop = 7_9_000_000L;

    public static void main(String[] args) {
        LecturePerson mary = new LecturePerson();
        mary.firstName = "Mary";
        mary.lastName = "White";

        System.out.println("mary = " + mary);
        System.out.println(mary.firstName + " " + mary.lastName + " is my name!");
        System.out.printf("%s %s is my name!%n", mary.firstName, mary.lastName);

        System.out.println(mary.joinChat());

        System.out.println("worldPop " + worldPop);

        LecturePerson douglas = new LecturePerson();
        douglas.firstName = "Douglas";
        douglas.lastName = "Hirsh";

        //how to add douglas into our count of worldPop?
        LecturePerson.worldPop += 1;

        System.out.println("worldPop with douglas = " + worldPop);
        System.out.println("LecturePerson.worldPop = " + LecturePerson.worldPop);

        //can we talk to person.firstName? No, non-static variable cannot be access from a static context

    }

}
