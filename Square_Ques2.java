package Week5;

public class Square_Ques2 extends  Shape{

    public Square_Ques2(double dim1 , double dim2){
        super(dim1 , dim2);
    }

    public double getArea(){
        System.out.println("Inside area of Square");
        return dim1 * dim2 ;
    }
}
