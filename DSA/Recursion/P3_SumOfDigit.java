package Recursion;

public class P3_SumOfDigit {
    static int sumOfDigit(int n, int sum) {
        if(n == 0) {
            return sum;
        }
        sum += n % 10;
        n = n / 10;
        return sumOfDigit(n, sum);
    }

    public static void main(String[] args) {
        sumOfDigit(21414, 0);
    }
}
