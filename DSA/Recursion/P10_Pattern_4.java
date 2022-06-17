package Recursion;

public class P10_Pattern_4 {
    static void printChar(int noOfChars, int charAscii) {
        if(noOfChars == 0) {
            return;
        }
        System.out.print((char)(64 + charAscii));
        noOfChars -= 1;
        printChar(noOfChars, charAscii);
    }

    static void printPattern(int rows, int currentRow) {
        if(rows == 0) {
            return;
        }
        printChar(currentRow, currentRow);
        System.out.println();
        printPattern(rows-1, currentRow+1);
    }
}
