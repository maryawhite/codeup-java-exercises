public class Assessment {

    public static double half(double number){
        return number * .5;
    }

    public static String shout(String myString){
        return myString.toUpperCase() + "!!!";
    }

    public static void main(String[] args) {
        System.out.println(half(24));
        System.out.println(shout("hello there"));

    }

}




//Create an `Assessment` class with a public static method named `half`.
// It should accept a number and return the number divided by two.
//1. Within your `Assessment` class create a public static method named `shout`.
// It should accept a string and return the same string in all upper case with 3 exclamation marks added to the end of it.
