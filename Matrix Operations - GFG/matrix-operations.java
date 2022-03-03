// { Driver Code Starts
//Initial Template for Java

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
            String str[] = read.readLine().trim().split("\\s+");
            int r = Integer.parseInt(str[0]);
            int c = Integer.parseInt(str[1]);
            int matrix[][] = new int[r][c];
            
            for(int i = 0; i < r; i++)
            {
                int k = 0;
                str = read.readLine().trim().split("\\s+");
                for(int j = 0; j < c; j++){
                  matrix[i][j] = Integer.parseInt(str[k]);
                  k++;
                }
            }
            Solution obj = new Solution();
            int[] p = obj.endPoints(matrix,r,c);
            System.out.print("(" +  p[0]+ ", " +  p[1]+ ")" +"\n");
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    static int [] endPoints(int [][]arr, int m, int n){
        
        int direction = 0;
        int i=0,j=0;
        while(i<m && j<n && i>=0 && j>=0){
            if(arr[i][j]==1){
                arr[i][j]=0;
                direction++;
            }
            
            if(direction%4==0){
                if(j+1>=n) return new int[]{i,j};
                j++;
            }else if(direction%4==1){
                if(i+1>=m) return new int[]{i,j};
                i++;
            }else if(direction%4==2){
                if(j-1<0) return new int[]{i,j};
                j--;
            }else{
                if(i-1<0) return new int[]{i,j};
                i--;
            }
        }
        return new int[]{i,j};
    }
}