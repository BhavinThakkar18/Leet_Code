class Solution {
    public int candy(int[] ratings) {
        int n=ratings.length;
        int[] candy = new int[ratings.length];
        int curr=1;
        candy[n-1]=1;
        Arrays.fill(candy,1);
        for(int i=n-2;i>=0;i--)
        {
            if(ratings[i]>ratings[i+1])
            {
                candy[i]=candy[i+1]+1;
                
            }
        }
        int ans=0;
        for(int i=0;i<n-1;i++)
        {
            if(ratings[i]<ratings[i+1])
            {
                candy[i+1]=Math.max(candy[i+1],candy[i]+1);
            }
            ans+=candy[i];
        }
        return ans+candy[n-1];
    }
}