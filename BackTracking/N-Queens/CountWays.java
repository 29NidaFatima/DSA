
public class CountWays {
    public static boolean isSafe(char board[][], int row, int col) {
        // Vertical up
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }
        // Diagonal left up
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        // Diagonal right up
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }
 static int count=0;
    public static void nQueens(char board[][], int row) {
        // Base case: If all queens are placed, print the board
        if (row == board.length) {
          count++;
            return;
        }

        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';
                nQueens(board, row + 1); // Recursive call
                board[row][j] = '.'; // Backtracking step (FIXED)
            }
        }
    }

 

    public static void main(String[] args) {
        int n = 5; // Can be changed to any value
        char board[][] = new char[n][n];

        // Initialize board with '.'
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.'; // Fix initialization
            }
        }

        nQueens(board, 0);
        System.out.println("total way to solve N-queens="+ count);
    }
}
