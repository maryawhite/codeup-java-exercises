import java.util.Scanner;

public class lectureConsoleIO {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

//        String name = "Shanshan";
//        System.out.printf("Hello there, %s. Nice to see you. \n", name);
//
//        String greeting = "Howdy";
//        String cohortName = "Quasar";
//
//        System.out.printf("%s, %s", greeting, cohortName);

        System.out.print("Enter Something: ");

        String userInput = scanner.nextLine();

        System.out.println("You entered: --> \"" + userInput + "\" <--");

        System.out.printf("2 out of 10 is %d%%", 20);  //what is percent d?

    }
}
