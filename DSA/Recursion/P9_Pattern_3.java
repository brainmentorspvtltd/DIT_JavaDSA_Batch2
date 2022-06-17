package Recursion;

public class P9_Pattern_3 {

    static void printSpaces(int noOfSpaces) {
        if(noOfSpaces == 0) {
            return;
        }
        System.out.print(" ");
        printSpaces(noOfSpaces - 1);
    }

    static void printStar(int noOfStar) {
        if(noOfStar == 0) {
            return;
        }
        System.out.print("* ");
        noOfStar = noOfStar - 1;
        printStar(noOfStar);
    }

    static void printPattern(int rows, int currentRow) {
        if(rows == 0) {
            return;
        }
        printSpaces(rows-1);
        printStar(currentRow);
        System.out.println();
        printPattern(rows-1, currentRow+1);
    }

    public static void main(String[] args) {
        printPattern(5, 1);
    }
}