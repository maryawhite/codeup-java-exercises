public class Student {
    public String name;
    public String cohort;
    private double grade;

    //use method overloading
    public Student(String studentName){
//        name = studentName;
//        cohort = "Unassigned";
//        this.name = studentName; same thing using this
//        this.cohort = "Unassigned";

        //calling constructor inside of constructor
        this(studentName, "unassigned");
    }

    public Student(String studentName, String studentCohort){
//        name = studentName;
//        cohort = studentCohort;
        //or when using this
        this.name = studentName;
        this.cohort = studentCohort;
    }

    public Student(String studentName, String studentCohort, double grade){
        this.name = studentName;
        this.cohort = studentCohort;
        this.grade = grade;
    }

    public static void main(String[] args){
        //before constructors: use .notation like the LecturePerson example
        //now
        //first constructor
        Student shanshan = new Student("Shanshan S.");

        System.out.println("shanshan.name = " + shanshan.name + " cohort " + shanshan.cohort);

        //second constructor
        Student kenneth = new Student("Kenneth H.", "Deimos");

        System.out.printf("%s is the student name and %s is their cohort", kenneth.name, kenneth.cohort);

        Student mcKen = new Student("mcKen", "mcDeimos", 88.8);
        System.out.println("mcKen.grade = " + mcKen.grade);
        //his grade will show up within this class. But, if you create a new class and try to bring it in you won't be able to access it

    }

}
