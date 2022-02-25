// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;


 // } Driver Code Ends
//User function Template for Java

class Solution{
    public static String moveRobots(String s1, String s2){
    int i=0,j=0;
    int n= s1.length();
    
    while(i<n && j<n)
    {
        if(s1.charAt(i)=='#')
        {
            i++;
        }
        else if(s2.charAt(j)=='#')
        {
            j++;
        }
        else if(s1.charAt(i)!=s2.charAt(j))
        {
            return "No";
        }
        else if(s1.charAt(i)=='B' && i>j)
        {
            return "No";
        }
        else if(s1.charAt(i)=='A' && i<j)
        {
            return "No";
        }
        else
        {
            i++;
            j++;
        }
    }
    return "Yes";
    }
}


// { Driver Code Starts.

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String s1=read.readLine();
            String s2=read.readLine();

            Solution ob = new Solution();
            System.out.println(ob.moveRobots(s1, s2));
        }
    }
}  // } Driver Code Ends