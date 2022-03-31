// { Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;


class GFG
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        int n;
        while(t-- > 0){
            n = sc.nextInt();
    
            Solution obj = new Solution();
            for(int i = 1; i <= n; i++)
            {
                int x =sc.nextInt();
                obj.insertHeap(x);
                System.out.println((int)Math.floor(obj.getMedian()));
            }
        }
        
        
    }
}

// } Driver Code Ends


class Solution
{
    //Function to insert heap.
    public static PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
    public static PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    public static void insertHeap(int x)
    {

            maxHeap.add(x);
            minHeap.add(maxHeap.peek());
            maxHeap.poll();
            balanceHeaps();
    }
    public static void balanceHeaps()
    {
        if(minHeap.size()>maxHeap.size())
        {
            maxHeap.add(minHeap.peek());
            minHeap.poll();
        }
    }
    //Function to return Median.
    public static double getMedian()
    {
        if(maxHeap.size()==minHeap.size())
        {
            return maxHeap.peek()/2.0 + minHeap.peek()/2.0;
        }
        return maxHeap.peek();
    }
    
}