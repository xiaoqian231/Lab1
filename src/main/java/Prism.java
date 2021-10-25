public class Prism extends FigurePrism{
private double h;
private double a;
private double b;
private  double c;

    @Override
    double calculateTotalArea() {
        Triangle TR=new Triangle();
        Square SQ=new Square();
       TR.setA(this.a);
       TR.setB(this.b);
       TR.setC(this.c);
        SQ.setA(this.b);
        SQ.setB(this.h);
        return 2*TR.calculateArea()+3*SQ.calculateArea();
    }

    @Override
    double calculateVolum() {
        Triangle TR=new Triangle();
        TR.setA(a);
        TR.setB(b);
        TR.setC(c);
        return TR.calculateArea()*h;
    }

    public Prism( double h, double a, double b, double c) {

        this.h = h;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Prism() {
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
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
}
