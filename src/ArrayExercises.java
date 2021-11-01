import java.util.Arrays;

public class ArrayExercises {

//    personPlusOne[personPlusOne.length - 1] = "persons.getName();"
//            System.out.println(Arrays.toString(personPlusOne));
    //Create a static method named addPerson. It should accept an array of Person objects, as well as a
    // single person object to add to the passed array.
    // It should return an array whose length is 1 greater than the passed array,
    // with the passed person object at the end of the array.

    public static Person[] addPerson(Person[] array, Person individual){
        Person[] personPlusOne = Arrays.copyOf(array, array.length + 1);
        personPlusOne[personPlusOne.length -1] = individual;
        return personPlusOne;
    }

    public static void main(String[] args) {
        //what happens when you do this? it prints a reference to the memory, it doesn't print the array
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(numbers);
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));  //you have to import java.util.Arrays and then use toString() method

        //create an array that holds 3 person objects.
        //Assign a new instance of the Person class to each element.
        // Iterate through the array and print out the name of each person in the array.
        Person[] community = new Person[3];

        community[0] = new Person("Mary");
        community[1] = new Person("Sarah");
        community[2] = new Person("Daniel");

        System.out.println(Arrays.toString(community));

        for(int i = 0; i < community.length; i++){
            System.out.println("for loop " + community[i].getName());
        }

       Person number4 = new Person("Charlie");

       Person[] anotherArray = ArrayExercises.addPerson(community,number4);
       for(Person person : anotherArray){
           System.out.println(person.getName());
       }


        //String[] mybagplusone = Arrays.copyOf(mybag, mybag.length + 1);
        //        System.out.println("mybag.length = " + mybag.length);
        //        System.out.println("mybagplusone.length = " + mybagplusone.length);
        //
        //        mybagplusone[mybagplusone.length-1] = "skittles";
        //        for (String candy : mybagplusone){
        //            System.out.println(candy);
        //        }
        //        System.out.println();
        //
        //        //Stringify array
        //        System.out.println(Arrays.toString(mybagplusone));

    }

}
