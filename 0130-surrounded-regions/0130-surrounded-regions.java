class Solution {
    int row = 0;
    int col = 0;
    
    public void solve(char[][] board) {
        row = board.length;
        col = board[0].length;
        
        // Mark 'O' cells on the borders and initiate DFS from them
        for (int i = 0; i < row; i++) {
            if (board[i][0] == 'O') {
                dfs(board, i, 0);
            }
            if (board[i][col - 1] == 'O') {
                dfs(board, i, col - 1);
            }
        }
        for (int j = 0; j < col; j++) {
            if (board[0][j] == 'O') {
                dfs(board, 0, j);
            }
            if (board[row - 1][j] == 'O') {
                dfs(board, row - 1, j);
            }
        }
        
        // Convert remaining 'O' cells to 'X', and revert marked cells back to 'O'
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (board[i][j] == 'O') {
                    board[i][j] = 'X';
                } else if (board[i][j] == '1') {
                    board[i][j] = 'O';
                }
            }
        }
    }
    
    private void dfs(char[][] board, int i, int j) {
        // Out of bounds check
        if (i < 0 || i >= row || j < 0 || j >= col || board[i][j] != 'O') {
            return;
        }
        // Mark current 'O' cell as visited
        board[i][j] = '1';
        
        // DFS in all four directions
        dfs(board, i, j - 1); // left
        dfs(board, i - 1, j); // up
        dfs(board, i, j + 1); // right
        dfs(board, i + 1, j); // down
    }
}