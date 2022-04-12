class Solution {
    public void gameOfLife(int[][] board) {
        int[] dx=new int[]{-1,-1,0,1,1,1,0,-1};
        int[] dy=new int[]{0,1,1,1,0,-1,-1,-1};
        int rows=board.length;
        int cols=board[0].length;
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                int count=0;
                for(int k=0;k<8;k++)
                {
                    int nextI=i+dx[k];
                    int nextJ=j+dy[k];
                    if(nextI>=0 && nextI < rows && nextJ>=0 && nextJ<cols && (board[nextI][nextJ]==1 || board[nextI][nextJ]==2))
                    {
                        count++;
                    }
                }
                if(board[i][j]==0 && count==3)
                {
                    board[i][j]=3;
                }
                else if(board[i][j]==1)
                {
                    if(count<2||count>3)
                    {
                        board[i][j]=2;
                    }
                }
            }
        }
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                if(board[i][j]==2)
                {
                    board[i][j]=0;
                }
                if(board[i][j]==3)
                {
                    board[i][j]=1;
                }
            }
        }
    }
}