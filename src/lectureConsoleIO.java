import java.util.Scanner;

public class lectureConsoleIO {

    public static void main(String[] args) {

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
//
//        System.out.print("Hello ");  //print prints everything on one line--the cursor remains at the end of the text at the console
//        System.out.print("World ");
//        System.out.println("Goodbye");  //println prints the next word on a new line--the cursor goes to the next line
//        System.out.println();           //println will work with or without a parameter
//        System.out.println("World");
//
//        boolean isSunny = false;
//        boolean hasUmbrella = true;
//
//        if(isSunny){
//            System.out.println("Enjoy the sunshine - don't forget to wear sunscreen");
//        } else if (!isSunny && hasUmbrella){
//            System.out.println("good job remembering your umbrella");
//        } else {
//            System.out.println("Go check the weather");
//        }
//
//        int caseSwitch = 1;
//
//        switch (caseSwitch) {
//            case 1:
//                System.out.println("Case 1");
//                break;
//            case 2:
//                System.out.println("Case 2");
//                break;
//            default:
//                System.out.println("Default case");
//                break;
//        }

//        int i = 0;
//        while (i < 10) {
//            System.out.println("i is " + i);
//            i++;
//        }

//        do {
//            System.out.println("You will see this despite the condition!");
//        } while (false);

        //remember to declare the type in the for loop
//        for(int i = 0; i < 25; i++){
//            System.out.println(("i is " + i));
//            if (i == 5){
//                break;
//            }
//        }

        //the code below will print the odd numbers (bc it is skipping evens)
//        for(int i = 0; i < 25; i++){
//            if (i % 2 == 0){
//                continue;
//            }
//            System.out.println(i);
//        }
//
//    }
//    public static void promptInput(){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter 2 numbers: ");
//        int num1 = scanner.nextInt();
//        int num2 = scanner.nextInt();
//        System.out.println("Would you like to add, subtract, multiply, or divide?");
//        String input = scanner.next();
//    }
//
//    public static void calculate(int num1, int num2, String input){
//        switch (input){
//            case "add":
//                System.out.println("sum: " + (num1 + num2));
//                break;
//            case "subtract":
//                System.out.println("subtract: " + (num1 - num2));
//                break;
//            case "multiply":
//                System.out.println("multiply: " + (num1 * num2));
//                break;
//            case "divide":
//                System.out.println(("divide: " + num1 / num2));
//                break;
//            default:
//                System.out.println("idk");
//                break;
//        }
//        String reply;
//        do {
//            System.out.println("Enter any string: ");
//            String origString = scanner.nextLine();
//            String reverseString = "";              //initialize the string
//
//            char[] characters = origString.toCharArray();  //the toCharArray method takes the string and turns it into an array of chars
//
//            for (int i = characters.length - 1; i >= 0; i--) {     //this is starting at the end and decrementing
//                reverseString = reverseString + characters[i];
//            }
//
//            if (origString.equals(reverseString)) {
//                System.out.println("String is a palindrome");
//            } else {
//                System.out.println("String is not a palindrome");
//            }
//            System.out.println("Would you like to enter another work? enter y or n");
//            reply = scanner.nextLine();
//        }while(reply.equals("y"));

        //create a while loop that counts to 10
//        int counter = 0;
//        while(counter < 10){
//            counter += 1;
//            System.out.println(counter);
//        }
        whileLoop();
        doWhileLoop();
        forLoop();

    }   //end of psvm

    static void whileLoop() {
        int counter = 0;
        while (counter < 10) {
            counter += 1;
            System.out.println("whileLoop: " + counter);
        }
    }

    static void doWhileLoop() {
        int counter = 10;
        do {
            counter += 1;
            System.out.println("doWhileLoop: " + counter);

        } while (counter < 10);
    }

    static void forLoop(){    //note that void methods do not have a return statement
        for(int counter = 0; counter < 10; counter += 1){
            System.out.println("forLoop: " + counter);
        }
    }
}

