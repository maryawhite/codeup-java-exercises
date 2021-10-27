import java.util.Random;
import java.util.Scanner;

public class HighLow {

    public static void main(String[] args) {

        Random random = new Random();

        boolean confirm;
        Scanner scanner = new Scanner(System.in);

        do {
            int result = random.nextInt(99);  //generate a number from 0 to 99
            result += 1;                            //trying to get it to be 1-100, not 0-99.

//        System.out.println("The random number is: " + result);

            while (true) {
                int userGuess = MethodsExercises.getInteger(0, 100);  //this pulls my method from another file and asks the user to enter a number from 1-100

                if (userGuess < result) {
                    System.out.println("guess HIGHER!");
                } else if (userGuess > result) {
                    System.out.println("guess LOWER!");
                } else if (userGuess == result) {
                    System.out.println("CONGRATS!!! Good Guess, that's correct");
                    break; //stop the loop
                } else {
                    System.out.println("not valid");
                }
            }
            System.out.print("Would you like to play again? Y/N");
            confirm = scanner.next().equalsIgnoreCase("y");
        }while(confirm);
    }
}

//while(true) would run forever, the break statement inside the else if stops it when they guess correctly
