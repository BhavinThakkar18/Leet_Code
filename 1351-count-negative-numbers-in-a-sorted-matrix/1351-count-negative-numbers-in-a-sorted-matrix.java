class Solution {
    public int countNegatives(int[][] grid) {
        int ans=0;
        for(int i=grid.length-1;i>=0;i--)
        {
            for(int j=grid[0].length-1;j>=0;j--)
            {
                if(grid[i][j]>=0)
                {
                    break;
                }
                else
                {
                    ans++;
                }
            }
        }
        return ans;
    }
}