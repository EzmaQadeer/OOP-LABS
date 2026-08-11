public class Main
{
public static void main(String[] args)
{
Rational f1= new Rational(); //default 
System.out.println("First fraction is: ");
f1.display();
Rational f2= new Rational(8,9); //parameterized 
System.out.println("Second fraction is: ");
f2.display();

System.out.println("Adding the two fractions: ");
Rational result= f1.add(f2);
System.out.println(result);
System.out.println("Subtracting the two fractions: ");
Rational result2= f1.subtract(f2);
System.out.println(result2);
System.out.println("Multiplying the two fractions: ");
Rational result3= f1.multiply(f2);
System.out.println(result3);
System.out.println("Dividing the two fractions: ");
Rational result4= f1.divide(f2);
System.out.println(result4);
}
}