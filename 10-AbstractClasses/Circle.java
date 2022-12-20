public class Circle extends Shape {
    double r;
    double area=0;

    public Circle(double r){
        this.r=r;
    }

    public int area(){
        area = 3.14*(r*r);
    }

    public void display(){
        System.out.println(area);
    }
}
