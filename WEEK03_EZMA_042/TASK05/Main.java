public class Main
{
    public static void main(String[] args)
    {
        Point p1 = new Point(2, 4, 8);
        Point p2 = new Point(3, 9, 5);
        
        Vector v1 = new Vector(4, 7, 3, p1);
        System.out.println("Vector 1 is: ");
        v1.display();
        
        Vector v2 = new Vector(5, 4, 9, p2);
        System.out.println("Vector 2 is: ");
        v2.display();
        
        float dot_Product = v1.dotProduct(v2);
        System.out.println("Dot Product is: " + dot_Product);
        
        Vector cross_Product = v1.crossProduct(v2);
        System.out.println("Cross Product is: ");
        cross_Product.display();

        System.out.println("Direction of Vector 1:");
        Point dir =v1.getDirection();
        System.out.println(dir);

        Vector unit_Vector = v2.getUnitVector();
        System.out.println("Unit Vector of Vector 2: " + unit_Vector);
    }
}