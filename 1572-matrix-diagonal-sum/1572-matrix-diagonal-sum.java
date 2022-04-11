class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        int n=mat.length;
        if(n==1)
        {
            return mat[0][0];
        }
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[0].length;j++)
            {
                if((i==j)||(i+j==n-1))
                {
                    sum+=mat[i][j];
                }
            }
        }
        return sum;
    }
}