
public class Rectangle
                                                                                                                               {
    
    // Class attributes
    int length;
    int wide;
    
    // Class methods
    public void displayDimension() {
        System.out.println("Rectangle's dimension is " + length +"x"+wide+ ".");
    }
    
    public void displayPerimeter() {
        System.out.println("Rectangle parimeter is " + (2*length+2*wide)+ ".");
    }

    public void displaySurfaceArea() {
        System.out.println("Rectangle surface is " + (length*wide) + " pages.");
    }
}
