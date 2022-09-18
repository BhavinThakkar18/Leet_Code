class Solution {
    public int ans=1;
    public int numberOfMatches(int n) {
        int ans=0;
        while(n!=1){
            ans+=(n/2);
            n= (n%2!=0) ? ((n-1)/2)+1 : n/2;
            
        }
        return ans;
    }
}