// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int t = Integer.parseInt(sc.next());
        while(t>0)
        {
            int n = Integer.parseInt(sc.next());
            Solution T = new Solution();
            List<String> ans = T.AllParenthesis(n);
            String[] sequences = ans.toArray(new String[0]);
            Arrays.sort(sequences);
            int k = sequences.length;
            for(int i=0;i<k;i++)
            {
                System.out.println(sequences[i]);
            }
            
            t--;
            
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    
    public List<String> AllParenthesis(int n) 
    {
        ArrayList<String> output_arr = new ArrayList<>();
        backtrack(output_arr,"",0,0,n);
        return output_arr;
    }
    public void backtrack(ArrayList<String> output_arr,String current_string,int open,int close,int max)
    {
        if(current_string.length() == max*2)
        {
            output_arr.add(current_string);
            return;
        }
        if(open<max) backtrack(output_arr,current_string+"(",open+1,close,max);
        if(close<open) backtrack(output_arr,current_string+")",open,close+1,max);
    }
}