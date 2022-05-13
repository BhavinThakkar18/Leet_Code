// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
import java.lang.*;

public class GFG {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr1 = new int[n], arr2 = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr1[i] = Integer.parseInt(inputLine[i]);
            }
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr2[i] = Integer.parseInt(inputLine[i]);
            }

            ArrayList<Integer> ans = new Solution().maximizeArray(arr1, arr2, n);
            for (Integer x : ans) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    ArrayList<Integer> maximizeArray(int[] arr1, int[] arr2, int n) {
 Map<Integer,Integer> mp1=new HashMap();
      int arr3[]=new int[2*n];
      int i=0;
      for(int ele:arr2){
          arr3[i++]=ele;
      }
       for(int ele:arr1){
          arr3[i++]=ele;
      }
      Arrays.sort(arr3);
      int start=0,end=arr3.length-1;
      while(start<end){
          int temp=arr3[start];
          arr3[start]=arr3[end];
          arr3[end]=temp;
          start++;end--;
      }
      HashSet<Integer> set=new HashSet<>();
      for(int ele:arr3){
          set.add(ele);
          if(set.size()==n){
              break;
          }
      }
      ArrayList<Integer> list=new ArrayList<>();
      for(int ele:arr2){
          if(set.contains(ele)){
              list.add(ele);
              set.remove(ele);
          }
      }
      for(int ele:arr1){
          if(set.contains(ele)){
              list.add(ele);
              set.remove(ele);
          }
      }
      return list;
    }
}