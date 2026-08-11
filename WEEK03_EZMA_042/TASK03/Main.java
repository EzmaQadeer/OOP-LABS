public class Main {
    public static void main(String[] args) {
        Complex c1 = new Complex(4, 5);
        System.out.println("First complex number is: ");
        c1.display();
        
        Complex c2 = new Complex(7, 9);
        System.out.println("Second complex number is: ");
        c2.display();

        System.out.println("Result of addition of the two complex numbers: ");
        Complex result = c1.add(c2);
        System.out.println(result);
        
        System.out.println("Result of subtraction of the two complex numbers: ");
        Complex result2 = c1.subtract(c2);
        System.out.println(result2);
        
        System.out.println("Result of multiplication of the two complex numbers: ");
        Complex result3 = c1.multiply(c2);
        System.out.println(result3);
        
        System.out.println("Result of division of the two complex numbers: ");
        Complex result4 = c1.divide(c2); // Fixed from add to divide
        System.out.println(result4);
    }
}