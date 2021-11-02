package shapes;

public class Rectangle {
    protected int length;
    protected int width;

    public Rectangle(){}

    //define a constructor that accepts 2 numbers for length and width and sets those properties
    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }

    //create 2 methods, getArea and getPerimeter,  do not include parameters in the methods
    public int getArea(){
        return length * width;
    }

    public int getPerimeter(){
        return 2 * length + 2 * width;
    }

}

