import java.util.Random;

public class HighLow {

    public static void main(String[] args) {

        Random random = new Random();

        int result = random.nextInt(101);  //generate a number from 0 to 100
        result = result + 1;

//        System.out.println("The random number is: " + result);

        int userGuess = MethodsExercises.getInteger(0,100);  //this pulls my method from another file and asks the user to enter a number from 1-100

        if(userGuess == result){
            System.out.println("CONGRATS!!! that's correct");
        } else if(userGuess > result){
            System.out.println("LOWER!");
        } else if (userGuess < result){
            System.out.println("HIGHER!");
        }
    }
}
