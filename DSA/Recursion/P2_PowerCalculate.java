package Recursion;

public class P2_PowerCalculate {
    static int power(int base, int p) {
        if(p == 0){
            return 1;
        }
        return base * power(base, p-1);
    }

    public static void main(String[] args) {
        System.out.println(power(5, 5));
    }
}
