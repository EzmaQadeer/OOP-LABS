public class Main {
    public static void main(String[] args) {
        
        Point p1 = new Point(0, 0);
        Point p2 = new Point(4, 0);
        Point p3 = new Point(0, 3);
        Triangle t1 = new Triangle(p1, p2, p3);

        System.out.println("\n--- Triangle 1 ---");
        System.out.println(t1.toString());

        Triangle t2= new Triangle(0,6,2,3,7,5);
        System.out.println("\n--- Triangle 2 ---");
        t2.display();

        Triangle t3 = new Triangle(t2);
        System.out.println("\n--- Triangle 3 (Copied from Triangle 2) ---");
        t3.display();

        Point offset= new Point (6,7);
        t3.shiftTriangle(offset);
        System.out.println("\n--- New Triangle 3---");
        System.out.println(t3.toString());

        System.out.println("\nTotal Point objects created: " + Point.getObjectCount());
        System.out.println("Total Triangle objects created: " + Triangle.getObjectCount());

    }
}