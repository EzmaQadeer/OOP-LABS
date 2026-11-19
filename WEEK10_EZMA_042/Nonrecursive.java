class nonrecursive {

    public static  int fib(int n) {  ///fibonacci series
    if (n <= 0) return 0;
    if (n == 1) return 1;
    
    int prev1 = 0; // Represents fib(n-2)
    int prev2 = 1; // Represents fib(n-1)
    int current = 0;
    
    for (int i = 2; i <= n; i++) {
        current = prev1 + prev2; // Add the two previous numbers
        prev1 = prev2;           // Shift forward
        prev2 = current;
    }
    
    return current;
}

    public static int gcd(int a, int b) {  //gcd
        while(b!=0) {
            int r= a%b;
            a=b;
            b=r;
        }
    return a;
    }

    public static int factorial(int n) {
        int f=1;
        for(int i=n; i>0; i--) {
            f= f*i;
        }
        return f;
    }

    static int fact(int n) {  //recursive factorial method
        if(n==1) {
            return 1;
        }
        return n*fact(n-1);
    }


    public static void main(String[] args) {
        System.out.println("The number at 4th positiion of Fibonacci series is: " + fib(4));
        System.out.println("GCD of 48 and 18: " + gcd(48,18));
        System.out.println("Factorial of 5: " + factorial(5));
    }


}