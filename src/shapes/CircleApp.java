package shapes;

import util.Input;

public class CircleApp {

    public static void main(String[] args) {

        Input input = new Input();

        Circle circle = new Circle(3);

        System.out.println("Enter a number for the radius: ");
        int userNum = input.getInt();
        System.out.print(userNum);

        System.out.println("The area is: " + circle.getArea(userNum));
        System.out.println("The circumference is: " + circle.getCircumference(userNum));

    }

    }


