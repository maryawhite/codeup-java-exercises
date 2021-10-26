public class MethodsExercises {

    public static int add(int num1, int num2){
        return num1 + num2;
    }

    public static int subtract(int num1, int num2){
        return num1 - num2;
    }

    public static int multiply(int num1, int num2){
        return num1 * num2;
    }

    public static int divide(int num1, int num2){
        return num1 / num2;
    }

    public static int remainder(int num1, int num2){
        return num1 % num2;
    }



    public static void main(String[] args) {
        System.out.println("add: " + add(15, 3));
        System.out.println("subtract: " + subtract(15, 3));
        System.out.println("divide: " + divide(15, 3));
        System.out.println("multiply: " + multiply(15, 3));
        System.out.println("remainder: " + remainder(15, 3));
    }

    }
