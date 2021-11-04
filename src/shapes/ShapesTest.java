package shapes;

public class ShapesTest {

    public static void main(String[] args) {
        Measurable myShape;

        //Test your code by creating instances of both Square and Rectangle and assigning
        // them to myShape so you can display the shape's area and perimeter.

        Square square202 = new Square(5);
        Rectangle rectangle202 = new Rectangle(4, 5);
        myShape = square202;
        System.out.println("myShape.getArea() = " + myShape.getArea());
        System.out.println("myShape.getPerimeter() = " + myShape.getPerimeter());

        myShape = rectangle202;
        System.out.println("myShape.getArea() = " + myShape.getArea());
        System.out.println("myShape.getPerimeter() = " + myShape.getPerimeter());

//        //my work is above, ShanShans way is below, different way of using Measurable myShape:
//        Measurable myShape = new Rectangle(4, 5);
//        System.out.println("myShape.getArea() = " + myShape.getArea());

//        Quadrilateral myQuad = new Square(5);
//        System.out.println("myQuad.getArea() = " + myQuad.getArea());




        //comment out previous work below, new exercise is above
//        Rectangle box1 = new Rectangle(5, 4);
//
//        System.out.println(box1.getPerimeter());
//        System.out.println(box1.getArea());
//
//        Square box2 = new Square(5);
//        System.out.println("box2.getPerimeter() = " + box2.getPerimeter());
//        System.out.println("box2.getArea() = " + box2.getArea());

    }

}
