class Solution {
    public int fib(int n) {
        if(n<2)
        {
            return n;
        }
        int[] f = new int[n+1];
        f[0]=0;
        f[1]=1;

        for(int i=2;i<n+1;i++)
        {
            f[i]=f[i-1]+f[i-2];
        }
        return f[n];
    }
}