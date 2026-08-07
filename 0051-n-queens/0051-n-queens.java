class Solution {
    public List<List<String>> solveNQueens(int n) {

        char board[][]=new char[n][n];;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                board[i][j]='.';
            }
        }
        List<List<String>> ans= new ArrayList<>();
        solve(board,0,ans);
        return ans;
    }

    private void solve(char[][] board, int col, List<List<String>> ans)
    {
        if(col==board.length)
        {
            ans.add(construct(board));
            return;
        }

        for(int i=0;i<board.length;i++)
        {
            if(isSafe(board,i,col))
            {
                board[i][col]='Q';
                solve(board,col+1,ans);
                board[i][col]='.';
            }
        }
    }

    private boolean isSafe(char[][] board, int row, int col) {

        // check left
        for (int j = col - 1; j >= 0; j--) {
            if (board[row][j] == 'Q') {
                return false;
            }
        }

        // upper-left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // lower-left diagonal
        for (int i = row + 1, j = col - 1; i < board.length && j >= 0; i++, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }   
    private List<String> construct(char board[][])
    {
        List<String> result=new ArrayList<>();
        for(int i=0;i<board.length;i++)
        {
            String row=new String(board[i]);
            result.add(row);
        }
        return result;
    }
}