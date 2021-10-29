package shapes;

class Circle {
    private double radius;

    //create a constructor, the constructor has the same name as the class.
    //This class should have a private radius property that is set through the constructor
    public Circle(double radius){
        this.radius = radius;

    }

    public double shareRadius(){
        return radius;
    }

    public double getArea(double radius){
        return Math.PI * (radius * radius);
    }

    public double getCircumference(double radius){
        return 2 * Math.PI * radius;
    }

}
