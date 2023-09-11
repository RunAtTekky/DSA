public class wordSearch {
    public static void main(String[] args) {
        char[][] board = {{'A','B','C','D'},{'S','F','C','S'},{'A','D','E','E'}};
        String word = "ABCCED";
        boolean res = rec(board, "", word, word, 0, 0, 'L');
        System.out.println(res);
    }
    static boolean rec(char[][] board, String p, String up, String word, int row, int col, char dir) {

        if (p.equals(word)) {
            return true;
        }
        boolean ans = false;
        char ch = up.charAt(0);
        if (!p.isEmpty()) {
            char og = board[row][col];
            board[row][col] = '0';
            if (dir != 'D' && row > 0 && board[row-1][col] == ch) {
                ans = ans || rec(board, p+ch, up.substring(1), word, row-1, col, 'U');
                if (ans) return true;
            }
            if (dir != 'U' && row < board.length-1 && board[row+1][col] == ch) {
                ans = ans || rec(board, p+ch, up.substring(1), word, row+1, col, 'D');
                if (ans) return true;
            }

            if (dir != 'R' && col>0 && board[row][col-1] == ch) {
                ans = ans || rec(board, p+ch, up.substring(1), word, row, col-1, 'L');
                if (ans) return true;
            }
            if (dir != 'L' && col<board[0].length-1 && board[row][col+1] == ch) {
                ans = ans || rec(board, p+ch, up.substring(1), word, row, col+1, 'R');
                if (ans) return true;
            }
            board[row][col] = og;
            return ans;
        }




        for (int i=0; i<board.length; i++) {
            for (int j=0; j<board[i].length; j++) {
                if (board[i][j] == ch) {
                    ans = ans || rec(board, p+ch, up.substring(1), word, i,j, 'N');

                }
            }
        }
        return ans;
    }
}
