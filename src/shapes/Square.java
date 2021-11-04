package shapes;

//change your existing square class to extend quadrilateral
public class Square extends Quadrilateral {

    public Square(double side) {
        super(side, side);
    }

    public double getPerimeter() {
        return 4 * this.length;
    }

    public double getArea() {
        return this.length * this.width;
    }

    public void setLength(double length) {  //make this void, it takes in a number and re-sets
        this.length = length;
    }

    public void setWidth(double width) {   //make this void
        this.width = width;
    }

//    protected int side;
//
//    //Square should define a constructor that accepts one argument, side, and calls the parent's constructor
//    // to set both the length and width to the value of side.
//    public Square(int side) {
//        super(side, side);
//        this.side = side;   //include this here to set the value
//    }
//
//    //In the Square class, override the getArea and getPerimeter methods
//    public int getArea(){
//        return this.side * this.side;  //use this to indicate this field/property
////        return (int) Math.pow(this.side, 2);  //this would work too
//    }
//
//    public int getPerimeter(){
//        return 4 * this.side;
//    }
//remove the work from the body of square and rectangle for the interface/abstract excercise

}
