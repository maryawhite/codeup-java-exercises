import java.util.Scanner;

public class ConsoleExercises {

    public static void main(String[] args) {

        double pi = 3.14159;
        //write some code so that pi comes out as 3.14
        System.out.format("The value of pi is approximately %.2f%n", pi);

        Scanner nameHerescanner = new Scanner(System.in);  //this is how we're saving the users input?

//        System.out.print("Please enter an integer: ");
//
//        String userInput = nameHerescanner.next();
//
//        System.out.println("You entered: --> \"" + userInput + "\" <--");

        //Prompt a user to enter 3 words, and store each of them in a separate variable. Then, display them back in the console, each on a newline.
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word");
        System.out.println("Enter a second word");
        System.out.println("Enter a third word");

        String word1 = input.next();
        String word2 = input.next();
        String word3 = input.next();

        System.out.println("Here is what you entered: ");
        System.out.println(word1 + "\n" + word2 + "\n" + word3 + "\n");
        //if the user enters more than 3 words it still only prints 3, if you enter less than 3 words it waits for you to enter another one

        //Prompt a user to enter a sentence, then store that sentence in a String variable using the next method. Then, display that sentence back to the user.
        //then rewrite the code using nextLine().
        Scanner userSentence = new Scanner(System.in);

        System.out.println("Enter a sentence:");

        String sentence1 = userSentence.nextLine();

        System.out.println(sentence1);
    }
}
