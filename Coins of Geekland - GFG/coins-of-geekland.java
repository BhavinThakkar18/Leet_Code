// { Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(sc.next());
		while(t-- > 0)
		{
		    int n = Integer.parseInt(sc.next());
		    int a[][] = new int[n][n];
		    
		    for(int i=0;i<n;i++)
		    {
		        for(int j=0;j<n;j++)
		        {
		            a[i][j] = Integer.parseInt(sc.next());
		        }
		    }
		    
		    int k = Integer.parseInt(sc.next());
		    Solution T = new Solution();
		    System.out.println(T.Maximum_Sum(a,n,k));
		}
	}
}// } Driver Code Ends


class Solution
{
    public int Maximum_Sum(int mat[][],int N,int K){
        // Your code goes here
        int sum=0;
        int ans=0;
        for(int i=0;i<N-K+1;i++)
        {
            for(int j=0;j<N-K+1;j++)
            {
                int rowSum=0;
                int columSum=0;
                sum=0;
                for(int k=i;k<i+K;k++)
                {
                    for(int l=j;l<j+K;l++)
                    {
                        //System.out.print(" "+mat[k][l]);
                        sum+=mat[k][l];
                    }
                    ans=Integer.max(ans,sum);
                    //System.out.println(ans);
                    //System.out.println();
                }
                //System.out.println();
            }
            
        }
        return ans;
    }
}
