
import java.util.Scanner;

public class Triangle extends Figure {
    private  double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle() {
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

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    double calculateArea() {
        return 0.25 * Math.sqrt((a + b + c) * (a + b - c) * (a - b + c) * (b + c - a));
    }

    @Override
    double calculatePerimeter() {
        return a + b + c;
    }
}