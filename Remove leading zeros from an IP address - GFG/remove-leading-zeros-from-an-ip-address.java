// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

public class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String s = sc.next();
                    Solution ob = new Solution();
                    System.out.println(ob.newIPAdd(s));
                }
        }
}// } Driver Code Ends


//User function Template for Java

class Solution
{
    public String newIPAdd(String S)
    {
        String outputString="";
        String[] words = S.split("\\.");
        for (int i = 0; i < words.length;i++)
        {
            int zeros=0;
            int nonzeros=0;
            String word=words[i];
            for(int j=0;j<words[i].length();j++)
            {
                char temp=word.charAt(j);
                if(temp!='0')
                {
                   nonzeros+=1;
                }
                else
                {
                    zeros+=1;
                }
                if(nonzeros > 0)
                {
                    outputString+=(word.charAt(j));
                }
                if(nonzeros==0 && zeros==words[i].length())
                {
                    outputString+='0';
                }
            }
            if(i!=words.length-1)
            {
                outputString+=(".");
            }
        }
        return outputString;
    }
}