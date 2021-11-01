import java.util.Arrays;

public class LectureArray {


    public static void main(String[] args) {
        double[] prices = new double[4];
        final int numberOfSides = 6;

        int[] diceSides = new int[numberOfSides];

        System.out.println("prices.length = " + prices.length);
        System.out.println("diceSides.length = " + diceSides.length);
//
        String[] mybag = {"Snickers", "Reeses", "brussel sprouts"};
        //a regular for loop
        for(int i = 0; i < mybag.length; i++){
            System.out.println(mybag[i]);
        }
//        //an enhanced for loop (for Each)
//        for(String candy : mybag){     //you can name candy whatever, one candy of candies, one price of prices, etc
//            System.out.println(candy);
//        }
//
//        String[] anotherBag = new String[12];  //this creates an array called anotherBag with a length of 12
//
//        Arrays.fill(anotherBag, "snickers"); //use the fill method to give each element the same value
//        for(String candy : anotherBag){
//            System.out.println(candy);
//        }
//
        String[] mybagplustwo = Arrays.copyOf(mybag, 5);
        System.out.println("length of mybagplustwo: " + mybagplustwo.length);
        System.out.println(Arrays.toString(mybagplustwo));

//        //Stringify an array
//        System.out.println(Arrays.toString(mybagplustwo));
//
//        //sort an array, note that lower case is sorted after uppercase
//        Arrays.sort(mybag);
//        for(String candy : mybag){
//            System.out.println(candy);
//        }
//
//        //searching inside an array
//        int skittlesindex = Arrays.binarySearch(mybag, "Reeses");
//        int snickersindex = Arrays.binarySearch(mybag, "Snickers");

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int[] row : matrix) {
            System.out.println("+---+---+---+");

            System.out.print("| ");

            for (int n : row) {
                System.out.print(n + " | ");
            }

            System.out.println();
        }

        System.out.println("+---+---+---+");




    }

}
