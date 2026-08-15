public class Point {
    private float x;
    private float y;
    private float z;
    private static int count = 0;

    // 1. Default Constructor
    public Point() {
        this.x = 0.0f;
        this.y = 0.0f;
        this.z = 0.0f;
        count++;
    }

    // Parameterized Constructor
    public Point(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
        count++;
    }

    // Copy Constructor
    public Point(Point other) {
        this.x = other.x;
        this.y = other.y;
        this.z = other.z;
        count++;
    }

    public static int getObjectCount() {
        return count;
    }

    // Getters and Setters
    public float getX() 
    { 
        return x; 
    }

    public void setX(float x) 
    { 
        this.x = x; 
    }

    public float getY() 
    {
        return y;
    }

    public void setY(float y)
    { 
        this.y = y; 
    }

    public float getZ() 
    { 
        return z; 
    }

    public void setZ(float z) 
    { 
        this.z = z; 
    }
    
    public Point add(Point obj)
    {
        float newX= this.x + obj.x;
        float newY= this.y + obj.y;
        float newZ= this.z + obj.z;
        return new Point(newX , newY, newZ);
    }

    public Point subtract(Point obj)
    {
        float newX= this.x - obj.x;
        float newY= this.y - obj.y;
        float newZ= this.z - obj.z;
        return new Point(newX , newY, newZ);
    }

    // Display method
    public void display() 
    {
        System.out.println("(" + x + ", " + y + ", " + z + ")");
    }

    // toString method
    @Override
    public String toString() 
    {
        String a= "(" + x + ", " + y + ", " + z + ")";
        return a;
    }
}