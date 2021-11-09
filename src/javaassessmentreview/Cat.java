package javaassessmentreview;

public class Cat extends Pet implements Meowable{

    public Cat(int age, boolean isRescue, String name) {
        super(age, isRescue, name);
    }

    private String color;

    //constructor
    public Cat(int age, boolean isRescue, String name, String color) {
        super(age, isRescue, name);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void meow() {
        System.out.println("This is a meow!");
    }

    public static void main(String[] args) {
        Cat cat = new Cat(6, true, "kerry", "brown");
        cat.meow();
    }
}
