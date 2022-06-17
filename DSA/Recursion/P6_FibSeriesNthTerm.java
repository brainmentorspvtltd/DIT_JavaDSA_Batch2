package Recursion;

public class P6_FibSeriesNthTerm {
    static int x=0,y=1,z=0;
    static int fib(int n) {
        if(n <= 1) {
            return n;
        }
        return fib(n-1) + fib(n-2);
    }

    static void fibSeries(int count) {
        if(count > 0) {
            z = x + y;
            x = y;
            y = z;
            System.out.println(z);
            fibSeries(count - 1);
        }
    }

    public static void main(String[] args) {
        // System.out.println(fib(5));
        // int n = 10;
        // fibSeries(n-2);

        for(int i = 0; i < 10; i++) {
            System.out.print(fib(i) + ",");
        }
    }
}