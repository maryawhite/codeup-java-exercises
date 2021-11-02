public class CodingBat {
    //The parameter weekday is true if it is a weekday, and the parameter
    // vacation is true if we are on vacation. We sleep in if it is not a
    // weekday or we're on vacation. Return true if we sleep in.
    public static boolean sleepIn(boolean weekday, boolean vacation){
        if(!weekday || vacation){
            return true;
        }
        return false;
    }

    //We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if
    // each is smiling. We are in trouble if they are both smiling or if neither of
    // them is smiling. Return true if we are in trouble.
    public static boolean inTrouble(boolean aSmile, boolean bSmile){
        if(aSmile && bSmile || !aSmile && !bSmile){
            return true;
        }
        return false;
    }

    //Given two int values, return their sum.
    // Unless the two values are the same, then return double their sum.
    public static int sumDouble(int a, int b){
        if(a == b){
            return (a + b) * 2;
        } else {
            return a + b;
        }
    }

    //Given an int n, return the absolute difference between n and 21,
    // except return double the absolute difference if n is over 21.
    public static int diff21(int n){
        if(n > 21){
            return Math.abs((21 - n) * 2);  //use Math.abs to convert them all to positive bc the absolute value is never negative
        } else {
            return Math.abs(21 - n);
        }
    }

    //We have a loud talking parrot. The "hour" parameter is the current hour time in
    // the range 0..23. We are in trouble if the parrot is talking and the hour is before
    // 7 or after 20. Return true if we are in trouble.
    public static boolean parrotTrouble(boolean talking, int hour){
        if(talking && hour > 20 || talking && hour < 7){
            return true;
        }
        return false;
    }

    //Given an "out" string length 4, such as "<<>>", and a word, return a new string
    // where the word is in the middle of the out string, e.g. "<<word>>".
    // Note: use str.substring(i, j) to extract the String starting at index i and
    // going up to but not including index j.
    public static String makeOutWord(String out, String word){
        String substringBeg = out.substring(0,2);
        String substringEnd = out.substring(2, out.length());
        return substringBeg + word + substringEnd;
    }

    //Given a string, return a new string made of 3 copies of the last 2 chars
    // of the original string. The string length will be at least 2.
    public static String extraEnd(String str){
        String lastTwo = "";
        lastTwo = str.substring(str.length() - 2);
        return lastTwo + lastTwo + lastTwo;
    }

    //Given a string, return the string made of its first two chars, so the String
    // "Hello" yields "He". If the string is shorter than length 2, return whatever
    // there is, so "X" yields "X", and the empty string "" yields the empty string "".
    // Note that str.length() returns the length of a string.
    public static String firstTwo(String str){
        if(str.length() > 2){
            return str.substring(0,2);
        } else {
            return str;
        }
    }

    //Given an array of ints, return true if 6 appears as either the first or
    // last element in the array. The array will be length 1 or more.
    public static boolean firstLast6(int[] nums){
        if(nums[0] == 6 || nums[nums.length - 1] == 6){
            return true;
        }
        return false;
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
    //how does factorial work...if the number is 5, it would be 5 * 4 * 3 * 2 * 1 or 5 * (5-1) * (4-1) * (3-1) * (2-1)

    //We have a number of bunnies and each bunny has two big floppy ears.
    // We want to compute the total number of ears across all the bunnies recursively
    // (without loops or multiplication).
    public static int bunnyEars(int bunnies){
        if(bunnies == 0){
            return 0;
        } else {
            return bunnyEars(bunnies - 1) + 2;
        }
    }

    //The fibonacci sequence is a famous bit of mathematics, and it happens to have a
    // recursive definition. The first two values in the sequence are 0 and 1
    // (essentially 2 base cases). Each subsequent value is the sum of the previous
    // two values, so the whole sequence is: 0, 1, 1, 2, 3, 5, 8, 13, 21 and so on.
    // Define a recursive fibonacci(n) method that returns the nth fibonacci number, with n=0
    // representing the start of the sequence.
    public static int fibonacci(int n){
        if(n <= 1){
            return n;
        } else {
            return fibonacci(n-1) + fibonacci(n-2);  //for the number 2, 2-1=1 2-0=0, 1+0 = 1 the answer is 1
        }
    }


    public static void main(String[] args) {
//        System.out.println("shall we sleep in? " + sleepIn(false, false));  //this returns true if we sleep in, and we sleep in if weekday is false or if vacation is true
//        System.out.println("Are we in trouble? " + inTrouble(true, true)); //this returns true, bc if they are both smiling we are in troulbe
//        System.out.println("Are we in trouble? " + inTrouble(true, false)); //this returns false, bc we are not in trouble if only one is smiling
//        System.out.println("sumDouble(1,2) = " + sumDouble(1, 2));
//        System.out.println("sumDouble(3,2) = " + sumDouble(3, 2));
//        System.out.println("sumDouble(2,2) = " + sumDouble(2, 2));
//        System.out.println("diff21(19) = " + diff21(19));
//        System.out.println("diff21(10) = " + diff21(10));
//        System.out.println("diff21(21) = " + diff21(21));
//        System.out.println("diff21(22) = " + diff21(22));
//        System.out.println("diff21(30) = " + diff21(30));
//        System.out.println("parrotTrouble(true, 6) = " + parrotTrouble(true, 6));
//        System.out.println("parrotTrouble(true, 7) = " + parrotTrouble(true, 7));
//        System.out.println("parrotTrouble(false, 6) = " + parrotTrouble(false, 6));
//        System.out.println("makeOutWord(\"<<>>\", \"Yay\") = " + makeOutWord("<<>>", "Yay"));
//        System.out.println("extraEnd(\"Hello\") = " + extraEnd("Hello"));
//        System.out.println("firstTwo(\"Hello\") = " + firstTwo("Hello"));
//        System.out.println("firstTwo(\"x\") = " + firstTwo("x"));
//        int[] nums = {1, 2, 6};
//        System.out.println("firstLast6(nums) = " + firstLast6(nums));
//        System.out.println("factorial(3) = " + factorial(3));
//        System.out.println("factorial(5) = " + factorial(5));
        System.out.println("bunnyEars(8) = " + bunnyEars(8));
        System.out.println("fibonacci(2) = " + fibonacci(2));
        System.out.println("fibonacci(7) = " + fibonacci(7));  //the answer is 13, bc the 7th index in the sequence is 13
    }

}
//examples from codingbat.com
