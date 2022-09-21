public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int ans;
        ans=Integer.bitCount(n);
        return ans;
    }
}