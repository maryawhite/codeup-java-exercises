import java.util.Scanner;

public class ConsoleExercises {

    public static void main(String[] args) {

//        double pi = 3.14159;
//        //write some code so that pi comes out as 3.14
//        System.out.format("The value of pi is approximately %.2f%n", pi);

        Scanner myScanner = new Scanner(System.in);  //this is how we're saving the users input?

        myScanner.useDelimiter(",");  //the only difference I see here, is it makes me enter my 3 words on separate lines
        //the Delimiter by default is white space, so next looks for white space by default.

//        System.out.print("Please enter an integer: ");
//
////        String userInput = myScanner.next();
//        int userInput = myScanner.nextInt();
//
////        System.out.println("You entered: --> \"" + userInput + "\" <--");
//        System.out.printf("You entered: --> %d%n <--", userInput);

        //Prompt a user to enter 3 words, and store each of them in a separate variable. Then, display them back in the console, each on a newline.
//        System.out.println("Enter 3 words");
//
//        String word1 = myScanner.next();
//        String word2 = myScanner.next();
//        String word3 = myScanner.next();
//
//        System.out.println("Here is what you entered: ");
//        System.out.println(word1 + "\n" + word2 + "\n" + word3 + "\n");
        //if the user enters more than 3 words it still only prints 3, if you enter less than 3 words it waits for you to enter another one

        //Prompt a user to enter a sentence, then store that sentence in a String variable using the next method. Then, display that sentence back to the user.
        //then rewrite the code using nextLine().
//        myScanner.nextLine();
//
//        System.out.println("Enter a sentence:");
//
//        String sentence1 = myScanner.nextLine();
//
//        System.out.println(sentence1);

        //Prompt the user to enter values of length and width of a classroom.
        //Use the nextLine method to get user input and parse the resulting string to a numeric type.

//        System.out.println("Enter the length of the room:");
//        System.out.println("Enter the width of the room:");
//        System.out.println("Enter the height of the room");
//
//        String width = myScanner.nextLine();
//        String length = myScanner.nextLine();
//        String height = myScanner.nextLine();
//
//        double width1 = Double.parseDouble(width);
//
//        double length1 = Double.parseDouble(length);
//
//        double height1 = Double.parseDouble(height);
//
//        double area = length1 * width1;
//
//        double volume = area * height1;
//
//        System.out.println("The area is " + area);
//        System.out.println("The perimeter is " + 2 * (width1 + length1));
//        System.out.printf("The volume is %f", volume);
        //volume is (l x w) x h  or area x h
//
        System.out.println("What is your favorite quote?");

        String userQuote = myScanner.nextLine();
        System.out.printf("You entered: %s%n", userQuote);

        String userQuoteArray[] = userQuote.split(" ");

        System.out.println("How many words are in the quote?");

        int youSaid = myScanner.nextInt();
        System.out.printf("You said: %s. ", youSaid);
        if(youSaid == userQuoteArray.length){
            System.out.print("Indeed, there are " + userQuoteArray.length + " words.");
        } else {
            System.out.print("No, I don't think that's right.");
        }

//        System.out.print("Enter your three favorite foods separated by only spaces. ");
//        String faveFoods1 = myScanner.next();
//        String faveFoods2 = myScanner.next();
//        String faveFoods3 = myScanner.next();
//        System.out.printf("1. %s%n2. %s%n3. %s%n", faveFoods1, faveFoods2, faveFoods3);
////        System.out.printf("1. %s%n", faveFoods1);
////        System.out.printf("2. %s%n", faveFoods2);
////        System.out.printf("3. %s%n", faveFoods3);

        System.out.print("Enter a grocery list of 3 items separated by a comma with no spaces. ");
        String groceryList = myScanner.nextLine();
        System.out.printf("%s", groceryList);

        //bonuses
        //a. In your perimeter/area calculator: - Accept decimal entries. - Calculate the volume of the rooms in
        //   addition to the area and perimeter

        //b. The Scanner class can be told specifically what characters or pattern separates tokens in a piece
        //   of input with the useDelimiter method. Add the following line of code to your application after you have created a scanner, scanner.useDelimiter("\n");
        //# Console IO Exercises

        //1. Prompt the user to enter a favorite quote
        //    - output the quote
        //    - ask them to enter how many words are in the quote
        //    - output the number they entered
        //    - output if the number they entered indeed matched the number of words
        //2. Prompt the user to enter a list of top three favorite foods separated by only spaces
        //    - Use the printf() to output the three top foods with the format:
        //        1. FirstFood
        //        2. SecondFood
        //        3. ThirdFood
        //3. Prompt the user to enter a grocery list of three items
        //    - each item should only be separated by a comma (no spaces)
        //    - you will need to use the .useDelimiter() method on your scanner object
        //    - output the result as a comma-separated list using printf()
        myScanner.close();

    }
}
