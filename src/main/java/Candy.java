import java.util.Arrays;

public class Candy {
    //write a public class named Candy, the class should have 2 public fields
    public String name;
    public String size;  //small medium or large, not a number size
    //add a new field
    public String[] descriptors;

    //the class will need constructors, one for if we know the name, but not the size.
    public Candy(String candyName){
        this.name = candyName;     //you can use this to make it more clear, but it works without this
        this.size = "Halloween";
    }
    //and the another constructor for if we know both the name and size.
    public Candy(String candyName, String candySize){
        name = candyName;
        size = candySize;
    }
    //and, we need a constructor to deal with the new array of descriptors
    public Candy(String candyName, String candySize, String[] descriptors){
        this.name = candyName;
        this.size = candySize;
        this.descriptors = descriptors;
    }

    //bonus create a method that will print out a message
    public String showMessage(){
        return String.format("Ahhhh, a %s! I see that you got the %s size. Looks good!", name, size);
    }

    //instantiate the object
    public static void main(String[] args) {
        Candy yummy1 = new Candy("Snickers");
        Candy yummy2 = new Candy("Reeses", "small");
        Candy yummy3 = new Candy("M&Ms");
        Candy yummy4 = new Candy("Kit Kat", "full");
        System.out.println(yummy1.showMessage());
        System.out.println(yummy2.showMessage());
        System.out.println(yummy3.showMessage());
        System.out.println(yummy4.showMessage());
        System.out.println(yummy1.name);
        System.out.println(yummy4.name + " " + yummy4.size);
        //2nd warmup with descriptors. instantiate the object using our new constructor
        Candy funsizeSnickers = new Candy("Snickers", "fun-size", new String[]{"tree-nut allergy", "chocolate-covering", "classic"});
        Candy fullSizeKitKat = new Candy("Kit-Kat", "full", new String[]{"wafer", "chocolate", "classic"});
        System.out.println(Arrays.toString(funsizeSnickers.descriptors));
        //create a new array called myBag
        Candy[] myBag = {funsizeSnickers, fullSizeKitKat};
        //iterate through myBag that you just created
        for(Candy singleCandy : myBag){
            String descriptors = Arrays.toString(singleCandy.descriptors);

            descriptors = descriptors.substring(1, descriptors.length() - 1);
            System.out.printf("Here's a %s that is %s - it's described as: %s%n", singleCandy.name, singleCandy.size, descriptors);
        }
    }
}
