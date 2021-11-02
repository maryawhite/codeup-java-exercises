public class Employee extends Person {

    //constructor referencing another constructor
    public Employee(String employeeName) {
        super(employeeName);     //this references the name of the parameter, it's calling the constructor into the subclass
    }

    //the subclass can overwrite methods from the superclass, same name, same parameters, and same return type
    public void sayHello(){
        System.out.println("Welcome to MegaCorp - how may I help you?");
    }

    public int getAge(){
        return this.age;
    }

    //this method is only for the employee subclass, it's not part of the Person class
    public void doWork(){
        System.out.println("work, work...");
    }

    public static void main(String[] args) {

        Employee ken = new Employee("Ken");
        ken.sayHello();
        System.out.println("ken.getName = " + ken.getName());

        //try to call do work
        ken.doWork();


    }

}
