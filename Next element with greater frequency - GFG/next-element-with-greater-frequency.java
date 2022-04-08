// { Driver Code Starts
import java.util.*;
import java.io.*;

class GFG
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        // int arr[] = new int[10000];
        
        int t = sc.nextInt();
        
        while(t-->0)
        {
            int n = sc.nextInt();
            int arr[]=new int[n];
            for(int i=0; i<n; i++)
            {
                arr[i] = sc.nextInt();
            }
            
            solver x = new solver();
            int res[]=x.print_next_greater_freq(arr,n);
            StringBuffer sb=new StringBuffer("");
            for(int i : res){
                sb.append(i+" ");
            }
            System.out.println(sb);
        }
    }
}
// } Driver Code Ends


class solver
{
    static int[] print_next_greater_freq(int arr[], int n)
    {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for(int i=0; i<n; i++){
            freq.put(arr[i],freq.getOrDefault(arr[i], 0) + 1 );
        }
        int [] ans = new int[n];
        for(int i=0; i<n; i++){
            ans[i] = -1;
            for(int j=i+1; j<n; j++){
                if(arr[j]!=arr[i] && freq.get(arr[j]) > freq.get(arr[i])){
                    ans[i] = arr[j];
                    break;
                }
            }
        }
        return ans;
    }
}

