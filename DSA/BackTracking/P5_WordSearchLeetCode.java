package BackTracking;

public class P5_WordSearchLeetCode {
    char [][]board;
    boolean isValid = false;
    
    public boolean exist(char[][] board, String word) {
        this.board = board;
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[0].length; j++) {
                if(isMatch(i, j, word)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    boolean isMatch(int row, int col, String word) {
        // word found
        if(word.length() == 0) {
            return true;
        }

        if(row < 0 || col < 0 || row == this.board.length || col == this.board[0].length || this.board[row][col] != word.charAt(0)) {
            return false;
        }

        // Mark the path
        board[row][col] = '#';

        int directions[][] = {
            {0,1},  // right
            {1,0},  // down
            {0,-1}, // left
            {-1,0}  // top
        };

        for(int direction = 0; direction < directions.length; direction++) {
            int rowDirection = directions[direction][0];
            int colDirection = directions[direction][1];
            isValid = isMatch(row + rowDirection, col + colDirection, word.substring(1));
            if(isValid) {
                break;
            }
        }
        board[row][col] = word.charAt(0);
        return isValid;

    }
}
