package shapes;

import util.Input;

public class CircleApp {

    public static void main(String[] args) {

        Input input = new Input();

        System.out.println("Enter a number for the radius: ");
        //I should have used getDouble, not getInt
//        int userNum = input.getInt();
        double userNum = input.getDouble();
        System.out.print(userNum);

        Circle circle = new Circle(userNum);

        System.out.println("The area is approximately: " + circle.getArea(userNum));
        System.out.println("The circumference is approximately : " + circle.getCircumference(userNum));

    }

    }


