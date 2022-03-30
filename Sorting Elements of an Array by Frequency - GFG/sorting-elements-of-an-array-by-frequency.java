// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;
import java.util.Map.Entry;


class Driverclass 
{
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(sc.readLine());
	    while(n != 0)
		{
			int size = Integer.parseInt(sc.readLine());
			int arr[] = new int[size];
			String[] temp = sc.readLine().trim().split("\\s+");
			
			for(int i = 0; i < size; i++)
			    arr[i] = Integer.parseInt(temp[i]);
			    
			 ArrayList<Integer> ans = new ArrayList<Integer>();
			 ans = new Solution().sortByFreq(arr, size);
			 for(int i=0;i<ans.size();i++)
			    System.out.print(ans.get(i)+" ");
		    System.out.println();
			n--;
		}
	}
}

// } Driver Code Ends

//User function Template for Java
class Solution
{
    //Function to sort the array according to frequency of elements.
    static ArrayList<Integer> sortByFreq(int arr[], int n)
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(Integer i : arr)
        {
            list.add(i);
        }
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<list.size();i++)
        {
            map.put(list.get(i),map.getOrDefault(list.get(i),0)+1);
        }
        Collections.sort(list,(n1,n2)->{
            int freq1=map.get(n1);
            int freq2=map.get(n2);
            if(freq1!=freq2)
            {
                return freq2-freq1;
            }
            return n1-n2;
        });
        return list;
    }
}