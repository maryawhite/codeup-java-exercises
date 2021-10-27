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
            userNumber = getInteger(min, max);
        }
        return userNumber;
    }


    public static void main(String[] args) {
        System.out.println("add: " + add(15, 3));
        System.out.println("subtract: " + subtract(15, 3));
        System.out.println("divide: " + divide(15, 3));
        System.out.println("multiply: " + multiply(15, 3));
        System.out.println("multiplyLoop: " + multiplyLoop(15, 3));
        System.out.println("remainder: " + remainder(15, 3));
        getInteger(1, 10);

        System.out.println("Enter a number between 1 and 10");
        int userNumberF;
        Scanner scanner = new Scanner(System.in);
        userNumberF = scanner.nextInt();
        if (userNumberF <= 10 && userNumberF >= 1) {
            long fact = 1;
            for (int i = 1; i <= userNumberF; i++) {
                fact = fact * i;
            }
            System.out.println("factorial of " + userNumberF + " is " + fact);
        }
    }

    }
