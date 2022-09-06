class Solution {
    public int[] sumZero(int n) {
        int[] ans = new int[n];
        if(n%2==0)
        {
            for(int i=0;i<n;i+=2)
            {
                ans[i]=i+1;
                ans[i+1]=-1*(i+1);
            }
        }
        else
        {
            for(int i=0;i<n-1;i+=2)
            {
                ans[i]=i+1;
                ans[i+1]=-1*(i+1);
            }
            ans[n-1]=0;
        }
        return ans;
    }
}