class Fibonacci {
    static int fib(int n) {
        if ( n <=1 ) { //base case
        return n; }
        
        return fib(n-1) + fib(n-2); //recursion case
    }

    static void printFib(int n) {
        for(int i=0; i<=n; i++) {
            System.out.print(fib(i)+ " ");
        }
    }

    public static void main(String[] args) {
        System.out.println("The number at 6th positiion of Fibnocci series is: " + fib(6));
printFib(6);
    }
}