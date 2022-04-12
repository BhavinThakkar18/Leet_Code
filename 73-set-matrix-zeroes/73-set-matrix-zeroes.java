class Solution {
    public void setZeroes(int[][] matrix) {
        HashSet<Integer> row=new HashSet<Integer>();
        HashSet<Integer> col=new HashSet<Integer>();
        int rows=matrix.length;
        int cols=matrix[0].length;
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                if(matrix[i][j]==0)
                {
                    row.add(i);
                    col.add(j);
                }
            }
        }
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                if(row.contains(i) || col.contains(j))
                {
                    matrix[i][j]=0;
                }
            }
        }
    }
}