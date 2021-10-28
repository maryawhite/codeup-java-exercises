public class LecturePerson {

    public String firstName;
    public String lastName;
    public int age;

    public String joinChat(){
        return firstName + " has joined the chat!";
    }

    public static void main(String[] args) {
        LecturePerson mary = new LecturePerson();
        mary.firstName = "Mary";
        mary.lastName = "White";

        System.out.println("mary = " + mary);
        System.out.println(mary.firstName + " " + mary.lastName + " is my name!");
        System.out.printf("%s %s is my name!%n", mary.firstName, mary.lastName);

        System.out.println(mary.joinChat());

    }

}
