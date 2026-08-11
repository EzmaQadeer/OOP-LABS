public class Triangle {
    // Instance variables (Composition)
    private Point p1;
    private Point p2;
    private Point p3;
    private static int count = 0;

    // Default Constructor
    public Triangle() 
    {
        this.p1 = new Point(0, 0);
        this.p2 = new Point(1, 0);
        this.p3 = new Point(0, 1);
        count++;
    }

    // Parameterized Constructor
    public Triangle(Point p1, Point p2, Point p3) 
    {
        this.p1 = new Point(p1);
        this.p2 = new Point(p2);
        this.p3 = new Point(p3);
        count++;
    }

    // Overloaded Parameterized Constructor 
    public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) 
    {
        this.p1 = new Point(x1, y1);
        this.p2 = new Point(x2, y2);
        this.p3 = new Point(x3, y3);
        count++;
    }

    // Copy Constructor
    public Triangle(Triangle other) 
    {
        this.p1 = new Point(other.p1);
        this.p2 = new Point(other.p2);
        this.p3 = new Point(other.p3);
        count++;
    }

    public static int getObjectCount() 
    {
        return count;
    }

    // Getters and Setters
    public Point getP1()
    {
         return new Point(this.p1);
    }

    public void setP1(Point p1) 
    { 
        this.p1 = new Point(p1); 
    }

    public Point getP2() 
    { 
        return new Point(this.p2);
    }

    public void setP2(Point p2) 
    { 
        this.p2 = new Point(p2); 
    }

    public Point getP3() 
    { 
        return new Point(this.p3);
    }

    public void setP3(Point p3) 
    { 
        this.p3 = new Point(p3);
    }

    public void shiftTriangle(Point offset)
    {
        this.p1= this.p1.add(offset);
        this.p2= this.p2.add(offset);
        this.p3= this.p3.add(offset);
    }
    
    //  Display method
    public void display() 
    {
        System.out.println("Triangle vertices:");
        System.out.print("  P1: "); 
        p1.display();
        System.out.print("  P2: "); 
        p2.display();
        System.out.print("  P3: "); 
        p3.display();
    }

    // toString method
    @Override
    public String toString() {
        String s= "Triangle[" + p1.toString() + ", " + p2.toString() + ", " + p3.toString() + "]";
        return s;
    }
}