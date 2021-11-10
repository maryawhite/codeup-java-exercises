package javaassessmentreview;

import java.util.ArrayList;
import java.util.Arrays;

public class AssessmentReview {
//Write a public static method named cubed that accepts an integer as an argument and returns that integer to the third power.
    public static int cubed(int aNumber){
        return aNumber * aNumber * aNumber;
    }

//Write a public static method named difference that accepts two arguments and that works with both integers and doubles (use method overloading). Both variations of the method should return the result of subtracting the second argument from the first argument.
    public static int difference(int num1, int num2){
        return num1 - num2;
    }

    public static double difference(double num1, double num2){
        return num1 - num2;
    }

    //Write a public static method named median that receives an array of ints (please use an array, not a Collection) and returns the median as a double.
    public static double median(int[] arr){
        Arrays.sort(arr);
        double median;
        if(arr.length % 2 == 0){
            median = ((double)arr[arr.length/2] + (double)arr[arr.length/2 - 1])/2;
        } else {
            median = (double) arr[arr.length/2];
        }
        return median;
    }

    public static boolean isUpperCase(String s){
        for (int i = 0; i < s.length(); i++) {
            if(!Character.isUpperCase(s.charAt(i))){
                return false;
            }
        }
        return true;
    }

    //create a static method named uppercaseCatColor
    public static ArrayList<Cat> uppercaseCatColor(ArrayList<Cat> cats){
        for(Cat cat : cats){
            if(isUpperCase(cat.getColor())){
                continue;
            } else {
                String newColor = cat.getColor().toUpperCase();
                cat.setColor(newColor);
            }
        }
        return cats;
    }


    public static void main(String[] args) {
//        System.out.println(cubed(3));
//
//        System.out.println(difference(10, 5));
//        System.out.println(difference(10.5, 5.7));
        int[] myArray = {1, 3, 4, 2, 6, 5, 8, 7};
        int[] anArr = {5, 6, 7, 8, 9};
        System.out.println(median(myArray));
        System.out.println(median(anArr));

        Cat acat = new Cat(3,true,"harry", "brown");
        Cat acat2 = new Cat(4,true,"silky", "black");
        Cat acat3 = new Cat(5,true,"furry", "ORANGE");

        ArrayList<Cat> myCats = new ArrayList<>();
        myCats.add(acat);
        myCats.add(acat2);
        myCats.add(acat3);
        System.out.println(acat.getColor());
        System.out.println(acat2.getColor());
        System.out.println(acat3.getColor());
        uppercaseCatColor(myCats);
        System.out.println("-----------------");
        System.out.println(acat.getColor());
        System.out.println(acat2.getColor());
        System.out.println(acat3.getColor());

        //        ArrayList<Integer> myFavoriteNums = new ArrayList<>();
    }
}
