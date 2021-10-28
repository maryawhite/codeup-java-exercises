import util.Input;

public class InputTest {

    public static void main(String[] args) {

        Input input = new Input();  //create an input object/instantiate the input class

        System.out.println("Enter any string");
        String userInput = input.getString();
        System.out.println(userInput);

        System.out.println("Would you like to continue, y for yes, n for no");
        boolean confirm = input.yesNo();
        System.out.println(confirm);


    }
}
