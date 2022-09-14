class Solution {
    public int numSpecial(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int[] sumOfRow = new int[m];
        int[] sumOfColumn = new int[n];
        int ans=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(matrix[i][j]==1)
                {
                    sumOfRow[i]++;
                    sumOfColumn[j]++;
                }
            }
        }
        
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(matrix[i][j]==1 && sumOfRow[i]==1 && sumOfColumn[j]==1)
                {
                    ans++;
                }
            }
        }
        return ans;
    }
}