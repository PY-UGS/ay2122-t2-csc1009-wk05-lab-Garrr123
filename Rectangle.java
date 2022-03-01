package Week5;

public class Rectangle extends GeometricObject {

    private double width;
    private double height;

    public Rectangle(){
        super();
    }

    public Rectangle(double width, double height){
        super();
        this.width = width;
        this.height = height;
    }

    public Rectangle(double width , double height ,String color, boolean filled){
        super(color , filled);
        this.width = width;
        this.height = height;

    }

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return (this.width*2) + (this.height*2);
    }

}
