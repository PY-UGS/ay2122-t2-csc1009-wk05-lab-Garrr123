package Week5;

public class Ellipse_Ques2 extends Shape {

    public Ellipse_Ques2(double dim1 , double dim2){
        super(dim1 , dim2);
    }

    public double getArea(){
        System.out.println("Inside area of Ellipse");
        return dim1 * dim2 * PI;
    }
}
