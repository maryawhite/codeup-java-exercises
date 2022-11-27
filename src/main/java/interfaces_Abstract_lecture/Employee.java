package interfaces_Abstract_lecture;

abstract class Employee implements DailyWork {
    protected String name;
    protected String department;

    //set up a constructor
    public Employee(String name, String department){
        this.name = name;
        this.department = department;
    }

    //set up getter methods
    public String getName(){
        return this.name;
    }

    public String getDepartment(){
        return this.department;
    }

    //set up an abstract method
//    public abstract String work();  //curly braces and return not needed for abstract methods
    //after we set up our interface, we can comment out this line and add the implements keyword to the class
    //Employee is still considered the superclass.
}
