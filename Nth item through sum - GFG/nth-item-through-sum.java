// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String val[] = in.readLine().trim().split("\\s++");
            int L1 = Integer.parseInt(val[0]);
            int L2 = Integer.parseInt(val[1]);
            String arr[] = in.readLine().trim().split("\\s++");
            int [] A = new int[L1];
            for(int i = 0;i < L1; i++)
                A[i] = Integer.parseInt(arr[i]);
            String arr1[] = in.readLine().trim().split("\\s++");
            int [] B = new int[L2];
            for(int i = 0;i < L2; i++)
                B[i] = Integer.parseInt(arr1[i]);
            int N = Integer.parseInt(in.readLine());
            
            Solution ob = new Solution();
            System.out.println(ob.nthItem(L1, L2, A, B, N));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution{
    static int nthItem(int L1, int L2, int A[], int B[], int N)
    {
        if(N>(L1*L2))
        {
            return -1;
        }
        HashSet<Integer> set = new HashSet<Integer>();
        int k=0;
        for(int i=0;i<L1;i++)
        {
            for(int j=0;j<L2;j++)
            {
                set.add(A[i]+B[j]);
            }
        }
        if(set.size()<N)
        {
            return -1;
        }
        ArrayList<Integer> arr=new ArrayList<Integer>();
        
        for(int i:set)
        {
            arr.add(i);
        }
        Collections.sort(arr);
        return arr.get(N-1);

    }
}