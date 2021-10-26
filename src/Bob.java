import java.util.Locale;
import java.util.Scanner;

public class Bob {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String sure = "Sure?";   //if you ask him a question
        String whoa = "Whoa, chill out!";  //if you yell
        String beThatWay = "Fine. Be that Way!";  //if you use an empty input
        String whatever = "Whatever.";     //anything else

        boolean askAgain;

        do {

        System.out.println("Ask Bob a question...");

        String question = scanner.nextLine();

            if (question.endsWith("?")) {
                System.out.println(sure);
            } else if (question.equals(question.toUpperCase()) && question.length() > 0 || question.endsWith("!")) {
                System.out.println(whoa);
            } else if (question.trim().isEmpty()) {
                System.out.println(beThatWay);
            } else {
                System.out.println(whatever);
            }
            System.out.println("Would you like to ask Bob another question? [Y/N] ");
            askAgain = scanner.nextLine().equalsIgnoreCase("y");
        } while(askAgain);

    }
}
