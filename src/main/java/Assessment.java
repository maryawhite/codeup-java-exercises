import java.lang.reflect.Array;
import java.util.ArrayList;

public class Assessment {

    public static double half(double number){
        return number * .5;
    }

    public static String shout(String myString){
        return myString.toUpperCase() + "!!!";
    }

    // create a public static method named `removeCats`. It should accept a list of animal
    // objects and return a list of animal objects where any animal object with a species of
    // "Felis catus" is removed.
    public static ArrayList<Animal> removeCats(ArrayList<Animal> animals){
        animals.removeIf(animal -> animal.getSpecies() == "Felis catus");
        return animals;
    }
    //I made an enhanced for loop, and IntelliJ suggested the "collection removal above. It uses a lamda expression
    ////        for(Animal animal : animals){
    //            if(animal.getSpecies() == "Felis catus"){
    //                animals.remove(animal);
    //            }
    //        }

    public static void main(String[] args) {
        System.out.println(half(24));
        System.out.println(shout("hello there"));

        Animal lion = new Animal("lion", "Panthera");
        Animal cat = new Animal ("Tiger", "Felis catus");
        Animal anotherAnimal = new Animal ("Liger", "Felis catus");
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(lion);
        animals.add(cat);
        animals.add(anotherAnimal);
        System.out.println("line 37   animals : " + animals);
        System.out.println("lion.getName and lion.getSpecies " + lion.getName() + " - " + lion.getSpecies());
        System.out.println("cat.getName and cat.getSpecies " + cat.getName() + " - " + cat.getSpecies());
        System.out.println("-----------------");
        removeCats(animals);
        System.out.println("-----------------");
        System.out.println("lion.getName and lion.getSpecies " + lion.getName() + " - " + lion.getSpecies());
        System.out.println("cat.getName and cat.getSpecies " + cat.getName() + " - " + cat.getSpecies());
        System.out.println("line 45    animals : " + animals);


    }



}




//Create an `Assessment` class with a public static method named `half`.
// It should accept a number and return the number divided by two.
//1. Within your `Assessment` class create a public static method named `shout`.
// It should accept a string and return the same string in all upper case with 3 exclamation marks added to the end of it.
