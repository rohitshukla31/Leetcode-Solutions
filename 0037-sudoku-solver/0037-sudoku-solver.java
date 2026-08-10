class Solution {
    public void solveSudoku(char[][] board) {
        funct(board);
    }

    private boolean valid(char[][] board, int row, int col, char ch)
    {
        for(int i=0;i<9;i++)
        {
            if(board[row][i]==ch)
            {
                return false;
            }
        }

        for(int j=0;j<9;j++)
        {
            if(board[j][col]==ch)
            {
                return false;
            }
        }

        for(int i=(row/3)*3;i<(row/3)*3+3;i++)
        {
            for(int j=(col/3)*3;j<(col/3)*3+3;j++)
            {
                if(board[i][j]==ch)
                {
                    return false;
                }
            }
        }
        return true;
    }
    private boolean funct(char[][] board)
    {
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                if(board[i][j]=='.')
                {
                    for(char ch='1';ch<='9';ch++)
                    {
                        if(valid(board,i,j,ch))
                        {
                            board[i][j]=ch;
                            if(funct(board))
                            {
                                return true;
                            }
                            board[i][j]='.';
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
}