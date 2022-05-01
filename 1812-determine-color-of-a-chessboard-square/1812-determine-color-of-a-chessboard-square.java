class Solution {
    public boolean squareIsWhite(String coordinates) {
        int[][] mat=new int[8][8];
        //0=white=true
        //1=black==false
        for(int i=0;i<8;i++)
        {
            for(int j=7;j>=0;j--)
            {
                if((i+j)%2==0)
                {
                    mat[i][j]=0;
                }
                else
                {
                    mat[i][j]=1;
                }
            }
        }
        int col=coordinates.charAt(0)-'a';
        int row=coordinates.charAt(1)-'1';
        row=7-row;
        //System.out.println("row: "+row+" "+"col: "+col);
        return mat[row][col]==1?false:true;
    }
}