package grades;

import util.Input;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {

    public static void main(String[] args) {

        Input input = new Input();

        HashMap<String, Student> students = new HashMap<>();
        Student student1 = new Student("Matthew");
        student1.addGrade(60);
        student1.addGrade(70);
        student1.addGrade(80);

        Student student2 = new Student("Mark");
        student2.addGrade(65);
        student2.addGrade(75);
        student2.addGrade(85);

        Student student3 = new Student("Lucy");
        student3.addGrade(78);
        student3.addGrade(88);
        student3.addGrade(98);

        Student student4 = new Student("Kevin");
        student4.addGrade(90);
        student4.addGrade(90);
        student4.addGrade(90);

        students.put("bravo2a", student1);
        students.put("alpha3b", student2);
        students.put("xena44aa", student3);
        students.put("hercules888", student4);

        System.out.println("Welcome!");

        boolean prompting = true;
        while(prompting) {

        System.out.println("Here are the github usernames of our students:");

        for(String oneStudent : students.keySet()){
            System.out.print(oneStudent + " | ");
        }

            System.out.println("\nWhich student would you like to see more information on?");
            String userResponse = input.getString();
            if (!students.containsKey(userResponse)) {
                System.out.println("Sorry, no student found with the GitHub username of " + userResponse);
                System.out.println("Would you like to see another student? y for yes, n for no");
                if (input.yesNo()) {
                    continue;
                } else{
                    System.out.println("Goodbye, and have a wonderful day!");
                    prompting = false;
                }
            }
            if(students.containsKey(userResponse)){
                System.out.println("\tName:" + students.get(userResponse).getName() + "\n\tGitHub username: " + userResponse + "\n\tCurrent Average: " + students.get(userResponse).getGradeAverage());
                System.out.println("Would you like to see another student? y for yes, n for no");
                if (input.yesNo()) {
                    continue;
                } else{
                    System.out.println("Goodbye, and have a wonderful day!");
                    prompting = false;
                }
            }

        }


//        ArrayList<String> keys = new ArrayList<>(students.keySet());
//        System.out.println("keys = " + keys);
    }

}
