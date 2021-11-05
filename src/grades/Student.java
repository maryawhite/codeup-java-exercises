package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    //a constructor to set the name property and initialize the grades property as an empty ArrayList
    public Student(String name) {   //you don't have to have 2 parameters
        this.name = name;
        this.grades = new ArrayList<>();
    }


    //methods
    public String getName() {
        return name;
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public double getGradeAverage(){
        Integer sum = 0;
        if(grades.isEmpty()){
            return 0;  //how do I prevent it from dividing by zero?
        }
        for(Integer oneGrade : grades){
                sum += oneGrade;
        }
        return sum/grades.size();
    }

    public static void main(String[] args) {

        Student mary = new Student("Mary");
        mary.addGrade(100);
        mary.addGrade(80);
        System.out.println("mary.getGradeAverage() = " + mary.getGradeAverage());
        Student kevin = new Student("Kevin");
        kevin.addGrade(100);
        kevin.addGrade(90);
        System.out.println("kevin.getGradeAverage() = " + kevin.getGradeAverage());
        Student steven = new Student("Steven");
        steven.addGrade(90);
        steven.addGrade(85);
        System.out.println("steven.getGradeAverage() = " + steven.getGradeAverage());

    }

}


