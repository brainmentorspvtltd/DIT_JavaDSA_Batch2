package Recursion;

public class P8_Pattern_2 {
    static void printStar(int noOfStar) {
        if(noOfStar == 0) {
            return;
        }
        System.out.print("*");
        noOfStar = noOfStar - 1;
        printStar(noOfStar);
    }

    static void printPattern(int rows, int currentRow) {
        if(rows == 0) {
            return;
        }
        printStar(rows);
        System.out.println();
        printPattern(rows-1, currentRow+1);
    }

    public static void main(String[] args) {
        printPattern(5, 1);
    }
}
