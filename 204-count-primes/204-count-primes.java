class Solution {
    public int countPrimes(int n) {
        boolean[] isPrime=new boolean[n+1];
        int ans=0;
        isPrime[0] = false;
        //isPrime[1] = false;
        Arrays.fill(isPrime,true);
        for(int i=2; i * i <= n;i++)
        {
            for(int j=(2*i);j <= n;j+=i)
            {
                isPrime[j]=false;
            }
        }
        for(int i=2;i<n;i++)
        {
            if(isPrime[i]==true)
            {
                ans++;
            }
        }
        return ans;
    }
}