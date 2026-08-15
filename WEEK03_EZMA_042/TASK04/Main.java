public class Main {
    public static void main(String[] args) {
        Point p1= new Point(0,0);
        Point p2= new Point(4,4);
        Point p3= new Point(0,4);
        Point p4= new Point(4,0);
        Line l1= new Line(p1,p2);
        System.out.println("Line 1 is: ");
        l1.display();
        Line l2= new Line(p3,p4);
        System.out.println("Line 2 is: ");
        l2.display();
        Point i = l1.intersection(l2);
        System.out.println("Intersection point is:");
        System.out.println(i);
        System.out.println("Length of line 1 is: ");
        System.out.println(l1.getLength());
    }
}