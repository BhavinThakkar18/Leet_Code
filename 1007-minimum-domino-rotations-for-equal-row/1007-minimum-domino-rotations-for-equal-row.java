class Solution {
    public int minDominoRotations(int[] tops, int[] bottoms) {
        int ans=Integer.MAX_VALUE;
        int n = tops.length;
        for(int i=1;i<=6;i++)
        {
            int total=0;
            int cnts1=0;
            int cnts2=0;
            for(int j=0;j<n;j++)
            {
                if(tops[j]==i || bottoms[j]==i)
                {
                    total++;
                    if(tops[j]!=i)
                    {
                        cnts1++;
                    }
                    if(bottoms[j]!=i)
                    {
                        cnts2++;
                    }
                }
            }
            if(total==n)
            {
                ans=Math.min(cnts1,cnts2);
            }
        }
        return ans==Integer.MAX_VALUE?-1:ans;
    }
}