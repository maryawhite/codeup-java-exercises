import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
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

        //create a List, user the Arrays helper class, asList, to make a list datatype
        List<String> groceryList = Arrays.asList("dog food", "coffee creamer", "artisanal bread", "milk");
        System.out.println("groceryList = " + groceryList);

        Files.write(groceriesTxtPath, groceryList);

        //reading from the file and print to the console
        List<String> printList = Files.readAllLines(groceriesTxtPath); //takes in a file path
        System.out.println("printList = " + printList);


        //we can write our own print method
        for(int i = 0; i < printList.size(); i+=1){
            System.out.println((i + 1) + ": " + printList.get(i));
        }

        //if we don't want to overwrite our list
        Files.write(groceriesTxtPath, Arrays.asList("eggs", "milkbones"), StandardOpenOption.APPEND);

        //you have to refresh/get Updated text file
        printList = Files.readAllLines(groceriesTxtPath);     //groceryList is the list we already created, we have to readAllLines again to get the most recent list
        for(int i = 0; i < printList.size(); i+=1){
            System.out.println((i + 1) + ": " + printList.get(i));
        }

        //update one item
        //get the current groceryList
        groceryList = Files.readAllLines(groceriesTxtPath);
        List<String> newList = new ArrayList<>();

        for(String line : groceryList){
            if(line.equalsIgnoreCase("artisanal bread")){
                newList.add("potato bread");
                continue;
            }
            newList.add(line);
        }

        System.out.println(newList);
        //the code above replaces artisanal bread with potato bread, but to actually write it to the text file, you have to use Files.write
        Files.write(groceriesTxtPath, newList);


    }
}
