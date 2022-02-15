class Solution {
    public int trailingZeroes(int n) {
        int ans=0;
        int p=5;
        while((p/5)>0){
            ans+=(n/p);
            p*=5;
        }
        return ans;
    }
}