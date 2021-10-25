import java.util.Scanner;

public class Circle extends Figure implements Printable {
   private double r;
    @Override
    double calculateArea() {
        return Math.PI*Math.pow(r,2);
    }
    @Override
    double calculatePerimeter() {
        return 2*r*Math.PI;
    }

    public Circle(double r) {
        this.r = r;
    }

    public Circle() {
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "r=" + r +
                '}';
    }

    @Override
    public void print() {
        System.out.println(this + " area: " + calculateArea() + " perimeter: " + calculatePerimeter());
    }
}
