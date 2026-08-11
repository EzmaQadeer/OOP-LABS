public class Point {
    private double x;
    private double y;
    private static int count = 0;

    // 1. Default Constructor
    public Point() {
        this.x = 0.0;
        this.y = 0.0;
        count++;
    }

    // Parameterized Constructor
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
        count++;
    }

    // Copy Constructor
    public Point(Point other) {
        this.x = other.x;
        this.y = other.y;
        count++;
    }

    public static int getObjectCount() {
        return count;
    }

    // Getters and Setters
    public double getX() 
    { 
        return x; 
    }

    public void setX(double x) 
    { 
        this.x = x; 
    }

    public double getY() 
    {
        return y;
    }

    public void setY(double y)
    { 
        this.y = y; 
    }
    
    public Point add(Point obj)
    {
        double newX= this.x + obj.x;
        double newY= this.y + obj.y;
        return new Point(newX , newY);
    }

    public Point subtract(Point obj)
    {
        double newX= this.x - obj.x;
        double newY= this.y - obj.y;
        return new Point(newX , newY);
    }

    // Display method
    public void display() 
    {
        System.out.println("(" + x + ", " + y + ")");
    }

    // toString method
    @Override
    public String toString() 
    {
        String a= "(" + x + ", " + y + ")";
        return a;
    }
}