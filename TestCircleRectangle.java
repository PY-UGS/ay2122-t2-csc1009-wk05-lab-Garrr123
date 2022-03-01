package Week5;

public class TestCircleRectangle {
    public static void main(String[] args) {
        Circle circle = new Circle(1);
        System.out.println("A Circle " + circle.toString());
        System.out.println("The Color is " + circle.getColour());
        System.out.println("The Radius is " + circle.getRadius());
        System.out.println("The Area is " + circle.getArea());
        System.out.println("The Diameter is " + circle.getDiameter());

        Rectangle rectangle = new Rectangle(2, 4);
        System.out.println("\nA Rectangle " + rectangle.toString());
        System.out.println("The area is " + rectangle.getArea());
        System.out.println("The Perimeter is " + rectangle.getPerimeter());



    }
}
