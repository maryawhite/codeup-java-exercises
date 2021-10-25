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

//        long i = 2;   //this needs to be long, not int
//        do{
//            System.out.println(i);
//            i *= i;
//        } while (i < 1000000);

//        for(int i = 100; i >= -10; i -= 5){
//            System.out.print(i + " ");
//        }
//
//        for(long i = 2; i < 1000000; i *= i){
//            System.out.println(i);
//        }

//        for(int i = 0; i <= 100; i += 2){
//            System.out.print(i + " ");
//        }
        for(int i = 1; i <=100; i++){
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");
            } else if(i % 3 == 0){
                System.out.println("Fizz");
            } else if (i % 5 == 0){
                System.out.println("Buzz");
            } else {
                System.out.println(i + " ");
            }
        }

    }
}
