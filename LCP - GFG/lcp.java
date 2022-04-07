// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
import java.math.*;

class GFG
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.next());
        
        while(t-- > 0)
        {
            int n = Integer.parseInt(sc.next());
            
            String s[] = new String[n];
            for(int i=0;i<n;i++)
            {
                s[i] = sc.next();
            }
            Solution T = new Solution();
            System.out.println(T.lcp(s,n));
        }
        
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public String lcp(String s[],int n)
    {
       String str=s[0];
       for(int i=1;i<s.length;i++){
           while(s[i].indexOf(str)!=0){
               str=str.substring(0,str.length()-1);
           }
       }
       if(str.isEmpty()){
           return "-1";
       }
       return str;
        
        
    }
}
