class Solution {
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        Arrays.sort(horizontalCuts);
        Arrays.sort(verticalCuts);
        long mod = (long)1e9+7;
        long H=0,W=0;
        int prev =0;
        H=Math.max(H,h-horizontalCuts[horizontalCuts.length-1]);
        W=Math.max(W,w-verticalCuts[verticalCuts.length-1]);
        for(int i:horizontalCuts)
        {
            H = Math.max(H,i-prev);
            prev = i;
        }
        prev = 0;
        for(int i:verticalCuts){
            W = Math.max(W,i-prev);
            prev = i;
        }
        return (int)((H*W)%mod);
    }
}