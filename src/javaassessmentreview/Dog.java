package javaassessmentreview;

public class Dog extends Pet implements Barkable{

    public Dog(int age, boolean isRescue, String name) {
        super(age, isRescue, name);
    }

    private String breed;

    //constructor
    public Dog(int age, boolean isRescue, String name, String breed) {
        super(age, isRescue, name);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void bark() {
        System.out.println("bark bark!");

    }

    public static void main(String[] args) {
        Dog dog = new Dog(5,true,"Charlie");
        dog.bark();
    }


}
