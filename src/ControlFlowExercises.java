import java.util.Scanner;

public class ControlFlowExercises {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

//        int i = 5;
//
//        while (i <= 15){
//            System.out.print(i + " ");
//            i++;
//        }

//        int i = 0;
//        do {
//            i += 2;
//            System.out.println(i);
//        } while (i < 100);

//        int m = 100;
//        do{
//            System.out.println(m);
//            m -= 5;
//        } while (m >= -10);

//        long i = 2;   //this needs to be long, not int
//        do{
//            System.out.println(i);
//            i *= i;
//        } while (i < 1000000);

//        for(int i = 100; i >= -10; i -= 5){
//            System.out.print(i + " ");
//        }
//
//        for(long n = 2; n < 1000000; n *= n){
//            System.out.println(n);
//        }

//        for(int i = 0; i <= 100; i += 2){
//            System.out.print(i + " ");
//        }
//        for(int i = 1; i <=100; i++){
//            if(i % 3 == 0 && i % 5 == 0){
//                System.out.println("FizzBuzz");
//            } else if(i % 3 == 0){
//                System.out.println("Fizz");
//            } else if (i % 5 == 0){
//                System.out.println("Buzz");
//            } else {
//                System.out.println(i + " ");
//            }
//        }

        //consider using a variable like boolean divBy3 = (i % 3) == 0;

        boolean confirm1;
        do {
        System.out.print("What number would you like to go up to? ");

        int output = scanner.nextInt();

        System.out.println("Here is your table!");
        System.out.println("number | squared | cubed");
        System.out.println("------ | ------- | -----");

            for (int i = 1; i <= output; i++) {
                System.out.printf("%-7d| %-9d| %-6d\n", i, i * i, i * i * i);
//            System.out.printf("%-7d", i*i);
//            System.out.printf("%-7d%n", i*i*i);
            }
            System.out.println("Continue? [Y/N] ");
            confirm1 = scanner.next().equalsIgnoreCase("y");
        } while(confirm1);

//        String userInput ="";
//        do {
//            System.out.print("Enter a numerical grade from 0-100. ");
//
//            int grade = scanner.nextInt();
//
//            if (grade <= 100 && grade >= 88) {
//                System.out.println("Your grade is an A");
//            } else if (grade <= 87 && grade >= 80) {
//                System.out.println("Your grade is a B");
//            } else if (grade <= 79 && grade >= 67) {
//                System.out.println("Your grade is a C");
//            } else if (grade <= 66 && grade >= 60) {
//                System.out.println("Your grade is a D");
//            } else if (grade <= 59 && grade >= 0) {
//                System.out.println("Your grade is a F");
//            } else {
//                System.out.println("Sorry, invalid input");
//            }
//
//            System.out.println("Continue? [Y/N] ");
//            userInput = scanner.next();
//        } while(userInput.equals("Y") || userInput.equals("y"));

        scanner.close();

    }
}
