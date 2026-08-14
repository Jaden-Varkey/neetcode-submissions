class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            HashSet<Character> rows = new HashSet<>();
            for (int j = 0; j < board[0].length; j++) {
                if (rows.contains(board[i][j]) && (board[i][j] != '.')) return false;
                rows.add(board[i][j]);
            }
        }

        for (int j = 0; j < board[0].length; j++) {
            HashSet<Character> cols = new HashSet<>();
            for (int i = 0; i < board.length; i++) {
                if (cols.contains(board[i][j]) && (board[i][j] != '.')) return false;
                cols.add(board[i][j]);
            }
        }

        HashMap<String, HashSet<Character>> map = new HashMap<>();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                String matrix = (i/3) + "" + (j/3);
                map.putIfAbsent(matrix, new HashSet<Character>());
                if (map.get(matrix).contains(board[i][j]) && (board[i][j] != '.')) return false;
                map.get(matrix).add(board[i][j]);
            }
        }
        return true;
    }
}
