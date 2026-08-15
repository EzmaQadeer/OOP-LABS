public class Vector {
    private Point direction;
    private float magnitudeA;
    private float magnitudeB;
    private float magnitudeC;

    // Default Constructor
    public Vector() {
        this.direction = new Point(1.0f, 1.0f, 1.0f);
        this.magnitudeA = 0.0f;
        this.magnitudeB = 0.0f;
        this.magnitudeC = 0.0f;
    }

    // Parameterized Constructor taking user-defined magnitudes and a user-defined direction Point
    public Vector(float magnitudeA, float magnitudeB, float magnitudeC, Point direction) {
        this.magnitudeA = magnitudeA;
        this.magnitudeB = magnitudeB;
        this.magnitudeC = magnitudeC;
        this.direction = new Point(direction);
    }

    // Copy Constructor
    public Vector(Vector other) {
        this.direction = new Point(other.direction);
        this.magnitudeA = other.magnitudeA;
        this.magnitudeB = other.magnitudeB;
        this.magnitudeC = other.magnitudeC;
    }

    // Getters and Setters
    public Point getDirection() 
    {
        return direction;
    }

    public void setDirection(Point direction) 
    {
        this.direction = direction;
    }

    public float getMagnitudeA() 
    {
        return magnitudeA;
    }

    public void setMagnitudeA(float magnitudeA) 
    {
        this.magnitudeA = magnitudeA;
    }

    public float getMagnitudeB() 
    {
        return magnitudeB;
    }

    public void setMagnitudeB(float magnitudeB) 
    {
        this.magnitudeB = magnitudeB;
    }

    public float getMagnitudeC() 
    {
        return magnitudeC;
    }

    public void setMagnitudeC(float magnitudeC) 
    {
        this.magnitudeC = magnitudeC;
    }

    // Dot Product: 
    public float dotProduct(Vector other) 
    {
        return (this.magnitudeA * other.magnitudeA) + 
               (this.magnitudeB * other.magnitudeB) + 
               (this.magnitudeC * other.magnitudeC);
    }

    // Cross Product
    public Vector crossProduct(Vector other) 
    {
        float newA = (this.magnitudeB * other.magnitudeC) - (this.magnitudeC * other.magnitudeB);
        float newB = (this.magnitudeC * other.magnitudeA) - (this.magnitudeA * other.magnitudeC);
        float newC = (this.magnitudeA * other.magnitudeB) - (this.magnitudeB * other.magnitudeA);

        return new Vector(newA, newB, newC, this.direction);
    }
    
    public Vector getUnitVector() 
    {
        float mag = (float) Math.sqrt((magnitudeA * magnitudeA) + (magnitudeB * magnitudeB) + (magnitudeC * magnitudeC));

        if (mag == 0) {
            return new Vector(0.0f, 0.0f, 0.0f, this.direction);
        }
        float newA = magnitudeA / mag;
        float newB = magnitudeB / mag;
        float newC = magnitudeC / mag;

        return new Vector(newA, newB, newC, this.direction);
    }

    // Display method with if-else for A, B, and C
    public void display() 
    {
        String aStr;
        if (magnitudeA < 0) {
            aStr = "" + magnitudeA;
        } else {
            aStr = "+" + magnitudeA;
        }

        String bStr;
        if (magnitudeB < 0) {
            bStr = "" + magnitudeB;
        } else {
            bStr = "+" + magnitudeB;
        }

        String cStr;
        if (magnitudeC < 0) {
            cStr = "" + magnitudeC;
        } else {
            cStr = "+" + magnitudeC;
        }

        System.out.println(aStr + "i " + bStr + "j " + cStr + "k");
    }

    // toString method with if-else for A, B, and C
    @Override
    public String toString() 
    {
        String aStr;
        if (magnitudeA < 0) {
            aStr = "" + magnitudeA;
        } else {
            aStr = "+" + magnitudeA;
        }

        String bStr;
        if (magnitudeB < 0) {
            bStr = "" + magnitudeB;
        } else {
            bStr = "+" + magnitudeB;
        }

        String cStr;
        if (magnitudeC < 0) {
            cStr = "" + magnitudeC;
        } else {
            cStr = "+ " + magnitudeC;
        }

        String str = aStr + "i " + bStr + "j " + cStr + "k";
        return str;
    }
}