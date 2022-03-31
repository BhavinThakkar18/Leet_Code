// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
import java.lang.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String arr[] = in.readLine().trim().split("\\s+");
            int S1 = Integer.parseInt(arr[0]);
            int S2 = Integer.parseInt(arr[1]);
            int N = Integer.parseInt(arr[2]);
            
            Solution ob = new Solution();
            System.out.println(ob.minTime(S1, S2, N));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution{
    static int minTime(int S1, int S2, int N)
    {
        int maxCount = Integer.MAX_VALUE;
        int count=0;
        if(S1*N<=S2*N)
        {
            maxCount = Integer.min(S1*N,maxCount);
        }
        else
        {
            maxCount = Integer.min(S2*N,maxCount);
        }
        for(int i=0;i<=N;i++)
        {
            count = Integer.max(S1*i,S2*(N-i));
            if(maxCount>count)
            {
                maxCount=count;
            }
        }
        return maxCount;
    }
}