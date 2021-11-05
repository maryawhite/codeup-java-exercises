package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    //a constructor to set the name property and initialize the grades property as an empty ArrayList
    public Student(String name, ArrayList<Integer> grades) {
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
        for(Integer oneGrade : grades){
            if(!grades.isEmpty()){
                sum += oneGrade;
            }
        }
        return sum/grades.size();
    }

}


