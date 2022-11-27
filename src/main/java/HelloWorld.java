//public class HelloWorld {
//    public static void main(String[] args) {
//        System.out.println("Hello, World!");
//    }
//}

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, ");
        System.out.println("World!");

        //1. Create an int variable named myFavoriteNumber and assign your favorite number to it, then print it out to the console.
        int myFavoriteNumber = 28;
        System.out.println(myFavoriteNumber);

        //2. Create a String variable named myString and assign a string value to it, then print the variable out to the console.
        String myString = "My dog is named Charlie.";
        System.out.println(myString);

        //3. Change your code to assign a character value to myString. What do you notice?
//        char changeMyString = myString; creates an error, strings cannot be converted to char
//        myString = 'm'; //this also produces an error
        //4. Change your code to assign the value 3.14159 to myString. What happens?
//        myString = 3.14159;
        //error java: incompatible types: double cannot be converted to java.lang.String
        myString = "My dog is named Dog";
        System.out.println(myString);

        //5. Declare an long variable named myNumber, but do not assign anything to it. Next try to print out myNumber to the console. What happens.
        //produces an error, var was not initialized.
        //6. Change your code to assign the value 3.14 to myNumber. What do you notice?
        // 7. Change your code to assign the value 123L (Note the 'L' at the end) to myNumber.
        //8. Change your code to assign the value 123 to myNumber.
        //        long myNumber = 123;
        //9. Change your code to declare myNumber as a float. Assign the value 3.14 to it. What happens? What are two ways we could fix this?
//        float myNumber = 3.14F;
        double myNumber = 3.14;
        System.out.println("double " + myNumber);

//        float myNumber = (float) 3.14;  //this is casting
//        System.out.println(myNumber);

        double pi = 3.14159;
        System.out.println(pi);
        int almostPi = (int) pi;
        System.out.println(almostPi);

        //10. Copy and paste the following code blocks one at a time and execute them
//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);

//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);

        //11. Try to create a variable named class. What happens?
//        String class;
        //produces an error java: not a statement

        //12. Object is the most generic type in Java. You can assign any value to a variable of type Object. What do you think will happen when the following code is run?

//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) "three";
//        produces errors: string cannot be converted to int and string cannot be cast to class
        //13. Rewrite the following expressions using the relevant shorthand assignment operators:
//        int x = 4;
//        x += 5;
//        System.out.println(x);

//        int x = 3;
//        int y = 4;
//        y *= x;
//        System.out.println(y);

        int x = 10;
        int y = 2;
        x /= y;
        y -= x;
        System.out.println("x is: " + x);
        System.out.println("y is " + y);

//        byte bigNum = 1000000;  //you get the error java: incompatible types: possible lossy conversion from int to byte
//        System.out.println(bigNum);

        byte littleNum = 127;
        System.out.println(littleNum);
        littleNum++;
        System.out.println(littleNum);
//        littleNum++;
//        System.out.println(littleNum);
    }
}
