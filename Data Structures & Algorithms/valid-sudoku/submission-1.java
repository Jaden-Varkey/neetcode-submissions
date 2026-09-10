class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            HashSet<Character> rows = new HashSet<>();
            for (int j = 0; j < board[0].length; j++) {
                if ((board[i][j] != '.') && rows.contains(board[i][j])) {
                    return false;
                }
                rows.add(board[i][j]);
            }
        }
        
        for (int i = 0; i < board[0].length; i++) {
            HashSet<Character> cols = new HashSet<>();
            for (int j = 0; j < board.length; j++) {
                if ((board[j][i] != '.') && cols.contains(board[j][i])) {
                    return false;
                }
                cols.add(board[j][i]);
            }
        }

        HashSet<Character>[] grid = new HashSet[board.length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (grid[((i / 3) * 3 + j / 3)] == null) {
                    grid[((i / 3) * 3 + j / 3)] = new HashSet<Character>();
                }
                if ((board[i][j] != '.') && grid[((i / 3) * 3 + j / 3)].contains(board[i][j])) {
                    return false;
                }
                grid[((i / 3) * 3 + j / 3)].add(board[i][j]);
            }
        }

        return true;
    }
}
