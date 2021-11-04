package interfaces_Abstract_lecture;

public class Company {    //Haberdashery Inc

    public static void main(String[] args) {
        Accountant accountantBot = new Accountant("numberBot", "Accounting");
        Custodian cleanerBot = new Custodian("CleanerBot9000", "Maintenance");
//
//        System.out.println("Name: " + accountantBot.getName());
//        System.out.println("Department: " + accountantBot.getDepartment());
//        System.out.println("Method: " + accountantBot.work());
//
//        System.out.println(cleanerBot.getName());
//        System.out.println(cleanerBot.getDepartment());
//        System.out.println(cleanerBot.work());
        System.out.println(accountantBot.getName() + " is reporting for business for the " + accountantBot.getDepartment() + " deparment");
        System.out.println(cleanerBot.getName() + " is reporting for business for the " + cleanerBot.getDepartment() + " deparment");
        System.out.println("How do the morning meetings go?");
        System.out.println("numberBot's morning: " + accountantBot.morningMeeting());
        System.out.println("cleanerBots's morning: " + cleanerBot.morningMeeting());

        System.out.println("What happens at lunchtime?");
        System.out.println("numberBot's lunch: " + accountantBot.lunchTime());
        System.out.println("cleanerBot's lunch: " + cleanerBot.lunchTime());

        System.out.println("What kind of work do they do?");
        System.out.println("numberBot's work: " + accountantBot.work());
        System.out.println("cleanerBot's work: " + cleanerBot.work());

        System.out.println("How much is their daily pay?");
        System.out.println("accountantBot.dailyPay() = " + "$" + accountantBot.dailyPay());
        System.out.println("cleanerBot.dailyPay() = " + "$" + cleanerBot.dailyPay());


    }

}
