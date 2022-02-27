// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
import java.lang.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();
            Solution ob = new Solution();
            int ans = ob.smallestSubstring(S);

            System.out.println(ans);
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solution {
    public int smallestSubstring(String S) {
    int len=S.length();
       int z=-1, o=-1, t=-1;
       int ans=Integer.MAX_VALUE;
       for(int i=0; i<len; i++){
           if(S.charAt(i)=='0')
               z=i;
           else if(S.charAt(i)=='1')
               o=i;
           else
               t=i;
               
           if(z==-1 || o==-1 || t==-1)
               continue;
               
           else{
               int temp=i-Math.min(z,Math.min(o, t));
               ans=Math.min(ans, temp+1);
           }
       }
       if(ans==Integer.MAX_VALUE)
           return -1;
           
       else
           return ans;
   }
};
