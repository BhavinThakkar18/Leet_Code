class Solution {
    public int maximumWealth(int[][] accounts) {
        int max_income=0;
        for(int i=0;i<accounts.length;i++)
        {
            int income=0;
            for(int j=0;j<accounts[0].length;j++)
            {
                income+=accounts[i][j];
            }
            max_income=Math.max(income,max_income);
        }
        return max_income;
    }
}