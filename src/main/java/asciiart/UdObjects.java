package asciiart;

import javax.swing.*;

public class UdObjects {

    public static void main(String[] args) {
        int number = 5;

        //create a window
        JFrame window = new JFrame();   //window variable that holds JFrame objects
        window.setTitle("My Window");   //calling methods on the JFrame object
        window.setSize(600, 400);

        JLabel label = new JLabel();   //label variable holds JLabel objects and create a new label
        label.setText("My Label");    //calling the setText method on the JLabel object to set it's text property

        window.add(label);      //call the add method of the JFrame object to add the label to the window

        window.setVisible(true); //this needs to be after the code or the label won't be visible


    }

}
