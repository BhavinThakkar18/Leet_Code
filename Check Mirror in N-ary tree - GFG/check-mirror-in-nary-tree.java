// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S[] = read.readLine().split(" ");
            
            int n = Integer.parseInt(S[0]);
            int e = Integer.parseInt(S[1]);
            
            String S1[] = read.readLine().split(" ");
            String S2[] = read.readLine().split(" ");
            
            int[] A = new int[2*e];
            int[] B = new int[2*e];
            
            for(int i=0; i<2*e; i++)
            {
                A[i] = Integer.parseInt(S1[i]);
                B[i] = Integer.parseInt(S2[i]);
            }

            Solution ob = new Solution();
            System.out.println(ob.checkMirrorTree(n,e,A,B));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    static int checkMirrorTree(int n, int e, int[] A, int[] B) {
        List<Stack<Integer>> s = new ArrayList<>();
        List<Queue<Integer>> q = new ArrayList<>();
 
        // initializing both list with empty stack and queue
        for (int i = 0; i <= n; i++) {
            s.add(new Stack<>());
            Queue<Integer> queue = new LinkedList<>();
            q.add(queue);
        }
 
           // add all nodes of tree 1 to list of stack and tree 2 to list of queue
        for (int i = 0; i < 2 * e; i += 2) {
            s.get(A[i]).push(A[i + 1]);
            q.get(B[i]).add(B[i + 1]);
        }
 
          // now take out the stack and queues
        // for each of the nodes and compare them
        // one by one
        for (int i = 1; i <= n; i++) {
            while (!s.get(i).isEmpty() && !q.get(i).isEmpty()) {
                int a = s.get(i).pop();
                int b = q.get(i).poll();
 
                if (a != b) {
                    return 0;
                }
            }
        }
        return 1;
    }
};