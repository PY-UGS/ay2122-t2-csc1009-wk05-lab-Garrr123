package Week5;

public class Circle extends GeometricObject {
    private  double radius;


    public Circle(){
        super();
    }
    public Circle(double radius){
        super();
        this.radius = radius;
    }

    public Circle(double radius , String color , boolean filled){
        super(color , filled);
        this.radius = radius;

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    public double getDiameter() {
        return radius * 2;
    }

    public void printCircle(){

    }


}
