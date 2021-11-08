package util;

import java.util.Scanner;

public class Input {

    private Scanner scanner;

    //constructor
    //we don't have to use this in this case because there's no parameter but you can use this
    public Input(){
        this.scanner = new Scanner(System.in);
    }

    public String getString(){
        return this.scanner.nextLine();
    }

//    public boolean yesNo(){
//        String userInput = this.scanner.nextLine();
//        if(userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes")){
//            return true;
//        }
//        return false;
//    }
public boolean yesNo(){
    String userInput = this.scanner.nextLine();
    return userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes");
}

//    public int getInt(){
//        return this.scanner.nextInt();
//    }
//    //modify getInt to use Integer.valueOf(getString()) and try and catch
    public int getInt(){
        try{
            return Integer.valueOf(getString());
        } catch (Exception e){
            System.out.println("Please enter an integer.");
            return getInt();
        }
    }

    public int getInt(int min, int max){
        int userNumber;
        userNumber = this.scanner.nextInt();
        if(userNumber <= max && userNumber >= min){
            return userNumber;
        } else {
            System.out.println("That is not in the range. Enter a new number between" + min + " and " + max);
            return getInt(min, max);
        }
    }

//    public double getDouble(){
//        return this.scanner.nextDouble();
//    }
    //modify getDouble to use Double.valueOf(getString()) and try and catch
    public double getDouble(){
        try{
            scanner.nextLine(); //clear out the scanner from last time it used nextInt?
            return Double.valueOf(getString());
        } catch(Exception e){
            System.out.println("Please enter a decimal(double) number.");
            return getDouble();
        }
    }

    public double getDouble(double min, double max){
        double userNumber;
        userNumber = this.scanner.nextDouble();
        if(userNumber <= max && userNumber >= min){
            return userNumber;
        } else {
            System.out.println("That is not in the range. Enter a new number between" + min + " and " + max);
            return getDouble(min, max);
        }
    }

    //getBinary
    public int getBinary(){
        try{
            scanner.nextLine(); //clear out the scanner from last time it used nextInt?
            return Integer.valueOf(getString(), 2);
        } catch(Exception e){
            System.out.println("Please enter a valid number");
        }
        return getBinary();
    }

    //getHexidecimal
    public int getHexadecimal(){
        try{
            return Integer.valueOf(getString(), 16);
        } catch(Exception e){
            System.out.println("Please enter a valid entry.");
        }
        return getHexadecimal();
    }


}
