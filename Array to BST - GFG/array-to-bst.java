// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int[] nums = new int[n];
            String[] S = br.readLine().trim().split(" ");
            for(int i = 0; i < n; i++){
                nums[i] = Integer.parseInt(S[i]);
            }
            Solution obj = new Solution();
            int[] ans = obj.sortedArrayToBST(nums);
            for(int i = 0; i < ans.length; i++)
                System.out.print(ans[i] + " ");
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    
    public int[] sortedArrayToBST(int[] nums)
    {
     List<Integer> ls=new ArrayList<>();
     getBST(ls,nums,0,nums.length-1);
     return ls.stream().mapToInt(i->i).toArray();
    }
    public void getBST(List<Integer> ls,int[]nums,int left,int right){
        if(right<left) return;
        int mid=left+(right-left)/2;
        ls.add(nums[mid]);
        getBST(ls,nums,left,mid-1);
        getBST(ls,nums,mid+1,right);
    }
}