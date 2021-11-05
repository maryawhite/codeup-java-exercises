import java.util.ArrayList;
import java.util.HashMap;

public class LectureCollections {

    public static void main(String[] args) {

//        String[] arrayLiteral = {"thing1", "thing2", "thing3"};

        ArrayList<String> students = new ArrayList<>();

        //methods we can use with ArrayList
        students.add("mcKenneth");
        students.add("mcCody");

        System.out.println("students.size() = " + students.size());
        System.out.println(students);

        ArrayList<Integer> myFavoriteNums = new ArrayList<>();

        myFavoriteNums.add(13);
        myFavoriteNums.add(23);
        myFavoriteNums.add(0,33);
        myFavoriteNums.add(1,43);
        System.out.println("myFavoriteNums = " + myFavoriteNums);
        myFavoriteNums.add(myFavoriteNums.size(), 99); //*adding to the end of the list... *.add already adds it to the end though
        System.out.println("myFavoriteNums = " + myFavoriteNums);
        System.out.println("myFavoriteNums.indexOf(23) = " + myFavoriteNums.indexOf(23));  //find the index of the number 23
        System.out.println("myFavoriteNums.get(3) = " + myFavoriteNums.get(3)); //get something from index 3
        System.out.println("myFavoriteNums.contains(42) = " + myFavoriteNums.contains(42));  //returns a true or false
        System.out.println("myFavoriteNums.isEmpty() = " + myFavoriteNums.isEmpty());     //returns true or false

        System.out.println("myFavoriteNums.remove((Integer) 43) = " + myFavoriteNums.remove((Integer) 43));   //to remove a number, you have to specify the object, otherwise it will try to get the index
        System.out.println("myFavoriteNums = " + myFavoriteNums);
        Integer sum = 0;
        for(Integer favNum : myFavoriteNums){
            sum += favNum;
        }
        System.out.println(sum/myFavoriteNums.size());



//        ArrayList<String> roasts = new ArrayList<>();
//        roasts.add("light");
//        roasts.add("medium");
//        roasts.add("medium");
//        roasts.add("dark");
//
//        System.out.println(roasts);
//        System.out.println();
//        System.out.println("-----Hash Maps----------Hash Maps-----");
//        System.out.println();
//
//        HashMap<String, String> usernames = new HashMap<>();
//
//        //use put to add a key value pair to your hashmap
//        usernames.put("Ryan", "ryanorsinger");
//        usernames.put("Zach", "zguolde");
//        usernames.put("Fernando", "fmendozaro");
//        usernames.put("Justin", "jreich5");
//        System.out.println(usernames);
//
//        //use get to obtain a value from your map
//        System.out.println("usernames.get(\"Ryan\") = " + usernames.get("Ryan"));
//
//        //get or Default, will provide a default value if the key/value is not found
//        System.out.println("usernames.get(\"mary\") = " + usernames.get("mary"));  //this will provide null bc there's no key/value for Mary
//        System.out.println("usernames.getOrDefault(\"Mary\", \"gocodeup\") = " + usernames.getOrDefault("Mary", "gocodeup"));
//
//        System.out.println("usernames.containsKey(\"Mary\") = " + usernames.containsKey("Mary"));
//        System.out.println("usernames.containsKey(\"Ryan\") = " + usernames.containsKey("Ryan"));
//        System.out.println("usernames.containsValue(\"Ken2Cool\") = " + usernames.containsValue("Ken2Cool"));
//
//        usernames.putIfAbsent("Sarah", "theBeast");
//        usernames.putIfAbsent("Justin", "jreich5");
//        System.out.println(usernames);
//        usernames.replace("Sarah", "theBest");
//        System.out.println(usernames);


    }

}
