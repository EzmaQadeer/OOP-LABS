public class Complex {
    private double real;
    private double imaginary;
    private static int count = 0;

    public Complex() {
        this.real = 0.0;
        this.imaginary = 0.0;
        count++;
    }

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
        count++;
    }

    public Complex(Complex c) {
        this.real = c.real;
        this.imaginary = c.imaginary;
        count++;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }

    public double getRealNo() {
        return this.real;
    }

    public double getImaginaryNo() {
        return this.imaginary;
    }

    public static int getObjectCount() {
        return count;
    }

    public Complex add(Complex other) {
        double newReal = this.real + other.real;
        double newImaginary = this.imaginary + other.imaginary;
        return new Complex(newReal, newImaginary);
    }

    public Complex subtract(Complex other) {
        double newReal = this.real - other.real;
        double newImaginary = this.imaginary - other.imaginary;
        return new Complex(newReal, newImaginary);
    }

    public Complex multiply(Complex other) {
        double newReal = (this.real * other.real) - (this.imaginary * other.imaginary);
        double newImaginary = (this.real * other.imaginary) + (this.imaginary * other.real);
        return new Complex(newReal, newImaginary);
    }

    public Complex divide(Complex other) {
        double denominator = (other.real * other.real) + (other.imaginary * other.imaginary);

        if (denominator == 0.0) {
            throw new IllegalArgumentException("Cannot divide by zero!");
        }

        double newReal = ((this.real * other.real) + (this.imaginary * other.imaginary)) / denominator;
        double newImaginary = ((this.imaginary * other.real) - (this.real * other.imaginary)) / denominator;
        return new Complex(newReal, newImaginary);
    }

    @Override
    public String toString() {
        if (imaginary < 0) {
            return this.real + " - " + (-this.imaginary) + "i";
        } else {
            return this.real + " + " + this.imaginary + "i";
        }
    }

    public void display() {
        System.out.println(this.toString());
    }
}