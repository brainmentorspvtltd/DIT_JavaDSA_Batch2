package Recursion;

public class P1_TypesOfRecursion {
    // Tail Recursion
    // void print(int n) {
    //     if(n == 0) {
    //         return;
    //     }
    //     System.out.println(n);
    //     print(n - 1);
    // }

    // Head Recursion
    // static void print(int n) {
    //     if(n == 0) {
    //         return;
    //     }
    //     print(n - 1);
    //     System.out.println(n);
    // }

    // Linear Recursion
    static void print(int n) {
        if(n == 0) {
            return;
        }
        System.out.println(n);
        print(n - 1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        print(5);
    }
}
