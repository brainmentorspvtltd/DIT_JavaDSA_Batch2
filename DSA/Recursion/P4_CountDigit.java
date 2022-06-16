package Recursion;

public class P4_CountDigit {
    static int countOfDigit(int n, int c) {
        if(n == 0) {
            return c;
        }
        if(n % 10 == 0) {
            c++;
        }
        return countOfDigit(n/10, c);
    }

    public static void main(String[] args) {
        countOfDigit(10400140, 0);
    }
}
