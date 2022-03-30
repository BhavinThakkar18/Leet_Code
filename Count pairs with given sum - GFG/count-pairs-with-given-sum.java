// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

public class GFG {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int k = Integer.parseInt(inputLine[1]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            int ans = new Solution().getPairsCount(arr, n, k);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int getPairsCount(int[] arr, int n, int k) {
        int ans=0;
        HashMap<Integer,Integer> nums = new HashMap<Integer,Integer>();
        for(int i=0;i<n;i++)
        {
            if(nums.containsKey(k-arr[i]))
            {
                ans+=nums.get(k-arr[i]);
            }
            if(nums.containsKey(arr[i]))
            {
                nums.put(arr[i],nums.get(arr[i])+1);
            }
            else
            {
                nums.put(arr[i],1);
            }
        }
        return ans;
    }
}
