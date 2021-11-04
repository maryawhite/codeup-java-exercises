package shapes;

public class Rectangle extends Quadrilateral implements Measurable {
    //constructor
    public Rectangle(double length, double width) {
        super(length, width);
    }

    //implement methods
    public double getPerimeter() {
        return 2 * length + 2 * width;
    }

    public double getArea() {
        return length * width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }
//    protected int length;
//    protected int width;
//
//    public Rectangle(){}
//
//    //define a constructor that accepts 2 numbers for length and width and sets those properties
//    public Rectangle(int length, int width){
//        this.length = length;
//        this.width = width;
//    }
//
//    //create 2 methods, getArea and getPerimeter,  do not include parameters in the methods
//    public int getArea(){
//        return length * width;
//    }
//
//    public int getPerimeter(){
//        return 2 * length + 2 * width;
//    }
//remove the work from the body of square and rectangle for the interface/abstract excercise

}

