package interfaces_Abstract_lecture;

public class Custodian extends Employee {

    //bring in the constructor
    public Custodian(String name, String department) {
        super(name, department);
    }

    //must bring in the method from the superclass
    public String work() {
        return "Maintaining the building";
    }

    public String morningMeeting() {
        return "Custodians have a direct report to the head of the maintenance department.";
    }

    public String lunchTime() {
        return "Lunch time at 11-12:00.";
    }

    public int dailyPay() {
        return 180;
    }
}
