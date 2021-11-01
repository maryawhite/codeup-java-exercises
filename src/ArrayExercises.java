import java.util.Arrays;

public class ArrayExercises {

    public static void main(String[] args) {
        //what happens when you do this? it prints a reference to the memory, it doesn't print the array
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(numbers);
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));  //you have to import java.util.Arrays and then use toString() method

        //create an array that holds 3 person objects.
        //Assign a new instance of the Person class to each element.
        // Iterate through the array and print out the name of each person in the array.
        Person[] persons = new Person[3];
//        Person number1 = new Person("mary");
//        Person number2 = new Person("Sarah");
//        Person number3 = new Person("Daniel");
        persons[0] = new Person("Mary");
        persons[1] = new Person("Sarah");
        persons[2] = new Person("Daniel");
        System.out.println(Arrays.toString(persons));
        for(int i = 0; i < persons.length; i++){
            System.out.println(persons[i].getName());
        }

    }

}
