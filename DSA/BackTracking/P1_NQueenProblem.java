package BackTracking;

public class P1_NQueenProblem {

    static int getCount(boolean[][] board) {
        int countDown = 0;
        for(int row = 0; row < board.length; row++) {
            for(int col = 0; col < board.length; col++) {
                if(board[row][col]) {
                    System.out.println(board[row][col] + "\t" + row + "," + col);
                    countDown++;
                }
            }
        }
        return countDown;
    }

    static int countWays(boolean [][]board, int currentRow) {
        int count = 0;
        if(currentRow == board.length) {
            System.out.println("Total Queen Placed : " + getCount(board));
            return 1;
        }
        for(int col = 0; col < board[currentRow].length; col++) {
            if(isSafeArea(board, currentRow, col)) {
                board[currentRow][col] = true;
                count = count + countWays(board, currentRow + 1);
                // this is the only code we have to add for backtracking
                board[currentRow][col] = false;
            }
        }
        return count;
    }

    static boolean isSafeArea(boolean[][] board, int row, int col) {
        // checking if the there is a queen in same column
        for(int i = row; i >= 0; i--) {
            if(board[i][col]) {
                return false;
            }
        }

        // check in upper left diagonal
        for(int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if(board[i][j]) {
                return false;
            }
        }

        // check in upper right diagonal
        for(int i = row, j = col; i >= 0 && j < board.length; i--, j++) {
            if(board[i][j]) {
                return false;
            }
        }
        
        return true;
    }

    public static void main(String[] args) {
        boolean[][] board = new boolean[4][4];
        System.out.println(countWays(board, 0));
    }
    
}
