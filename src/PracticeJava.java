import java.util.ArrayList;
import java.util.List;

public class PracticeJava {
//fizzbuzz in java
    public static void fizzBuzz(int x){
        for(int i = 1; i <= x; i++){
            if((i % 5 == 0) && (i % 3 == 0)){
                System.out.println("fizzbuzz");
            } else if (i % 5 == 0) {
                System.out.println("fizz");
            } else if (i % 3 == 0){
                System.out.println("buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    //function that takes in a number and multiplies that number by 10
    public static int multiple(int n){
        return n * 10;
    }

    //recursion
    //Given n of 1 or more, return the factorial of n, which is n * (n-1) * (n-2) ... 1.
    // Compute the result recursively (without loops).
    public static int factorial(int n){
        if(n == 1){
            return 1;
        } else {
            return n * factorial(n-1);
        }
    }

    //use recursion to add all of the numbers up to 10
    public static int sum(int k){
        if(k > 0){
            return k + sum(k - 1);
        } else {
            return 0;
        }
    }

    //use a loop to reverse a string
    public static String reverseIt(String myName){
        StringBuilder reverseName = new StringBuilder();
        char[] strChars = myName.toCharArray();
        int len = myName.length() - 1;
        for(int i = len; i >= 0; i--){
            reverseName.append(strChars[i]);
        }
        return (reverseName.toString());
    }

    //now use recursion
    public static String reverseItRecursive(String myName){
        if(myName.length() == 0){
            return ("");
        } else {
            return(reverseItRecursive(myName.substring(1)) + myName.charAt(0));
        }
    }

    //reverse the words in a sentence I am cool -- cool am I
    public static String reverseOrder(String aSentence){
        String[] reversed = aSentence.split(" ");
        String rev = "";
        for(int i = reversed.length - 1; i >= 0; i--){
            rev += reversed[i] + " ";
        }
        return rev;
    }

    //find the minimum value in an unsorted listed in java
    public static Integer getMin(List<Integer> list){
        Integer min = Integer.MAX_VALUE;  //initialize a variable named min to a max value
        for(Integer i : list){
            if(min > i){
                min = i;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        System.out.println("factorial(5) = " + factorial(5));
        System.out.println("sum(10) = " + sum(3));
        System.out.println("reverseIt(\"mary\") = " + reverseIt("mary"));
        System.out.println("reverseItRecursive(\"mary\") = " + reverseItRecursive("mary"));
//        fizzBuzz(35);
        System.out.println("multiple(10) = " + multiple(10));
        System.out.println("reverseOrder(\"I am cool\") = " + reverseOrder("I am cool"));
        List<Integer> list = new ArrayList<Integer>();
        list.add(99);
        list.add(5);
        list.add(1);
        list.add(56);
        list.add(60);
        list.add(6);
        System.out.println(list);
        System.out.println("getMin(list) = " + getMin(list));

    }
}
