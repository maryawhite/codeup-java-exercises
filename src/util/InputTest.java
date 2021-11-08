package util;

import util.Input;

public class InputTest {

    public static void main(String[] args) {

        //since the methods we created are not static, we need to create a new input object here
        Input input = new Input();  //create an input object/instantiate the input class

        System.out.println("Enter any string");
        String userInput = input.getString();
        System.out.println(userInput);

        System.out.println("Would you like to continue, y for yes, n for no");
        boolean confirm = input.yesNo();
        System.out.println(confirm);

        System.out.println("Pick an integer number. ");
        int userNum = input.getInt();
        System.out.println("the number you picked is: " + userNum);
//
        System.out.println("Enter a number between 1 and 10");
        int userInt = input.getInt(1, 10);
        System.out.println(userInt);

        System.out.println("Pick a decimal number. ");
        double userDou = input.getDouble();
        System.out.println("the decimal number you picked is: " + userDou);

        System.out.println("Enter a decimal point number between 1 and 20.");
        double userDouble = input.getDouble(1,20);
        System.out.println(userDouble);
//
        System.out.println("Enter a binary number to convert from Binary to base 10: ");
        int base10 = input.getBinary();
        System.out.println("Your number in base10 is: " + base10);

        System.out.println("Enter a hexadecimal number to convert to Base10: ");
        int hextoBase10 = input.getHexadecimal();
        System.out.println("Your number in base10 is: " + hextoBase10);


    }
}
