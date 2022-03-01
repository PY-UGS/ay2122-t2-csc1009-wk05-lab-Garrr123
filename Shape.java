package Week5;
import java.text.DecimalFormat;

public abstract class Shape {
    protected double dim1, dim2;
    protected final double PI = 3.142;

    public Shape(double dim1, double dim2 ){
        this.dim1 = dim1;
        this.dim2 = dim2;
    }
    public abstract double getArea();

    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("#,###.##");
        DecimalFormat df2 = new DecimalFormat("#,###.#");

        Rectangle_Ques2 r = new Rectangle_Ques2(9 , 5);
        Triangle_Ques2 t = new Triangle_Ques2(10 , 8);
        Circle_Ques2 c = new Circle_Ques2(5 , 5);
        Ellipse_Ques2 e = new Ellipse_Ques2(7 , 7);
        Square_Ques2 s = new Square_Ques2(6,6);

        Shape figref = r;
        System.out.println("Area is " + figref.getArea());
        figref = t;
        System.out.println("Area is " + figref.getArea());
        figref = c;
        System.out.println("Area is " + df2.format(figref.getArea()));
        figref = e;
        System.out.println("Area is " + df.format(figref.getArea()));
        figref = s;
        System.out.println("Area is " + figref.getArea());









    }

}



