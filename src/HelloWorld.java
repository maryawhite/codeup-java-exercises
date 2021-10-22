//public class HelloWorld {
//    public static void main(String[] args) {
//        System.out.println("Hello, World!");
//    }
//}

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, ");
        System.out.println("World!");
        int myFavoriteNumber = 28;
        System.out.println(myFavoriteNumber);
        String myString = "My dog is named Charlie.";
        System.out.println(myString);
//        char changeMyString = myString; creates an error, strings cannot be converted to char
        myString = "My dog is named Dog";
        System.out.println(myString);
//        long myNumber = 123;
        float myNumber = (float) 3.14;
        System.out.println(myNumber);
        double pi = 3.14159;
        System.out.println(pi);
        int almostPi = (int) pi;
        System.out.println(almostPi);
//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);

//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);

//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) "three"; string cannot be converted to int and string cannot be cast
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
