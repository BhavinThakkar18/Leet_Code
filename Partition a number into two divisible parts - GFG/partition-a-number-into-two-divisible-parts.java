// { Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String str[] = read.readLine().split(" ");
            String S= str[0];
            int a = Integer.parseInt(str[1]);
            int b = Integer.parseInt(str[2]);
            Solution ob = new Solution();
            System.out.println(ob.stringPartition(S,a,b));
        }
    }
}// } Driver Code Ends


//User function Template for Java
class Solution{
    static String stringPartition(String S, int a, int b){
        String a1,b1;
        a1="";
        b1="";
        int f=0;
        for(int i=0;i<S.length();i++)
        {
            a1+=S.charAt(i);
            if(Integer.parseInt(a1)%a==0)
            {
                if(i+1<S.length())
                {
                    b1=S.substring(i+1,S.length());
                    if(Integer.parseInt(b1)%b==0)
                    {
                        f=1;
                        break;
                    }
                }
            }
        }
        if(f==0)
        {
            return "-1";
        }
        return a1+" "+b1;
    }
}