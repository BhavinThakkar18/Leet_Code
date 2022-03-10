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
            int N = Integer.parseInt(read.readLine());
            String S = read.readLine();

            Solution ob = new Solution();
            System.out.println(ob.sevenSegments(S,N));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    static String sevenSegments(String S, int N) {
       int[] symbol = new int[]{6,2,5,5,4,5,6,3,7,5};
       int sum=0;
       int i=0;
       int j=0;
       for(i=0;i<N;i++)
       {
           int temp=S.charAt(i)-'0';
           sum+=symbol[temp];
       }
       int[] a = new int[N];
       for(i=0;i<N;i++)
       {
           a[i]=2;
           sum-=2;
       }
       i=0;
       while(sum>=4 && i<N)
       {
           a[i]=6;
           sum-=4;
           i++;
       }
       j=N-1;
       while(sum>0 && j>=0)
       {
           int req = 7 - a[j];
           a[j]+=Math.min(req,sum);
           sum-=Math.min(req,sum);
           j--;
       }
       String ans="";
       for(i=0;i<N;i++)
       {
           if(a[i]==6)
           {
               ans+="0";
           }
           else if(a[i]==2)
           {
               ans+="1";
           }
           else if(a[i]==5)
           {
               ans+="2";
           }
           else if(a[i]==3)
           {
               ans+="7";
           }
           else if(a[i]==4)
           {
               ans+="4";
           }
           else 
           {
               ans+="8";
           }
       }
       return ans;
    }
};