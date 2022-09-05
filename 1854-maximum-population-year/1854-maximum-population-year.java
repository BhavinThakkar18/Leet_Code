class Solution {
    public int maximumPopulation(int[][] logs) {
        int[] population = new int[101];
        int max=Integer.MIN_VALUE;
        int ans=Integer.MIN_VALUE;;
        for(int i=0;i<logs.length;i++)
        {
            int x=logs[i][0]-1950;
            int y=logs[i][1]-1950;
            for(int j=x;j<y;j++)
            {
                population[j]+=1;
            }
        }
        for(int i=0;i<101;i++)
        {
            //System.out.print(population[i]+" ");
            if(population[i]>max)
            {
                max=population[i];
                ans=i+1950;
            }
        }
        return ans;
    }
}