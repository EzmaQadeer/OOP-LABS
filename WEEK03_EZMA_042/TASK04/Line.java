public class Line {
    private Point start;
    private Point end;
    private static int count=0;

public Line() {   //default constructor
    this.start= new Point(0,0);
    this.end = new Point(0,4);
    count++;
}   

public Line( Point p1, Point p2) {   //parametrized constructor
    this.start = new Point (p1);    //p1(x1,y1)
    this.end =  new Point (p2);      //p2(x2,y2)
    count++;
}

public Line( Line other) {   //copy constructor
    this.start= new Point (other.start);
    this.end= new Point (other.end);
    count++;
}

public void setStart(Point p) {
    this.start= new Point(p);
}

public void setEnd(Point p) {
    this.end= new Point(p);
}

public Point getStart() {
    return this.start;
}

public Point getEnd() {
    return this.end;
}

public static int getObjectCount() {
    return count;
}

public Point intersection(Line obj) {
    // calculating denominator
    float d = (float) (
        ((this.start.getX() - this.end.getX()) * (obj.start.getY() - obj.end.getY())) - 
        ((this.start.getY() - this.end.getY()) * (obj.start.getX() - obj.end.getX()))
    );
    
    if (d == 0) {
        System.out.println("The lines are parallel!");
        return null;
    } else {
        // Calculate the components for the numerators
        float term1 = (
            (this.start.getX() * this.end.getY()) - 
            (this.start.getY() * this.end.getX())
        );
        
        float term2 = (
            (obj.start.getX() * obj.end.getY()) - 
            (obj.start.getY() * obj.end.getX())
        );

        // Calculate X and Y using the determinant formulas
        float px = (
            (term1 * (obj.start.getX() - obj.end.getX()) - 
             (this.start.getX() - this.end.getX()) * term2) / d
        );
        
        float py = (
            (term1 * (obj.start.getY() - obj.end.getY()) - 
             (this.start.getY() - this.end.getY()) * term2) / d
        );

        // Return the intersection point as a new Point object
        return new Point(px, py);
    }
}

public float getLength() {
    // Distance formula: sqrt((x2 - x1)^2 + (y2 - y1)^2)
    float deltaX = (this.end.getX() - this.start.getX());
    float deltaY = (this.end.getY() - this.start.getY());
    
    return (float) Math.sqrt((deltaX * deltaX) + (deltaY * deltaY));
}
 
public void display() {
    System.out.println("Start: " + this.start.toString() + " | End: " + this.end.toString());
}

@Override
public String toString() {
    return "Start: " + this.start.toString() + " | End: " + this.end.toString();
}

}
