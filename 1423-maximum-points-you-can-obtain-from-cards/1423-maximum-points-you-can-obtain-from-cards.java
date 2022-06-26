class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int l=0;
        int r=cardPoints.length-k;
        int total=0;
    
        for(int i=r;i<cardPoints.length;i++)
        {
            total+=cardPoints[i];
        }
        int ans=total;
        while(r<cardPoints.length)
        {
            total+=(cardPoints[l]-cardPoints[r]);
            ans=Math.max(ans,total);
            l+=1;
            r+=1;
        }
        return ans;
    }
}
