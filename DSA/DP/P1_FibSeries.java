package DP;

public class P1_FibSeries {
    // Memoization - Top Down
    static int fib(int n, int []cache) {
        if(n == 0 || n == 1) {
            return n;
        }
        if(cache[n] != 0) {
            return cache[n];
        }

        int first = fib(n-1, cache);
        int second = fib(n-2, cache);
        int sum = first + second;
        cache[n] = sum;
        return cache[n];
    }

    // Tabulation - Bottom Up
    static int fibTabulation(int n, int cache[]) {
        cache[0] = 0;
        cache[1] = 1;
        for(int i = 2; i <= n; i++) {
            cache[i] = cache[i-1] + cache[i-2];
        }
        return cache[n];
    }

    public static void main(String[] args) {
        int nth = 5;
        int cache[] = new int[nth + 1];
        System.out.println(fib(nth, cache));
    }
}
