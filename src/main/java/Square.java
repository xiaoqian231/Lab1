import java.util.Scanner;

public class Square extends Figure{
   private  double a ;
   private  double b;

    public Square(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public Square() {
    }

    @Override
    double calculateArea() {
        return a*b;
    }
    @Override
    double calculatePerimeter() {
        return 2*(a+b);
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }
}
