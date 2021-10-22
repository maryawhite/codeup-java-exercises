import java.util.Scanner;

public class ConsoleExercises {

    public static void main(String[] args) {

        double pi = 3.14159;
        //write some code so that pi comes out as 3.14
        System.out.format("The value of pi is approximately %.2f%n", pi);

        Scanner myScanner = new Scanner(System.in);  //this is how we're saving the users input?

        System.out.print("Please enter an integer: ");

        String userInput = myScanner.next();

        System.out.println("You entered: --> \"" + userInput + "\" <--");

        //Prompt a user to enter 3 words, and store each of them in a separate variable. Then, display them back in the console, each on a newline.
        System.out.println("Enter 3 words");

        String word1 = myScanner.next();
        String word2 = myScanner.next();
        String word3 = myScanner.next();

        System.out.println("Here is what you entered: ");
        System.out.println(word1 + "\n" + word2 + "\n" + word3 + "\n");
        //if the user enters more than 3 words it still only prints 3, if you enter less than 3 words it waits for you to enter another one

        //Prompt a user to enter a sentence, then store that sentence in a String variable using the next method. Then, display that sentence back to the user.
        //then rewrite the code using nextLine().
        myScanner.nextLine();

        System.out.println("Enter a sentence:");

        String sentence1 = myScanner.nextLine();

        System.out.println(sentence1);

        //Prompt the user to enter values of length and width of a classroom.
        //Use the nextLine method to get user input and parse the resulting string to a numeric type.

        System.out.println("Enter the length of the room:");
        System.out.println("Enter the width of the room:");

        String width = myScanner.nextLine();

        int width1 = Integer.parseInt(width);

        String length = myScanner.nextLine();

        int length1 = Integer.parseInt(length);

        System.out.println("The area is " + width1 * length1);
        System.out.println("The perimeter is " + 2 * width1 + 2 * length1);

    }
}
