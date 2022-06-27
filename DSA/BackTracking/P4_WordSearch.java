package BackTracking;

public class P4_WordSearch {
    static char board[][] = {
        {'A','B','C','E'},
        {'S','F','C','S'},
        {'A','D','E','E'}
    };

    static boolean isValid = false;

    static boolean searchWord(String word) {
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board.length; j++) {
                if(isMatch(i, j, word)) {
                    return true;
                }
            }
        }
        return false;
    }

    static boolean isMatch(int row, int col, String word) {
        // word found
        if(word.length() == 0) {
            return true;
        }

        if(row < 0 || col < 0 || row == board.length || board[row][col] != word.charAt(0)) {
            return false;
        }

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

    public static void main(String[] args) {
        String str = "ABCCEC";
        System.out.println(searchWord(str));
    }

}
