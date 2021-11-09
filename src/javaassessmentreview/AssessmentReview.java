package javaassessmentreview;

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


    public static void main(String[] args) {
//        System.out.println(cubed(3));
//
//        System.out.println(difference(10, 5));
//        System.out.println(difference(10.5, 5.7));
        int[] myArray = {1, 3, 4, 2, 6, 5, 8, 7};
        int[] anArr = {5, 6, 7, 8, 9};
        System.out.println(median(myArray));
        System.out.println(median(anArr));
    }

}
