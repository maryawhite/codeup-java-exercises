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

//        System.out.print("Enter Something: ");
//
//        String userInput = scanner.nextLine();
//
//        System.out.println("You entered: --> \"" + userInput + "\" <--");
//
//        System.out.printf("2 out of 10 is %d%%", 20);  //what is percent d?
//
//        System.out.println();

        System.out.print("Hello ");  //print prints everything on one line--the cursor remains at the end of the text at the console
        System.out.print("World ");
        System.out.println("Goodbye");  //println prints the next word on a new line--the cursor goes to the next line
        System.out.println();           //println will work with or without a parameter
        System.out.println("World");

        boolean isSunny = false;
        boolean hasUmbrella = true;

        if(isSunny){
            System.out.println("Enjoy the sunshine - don't forget to wear sunscreen");
        } else if (!isSunny && hasUmbrella){
            System.out.println("good job remembering your umbrella");
        } else {
            System.out.println("Go check the weather");
        }

        int caseSwitch = 1;

        switch (caseSwitch) {
            case 1:
                System.out.println("Case 1");
                break;
            case 2:
                System.out.println("Case 2");
                break;
            default:
                System.out.println("Default case");
                break;
        }



    }
}
