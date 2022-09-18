class Solution {
    public String checkBoard(char[][] board)
    {
        //checking for rows
            for(int i=0;i<board.length;i++)
            {
                int countA=0;
                int countB=0;
                for(int j=0;j<board.length;j++)
                {
                    if(board[i][j]=='X')countA++;
                    else if(board[i][j]=='0') countB++;
                }
                if(countA==3) return "A";
                if(countB==3) return "B";
            }
        //checking for columns
            for(int j=0;j<board.length;j++)
            {
                int countA=0;
                int countB=0;
                for(int i=0;i<board.length;i++)
                {

                    if(board[i][j]=='X') countA++;
                    else if(board[i][j]=='0') countB++;
                }
                if(countA==3) return "A";
                if(countB==3) return "B";
            }
        //check diagonals
        if(board[0][0]=='X' && board[1][1]=='X' && board[2][2]=='X') return "A";
        if(board[0][0]=='0' && board[1][1]=='0' && board[2][2]=='0') return "B";
        
        //check the other diagonal
        if(board[2][0]=='X' && board[1][1]=='X' && board[0][2]=='X') return "A";
        if(board[2][0]=='0' && board[1][1]=='0' && board[0][2]=='0') return "B";
        
        //check for draw
        int c=0;
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                if(board[i][j]=='X' || board[i][j]=='0') c++;  
            }
        }
        if(c!=9)
        {
            return "Pending";
        }
        return "Draw";
    }
    public String tictactoe(int[][] moves) {
        char[][] board = new char[3][3];
        for(char[] c:board)
        {
            Arrays.fill(c,'.');
        }
        
        for(int i=0;i<moves.length;i++)
        {
            if(i%2==0)
            {
                board[moves[i][0]][moves[i][1]]='X';
            }
            else
            {
                board[moves[i][0]][moves[i][1]]='0';
            }
        }
        return checkBoard(board);
    }
}