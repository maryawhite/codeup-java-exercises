import java.util.Random;
import java.util.Scanner;

public class MethodsExercises {

    public static int add(int num1, int num2){
        return num1 + num2;
    }

    public static int subtract(int num1, int num2){
        return num1 - num2;
    }

    public static int multiply(int num1, int num2){
        return num1 * num2;
    }

    public static int multiplyLoop(int num1, int num2){
        int result = 0;
        for(int i = 0; i < num1; i++){
            result += num2;     //this works bc multiplication is the same as adding the first number over and over the number of the 2nd number
        }
        return result;
    }

    public static int divide(int num1, int num2){
        return num1 / num2;
    }

    public static int remainder(int num1, int num2){
        return num1 % num2;
    }

    public static int getInteger(int min, int max){
        int userNumber;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number between " + min + " and " + max);
        userNumber = scanner.nextInt();
        if(userNumber <= max && userNumber >= min){
            System.out.println("thanks");
            return userNumber;
        } else {
            return getInteger(min, max);
        }
    }

    public static long factorial(){
        Scanner scanner = new Scanner(System.in);
        String reply;
        long fact;
        String middle = "1";
        do {
            fact = 1;
            int userNumberF = getInteger(1, 10);
            for (int i = 1; i <= userNumberF; i++) {
                if(i > 1){
                middle += " x " + i;
                }
                fact = fact * i;
                System.out.printf("%2d! = %-40s = %d%n", i, middle, fact);
            }
            System.out.println("The Factorial of your number is: " + fact);
            System.out.println("Would you like to enter another number to factorial? Y/N");
            reply = scanner.nextLine();
        }while(reply.equalsIgnoreCase("y"));
            return fact;
    }

    public static int generateRandomNum(int max, int min){   //from min to max
        return ((int) (Math.random()*(max - min))) + min;
    }

    public static int diceRoll(){
        int response;
        String r;
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many sides does your dice have? ");
        response = scanner.nextInt();
        System.out.println("you said " + response);
        System.out.println("Do you want to roll the dice. Press r to roll the dice");
        r = scanner.nextLine();
        int randomNum;
        while(r.equalsIgnoreCase("r")) {
            randomNum = generateRandomNum(response,1);
            System.out.println("your random number is " + randomNum);
            return randomNum;
        }
//        } else {
//            return diceRoll();
//        }
        return response;
    }


    public static void main(String[] args) {
        System.out.println("add: " + add(15, 3));
        System.out.println("subtract: " + subtract(15, 3));
        System.out.println("divide: " + divide(15, 3));
        System.out.println("multiply: " + multiply(15, 3));
        System.out.println("multiplyLoop: " + multiplyLoop(15, 3));
        System.out.println("remainder: " + remainder(15, 3));
        int aNumber = getInteger(1, 10);
        System.out.println("you entered: " + aNumber);
        factorial();
        diceRoll();

    }

    }
