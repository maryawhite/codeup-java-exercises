public class Candy {
    //write a public class named Candy, the class should have 2 public fields
    public String name;
    public String size;  //small medium or large, not a number size
    //the class will need 2 constructors, one for if we know the name, but not the size.
    public Candy(String candyName){
        name = candyName;
        size = "Halloween";
    }
    //and the second constructor for if we know both the name and size.
    public Candy(String candyName, String candySize){
        name = candyName;
        size = candySize;
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
    }


}
