class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for(int i=0;i<matrix.length;i++)
        {
            int minIndex=0;
            int min=Integer.MAX_VALUE;
            for(int j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][j]<min)
                {
                    min=matrix[i][j];
                    minIndex=j;
                }
            }
            int max = Integer.MIN_VALUE;
            for(int k=0;k<matrix.length;k++)
            {
                if(matrix[k][minIndex]>max)
                {
                    max = matrix[k][minIndex];
                    if(max>min)
                        break;
                }
            }
            if(min==max)
            {
                ans.add(max);
            }
        }
        return ans;
    }
}