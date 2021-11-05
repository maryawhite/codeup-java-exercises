package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    //a constructor to set the name property and initialize the grades property as an empty ArrayList
    public Student(String name, ArrayList<Integer> grades) {
        this.name = name;
        this.grades = grades;
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

        ArrayList<Integer> grades = new ArrayList<>();  //initalize a new grades arrayList
        Student mary = new Student("Mary", grades);
        mary.addGrade(100);
        mary.addGrade(80);
        System.out.println(grades);
        System.out.println(mary.getName());
        System.out.println("mary.getGradeAverage() = " + mary.getGradeAverage());
        ArrayList<Integer> grades2 = new ArrayList<>();
        Student kevin = new Student("Kevin", grades2);
        kevin.addGrade(100);
        kevin.addGrade(90);
        System.out.println("kevin.getGradeAverage() = " + kevin.getGradeAverage());
        ArrayList<Integer> grades3 = new ArrayList<>();
        Student steven = new Student("Steven", grades3);
        steven.addGrade(90);
        steven.addGrade(85);
        System.out.println("steven.getGradeAverage() = " + steven.getGradeAverage());

    }

}


