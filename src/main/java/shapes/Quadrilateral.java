package shapes;

public abstract class Quadrilateral extends Shape implements Measurable {
    protected double length;
    protected double width;

    //constructor
    public Quadrilateral(double length, double width) {
        this.length = length;
        this.width = width;
    }

    //methods for getting length and width
    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    //abstract methods for setting length and width
    public abstract void setLength(double length);  //include the parameters here

    public abstract void setWidth(double width);

}
