// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            
            Solution ob = new Solution();
            System.out.println(ob.superPrimes(n));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    int superPrimes(int n) {
        boolean[] prime = new boolean[n+1];
        Arrays.fill(prime,true);
        for(int p=2;p*p<=n;p++)
        {
            if(prime[p])
            {
                for(int i=p*p;i<=n;i+=p)
                {
                    prime[i]=false;
                }
            }
        }
        int ans=0;
        for(int i=5;i<=n;i++)
        {
            if(prime[i] && prime[i-2])
            {
                ans++;
            }
        }
        return ans;
    }
    
}