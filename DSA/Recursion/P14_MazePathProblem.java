package Recursion;

import java.util.ArrayList;

public class P14_MazePathProblem {
    static ArrayList<String> getMaze(int currentRow, int currentCol, int endRow, int endCol) {
        if(currentRow == endRow && currentCol == endCol) {
            ArrayList<String> temp = new ArrayList<>();
            temp.add("");
            return temp;
        }

        if(currentRow > endRow || currentCol > endCol) {
            ArrayList<String> temp = new ArrayList<>();
            return temp;
        }

        ArrayList<String> result = new ArrayList<>();
        ArrayList<String> horizontalRes = getMaze(currentRow, currentCol+1, endRow, endCol);
        for(String tempRes : horizontalRes) {
            result.add("H" + tempRes);
        }

        ArrayList<String> verticalRes = getMaze(currentRow+1, currentCol, endRow, endCol);
        for(String tempRes : verticalRes) {
            result.add("V" + tempRes);
        }
        return result;

    }

    public static void main(String[] args) {
        System.out.println(getMaze(1, 1, 3, 3));
    }
}
