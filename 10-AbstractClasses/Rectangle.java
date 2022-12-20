public class Rectangle extends Shape {
    private double a, b;
    private double area = 0;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double area() {
        area = a * b;
    }

    public double perimeter(){
        return (2*a)+(2*b);
    }

    public void display() {
        System.out.println("Area: " + area);
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
