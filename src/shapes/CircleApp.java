package shapes;

import util.Input;
import java.util.Scanner;

public class CircleApp {

    public static void main(String[] args) {

        Input input = new Input();

        Circle circle = new Circle(3);

        System.out.println("Enter a number for the radius: ");
        int userNum = input.getInt();
        System.out.print(userNum);

        }

    }

}
