// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String str = br.readLine().trim();
            Solution obj = new Solution();
            long ans = obj.findRank(str);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public long findRank(String S)
    {
        long  n=S.length();
        long[] arr=new long[(int)n];
        long[] fact=new long[(int)n+1];
        long ans=0;
        fact[0]=1;
        for(int i=1;i<=n;i++)
        {
            fact[i]=fact[i-1]*i;
        }
        Arrays.fill(arr,0);
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(S.charAt(i)-'a'>S.charAt(j)-'a')
                {
                    arr[i]+=1;
                }
            }
            
        }
        for(int i=0;i<n;i++)
        {
            ans+=arr[i]*fact[(int)n-1-i];
        }
        return ans+1;
    }
}