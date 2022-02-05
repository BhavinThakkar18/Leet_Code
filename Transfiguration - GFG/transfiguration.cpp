// { Driver Code Starts
#include<bits/stdc++.h>
using namespace std;

 // } Driver Code Ends
class Solution{
    
    public:
    int transfigure (string A, string B)
    {
    	// Your code goes here
    	int sum=0;
    	for(int i=0;i<A.length();i++)
    	{
    	    sum+=A[i];
    	    sum-=B[i];
    	}
    	if(sum!=0) return -1;
        int count;
        int i=A.length()-1;
        int j=B.length()-1;
        while(i>=0 && j>=0)
        {
            if(A[i]!=B[j])
            {
                count++;
                i--;
            }
            else
            {
                i--;
                j--;
            }
        }
        return count;
    }
};

// { Driver Code Starts.


int main () 
{
    int t; cin >> t;
    while (t--)
    {
        string A, B; 
        cin >> A >> B;
        Solution obj;
        cout << obj.transfigure (A, B) << endl;
    }
}  // } Driver Code Ends