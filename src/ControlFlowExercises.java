public class ControlFlowExercises {

    public static void main(String[] args){

//        int i = 5;
//
//        while (i <= 15){
//            System.out.print(i + " ");
//            i++;
//        }

//        int i = 0;
//        do {
//            i += 2;
//            System.out.println(i);
//        } while (i < 100);

//        int i = 100;
//        do{
//            System.out.println(i);
//            i -= 5;
//        } while (i >= -10);

        long i = 2;   //this needs to be long, not int
        do{
            System.out.println(i);
            i *= i;
        } while (i < 1000000);

    }
}
