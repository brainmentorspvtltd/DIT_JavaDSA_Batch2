package Recursion;

public class P5_TreeRecursion {
    static void fun(int x) {
        System.out.println(x);
        if(x >= 3) {
            return;
        }
        fun(x + 1);
        fun(x + 2);
    }

    public static void main(String[] args) {
        fun(0);
    }
}
