import java.util.Locale;

public class LectureExceptions {

    public static void main(String[] args) {

//        System.out.println("Hello World");
//        try {
//            throw new Exception("Hey, something bad happened.");
//        } catch (Exception e){     //Exception e is a default
//            e.printStackTrace();
//        }

//        try{
//            System.out.println("Can I divide by 0");  //this will print to the console
//            int result = 1/0;
//            System.out.println("I did it!");  //this will not print to the console bc it's after the exception that is caught
//        } catch (ArithmeticException e){
//            e.printStackTrace();
//        }
        //this is a form of control flow

//        try{
////            throw new Exception("Something went wrong! \n Error \n Error\n");
////            throw new RuntimeException("Runtime exception! Check stack trace for details");
//            String nullStr = null;
//            System.out.println(nullStr.toLowerCase());
//        } catch(NullPointerException e) {
//            System.out.println("Null Pointer Exception");
//            e.printStackTrace();
//            e.getMessage();
//        } catch (RuntimeException e){
//            System.out.println("Runtime Exception");
//            e.printStackTrace();
//            e.getMessage();
//        } catch (Exception e){      //Exception e is the most generic (the least specific)
//            System.out.println("Generic exception");
//            e.printStackTrace();
//            e.getMessage();
//        } finally {
//            System.out.println("I will always run");
//        }

        try{
            String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
            System.out.println(days[5]);
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Most Specific. 1st catch.");
            e.printStackTrace();
            e.getMessage();
        } catch (RuntimeException e){
            System.out.println("Sorta Specific :/. 2nd catch.");
        } catch (Exception e){
            System.out.println("least specific. 3rd catch.");
        }
        //most specific conditions should be at the top



    }
}
