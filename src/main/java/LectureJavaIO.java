import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class LectureJavaIO {

    public static void main(String[] args) throws IOException {

        String directory = "./src/lecturedata";
        String filename = "groceryList.txt";
        Path dataDirectory = Paths.get(directory);       //method
        Path dataFile = Paths.get(directory, filename); //overloaded method to get both
        System.out.println("dataFile = " + dataFile);

        //create the directory if it doesn't already exist
        if(Files.notExists(dataDirectory)){
            Files.createDirectories(dataDirectory);
        }

        //create the file if it doesn't already exist
        if(Files.notExists(dataFile)){
            Files.createFile(dataFile);
        }

        //an example of how to write into a txt file
        //get the path...
        Path groceriesTxtPath = Paths.get(directory, filename);
        System.out.println("groceriesTxtPath = " + groceriesTxtPath); //this prints out the relative file path

        //create a List, use the Arrays helper class, asList, to make a list datatype
        List<String> groceryList = Arrays.asList("dog food", "coffee creamer", "artisanal bread", "milk");
        System.out.println("groceryList = " + groceryList);

        Files.write(groceriesTxtPath, groceryList);

        //reading from the file and print to the console
        List<String> printList = Files.readAllLines(groceriesTxtPath); //takes in a file path
        System.out.println("line 44 printList = " + printList);



        //we can write our own print method
        for(int i = 0; i < printList.size(); i+=1){
            System.out.println((i + 1) + ": " + printList.get(i));
        }

        //if we don't want to overwrite our list, use append to add more items
        Files.write(groceriesTxtPath, Arrays.asList("eggs", "milkbones"), StandardOpenOption.APPEND);

        //you have to refresh/get Updated text file READ
        printList = Files.readAllLines(groceriesTxtPath);     //groceryList is the list we already created, we have to readAllLines again to get the most recent list
        for(int i = 0; i < printList.size(); i+=1){
            System.out.println((i + 1) + ": " + printList.get(i));
        }

        //update one item
        //get the current groceryList
        groceryList = Files.readAllLines(groceriesTxtPath);
        List<String> newList = new ArrayList<>();
        //then find the item you want to replace and replace it.
        for(String line : groceryList){
            if(line.equalsIgnoreCase("artisanal bread")){
                newList.add("potato bread");
                continue;
            }
            newList.add(line);
        }
        System.out.println("line 74  " + newList);
        //then WRITE it to the file
        //the code above replaces artisanal bread with potato bread, but to actually WRITE it to the text file, you have to use Files.write
        Files.write(groceriesTxtPath, newList);  //here newList is being written to the text file, not groceryList


        //
        //how would you remove an item?
        // .remove will remove the first occurrence of an item, or an item at a given index
        //remove, then write, then read...or read, remove, write, read
        newList = Files.readAllLines(groceriesTxtPath);
        newList.remove("milk");   //this worked, make sure you are updating the correct list, then write it. And you have to match the string exactly. Could probably use an index number instead.
        Files.write(groceriesTxtPath, newList);
        System.out.println("line 87  " + newList);
        int indexOfSomething = newList.indexOf("eggs");
        System.out.println("indexOfSomething = " + indexOfSomething);
        newList.remove(3);        //using an index to remove an item
        Files.write(groceriesTxtPath, newList);
        System.out.println("line 92  " + newList);


        //for remove, use .contains to find what the user wants to delete, then add a prompt, are you sure you want to delete this, if y, then remove using indexOf...



    }
}
