package interfaces_Abstract_lecture;

class Accountant extends Employee {
    //must include a default constructor
    public Accountant(String name, String department) {
        super(name, department);
    }

    //must implement the abstract method work that was declared in Employee
    public String work(){
        return "crunching numbers";
    }

    public String morningMeeting() {
        return "Accountants meet with the head of Business and Finance from 8:15 to 8:45 am.";
    }

    public String lunchTime() {
        return "Accountants eat lunch at their desk when they want to.";
    }

    public int dailyPay() {
        return 500;
    }
}
