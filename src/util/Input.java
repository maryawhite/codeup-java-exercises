package util;

import java.util.Scanner;

public class Input {

    private Scanner scanner;

    public Input(){
        this.scanner = new Scanner(System.in);
    }

    public String getString(){
        return this.scanner.nextLine();
    }

    public boolean yesNo(){
        String userInput = this.scanner.nextLine();
        if(userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes")){
            return true;
        }
//        else if(this.scanner.nextLine().equalsIgnoreCase("n") || this.scanner.nextLine().equalsIgnoreCase("no")){
//            return false;
//        } else {
//            return false;
//        }
        return false;
    }

    public int getInt(int min, int max){
        int userNumber;
        userNumber = this.scanner.nextInt();
        if(userNumber <= max && userNumber >= min){
            return userNumber;
        } else {
            return getInt(min, max);
        }
    }

    public int getInt(){
        return this.scanner.nextInt();
    }

    public double getDouble(double min, double max){
        double userNumber;
        userNumber = this.scanner.nextDouble();
        if(userNumber <= max && userNumber >= min){
            return userNumber;
        } else {
            return getDouble(min, max);
        }
    }

    public double getDouble(){
        return this.scanner.nextDouble();
    }

}