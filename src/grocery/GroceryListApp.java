package grocery;

import util.Input;

import java.util.*;

public class GroceryListApp {
    //a map to store unsorted values
    static Map<String, Integer> map = new HashMap<>();
    //function to sort a HashMap by Key from Geeks for Geeks website
    public static void sortByKey(HashMap<String, Integer> map){
        //TreeMap to store values of HashMap
        //copy all data from HashMap to TreeMap
        TreeMap<String, Integer> sorted = new TreeMap<>(map);
        //display the TreeMp which is naturally sorted
        for (Map.Entry<String, Integer> entry : sorted.entrySet())
            System.out.print("\t" + entry.getKey() + " " + entry.getValue() + ", \n");
    }

    public static void main(String[] args) {
        Input input = new Input();

        ArrayList<String> categories = new ArrayList<>();
        categories.add("1. Dairy");
        categories.add("2. Produce");
        categories.add("3. Frozen");
        categories.add("4. Bakery");
        categories.add("5. Deli");
        categories.add("6. Meat/Seafood");
        categories.add("7. Other");

        //make a hash map for each category
        HashMap<String, Integer> dairyMap = new HashMap<>();
        HashMap<String, Integer> produceMap = new HashMap<>();
        HashMap<String, Integer> frozenMap = new HashMap<>();
        HashMap<String, Integer> bakeryMap = new HashMap<>();
        HashMap<String, Integer> deliMap = new HashMap<>();
        HashMap<String, Integer> meatSeafoodMap = new HashMap<>();
        HashMap<String, Integer> otherMap = new HashMap<>();

        //first prompt:
        System.out.println("Hello, would you like to create a grocery list? y for yes, n for no");
        do {
            if (input.yesNo()) {      //this pulls up scanner.nextLine(); if y or yes it returns true
                System.out.println("Please enter a number for the category: ");
                System.out.println(categories);
                int userEntry = input.getInt();  //input.getInt returns scanner.nextInt()
//                input.getString();             //clear out the scanner returns scanner.nextLine()

                do {
                    if (userEntry == 1) {
                        System.out.println("Enter your item for the category of Dairy: ");
                        String userItemEntry = input.getString();
                        System.out.println("Enter Quantity");
                        int userQty = input.getInt();
                        dairyMap.put(userItemEntry, userQty);
                    } else if (userEntry == 2) {
                        System.out.println("Enter your item for the category of Produce: ");
                        String userItemEntry = input.getString();
                        System.out.println("Enter Quantity");
                        int userQty = input.getInt();
                        produceMap.put(userItemEntry, userQty);
                    } else if (userEntry == 3) {
                        System.out.println("Enter your item for the category of Frozen: ");
                        String userItemEntry = input.getString();
                        System.out.println("Enter Quantity");
                        int userQty = input.getInt();
                        frozenMap.put(userItemEntry, userQty);
                    } else if (userEntry == 4) {
                        System.out.println("Enter your item for the category of Bakery: ");
                        String userItemEntry = input.getString();
                        System.out.println("Enter Quantity");
                        int userQty = input.getInt();
                        bakeryMap.put(userItemEntry, userQty);
                    } else if (userEntry == 5) {
                        System.out.println("Enter your item for the category of Deli: ");
                        String userItemEntry = input.getString();
                        System.out.println("Enter Quantity");
                        int userQty = input.getInt();
                        deliMap.put(userItemEntry, userQty);
                    } else if (userEntry == 6) {
                        System.out.println("Enter your item for the category of Meat/Seafood: ");
                        String userItemEntry = input.getString();
                        System.out.println("Enter Quantity");
                        int userQty = input.getInt();
                        meatSeafoodMap.put(userItemEntry, userQty);
                    } else if (userEntry == 7) {
                        System.out.println("Enter your item for the category of Other: ");
                        String userItemEntry = input.getString();
                        System.out.println("Enter Quantity");
                        int userQty = input.getInt();
                        otherMap.put(userItemEntry, userQty);
                    } else {
                        System.out.println("Invalid response");
                        break;
                    }
//                    input.getString(); //clear out the scanner?  //this one prevents it from asking you 2 questions
                    System.out.println("Do you want to add another item in this same category. Y/N");
                } while (input.yesNo());    ////this pulls up scanner.nextLine(); if y or yes it returns true
            }
            System.out.println("Do you want to continue adding items? Y/N");  //it is prompting me twice to yes...
        }while (input.yesNo());



        System.out.println("Here's your list: ");
        System.out.println("Bakery");
        sortByKey(bakeryMap);
        System.out.println("Dairy");
        sortByKey(dairyMap);
        System.out.println("Deli");
        sortByKey(deliMap);
        System.out.println("Frozen");
        sortByKey(frozenMap);
        System.out.println("Meat/Seafood");
        sortByKey(meatSeafoodMap);
        System.out.println("Produce");
        sortByKey(produceMap);
        System.out.println("Other");
        sortByKey(otherMap);
    }
}
