class Solution {
    public String getSmallestString(int n, int k) {
        char[] ans=new char[n];
        Arrays.fill(ans,'a');
        while(k>n)
        {
            int leftout=k-(n-1);
            if(leftout>=26)
            {
                ans[--n]='z';
                k-=26;
            }
            else
            {
                char ch = (char)('a'+leftout-1);
                ans[--n]=ch;
                k=n-1;
            }
        }
        return String.valueOf(ans);
        
    }
}