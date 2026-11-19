class RationalNumber {
    private final int numerator;
    private final int denominator;

    public RationalNumber(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator must not be zero.");
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public boolean equals(RationalNumber other) {
        return other != null && this.numerator == other.numerator 
               && this.denominator == other.denominator;
    }
} // end class
