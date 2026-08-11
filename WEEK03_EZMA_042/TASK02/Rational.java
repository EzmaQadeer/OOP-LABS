public class Rational {
    private int numerator;
    private int denominator;
    private static int count = 0;

    // Default constructor 
    public Rational() {
        this.numerator = 3;
        this.denominator = 5;
        count++;
    }

    // Parameterized constructor
    public Rational(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero!");
        }
        if (denominator < 0) {
            this.numerator = -numerator;
            this.denominator = -denominator;
        } else {
            this.numerator = numerator;
            this.denominator = denominator;
        }
        count++;
    }

    // Copy constructor 
    public Rational(Rational other) {
        if (other == null) {
            throw new IllegalArgumentException("Other rational cannot be null!");
        }
        this.numerator = other.numerator;
        this.denominator = other.denominator;
        count++;
    }

    public int getNumerator() {
        return this.numerator;
    }

    public int getDenominator() {
        return this.denominator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero!");
        }
        if (denominator < 0) {
            this.numerator = -this.numerator;
            this.denominator = -denominator;
        } else {
            this.denominator = denominator;
        }
    }

    public static int getObjectCount() {
        return count;
    }

    public int gcd(int a, int b) {  //GREATEST COMMON DIVISOR
        if(b==0) {
            return Math.abs(a);
        }
        return gcd(b, a%b);  //recursion
    }

    public void simplify() {
        int common= gcd(this.numerator, this.denominator);
        this.numerator /= common;
        this.denominator /= common;
    }

    public Rational add(Rational f) {
        int newNumerator = (this.numerator * f.denominator) + (this.denominator * f.numerator);
        int newDenominator = this.denominator * f.denominator;
        Rational answer= new Rational(newNumerator, newDenominator);
        answer.simplify();
        return answer;
    }

    public Rational subtract(Rational f) {
        int newNumerator = (this.numerator * f.denominator) - (this.denominator * f.numerator);
        int newDenominator = this.denominator * f.denominator;
        Rational answer= new Rational(newNumerator, newDenominator);
        answer.simplify();
        return answer;
    }

    public Rational multiply(Rational f) {
        int newNumerator= this.numerator*f.numerator;
        int newDenominator= this.denominator*f.denominator;
        Rational answer= new Rational(newNumerator, newDenominator);
        answer.simplify();
        return answer;
    }

    public Rational divide(Rational f) {
        int newNumerator= this.numerator*f.denominator;
        int newDenominator= this.denominator*f.numerator;
        Rational answer= new Rational(newNumerator, newDenominator);
        answer.simplify();
        return answer;
    }

    public void display() {
        System.out.println(this.numerator + "/" + this.denominator);
    }

    @Override
    public String toString() {
        String s = this.numerator + "/" + this.denominator;
        return s;
    }
}