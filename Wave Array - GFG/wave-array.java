// { Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		
		while(t-->0)
		{
		    int n = Integer.parseInt(br.readLine().trim());// taking size of array
		    int arr[] = new int[n]; // declaring array of size n
		    String inputLine[] = br.readLine().trim().split(" ");
		    for(int i=0; i<n; i++){
		        arr[i]=Integer.parseInt(inputLine[i]); // input elements of array
		    }
		    
		    Solution obj = new Solution();
		    
		    
		    obj.convertToWave(arr, n);
		    
		    StringBuffer sb = new StringBuffer(); 
            for (int i = 0; i < n; i++) 
                sb.append(arr[i] + " "); 
                
		    System.out.println(sb); // print array
		}
	}
}


 // } Driver Code Ends
class Solution{

    
    public static void convertToWave(int arr[], int n){
    if(n==2)
    {
        int temp=arr[1];
        arr[1]=arr[0];
        arr[0]=temp;
    }
    else
    {
        int i=1;
        int j=0;
        while(i<n)
        {
            int temp=arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
            i+=2;
            j+=2;
        }
    }
    }
}


// { Driver Code Starts.
  // } Driver Code Ends