// { Driver Code Starts
#include <bits/stdc++.h>
using namespace std;


 // } Driver Code Ends
//User function Template for C++

class Solution {
  public:
    int minSteps(int A[], int N, int K) {
        sort(A,A+N);
        int ans=INT_MAX;
        int prev=0;
        vector<int> p(N,0);
        p[0]=A[0];
        for(int i=1;i<N;i++)
        {
            p[i]=p[i-1]+A[i];
        }
        for(int i=0;i<N;i++)
        {
            int index=upper_bound(A+i,A+N,A[i]+K)-A;
            if(i>0 && A[i]!=A[i-1])
            {
                prev=p[i-1];
            }
            ans=min(ans,prev+p[N-1]-p[index-1]-(N-index)*(A[i]+K));
        }
        return ans;
    }
};


// { Driver Code Starts.

int main() {
    int t;
    cin >> t;
    while (t--) {
        int N, K;
        cin>>N>>K;
        
        int A[N];
        for(int i=0; i<N; i++)
            cin>>A[i];

        Solution ob;
        cout << ob.minSteps(A,N,K) << endl;
    }
    return 0;
}  // } Driver Code Ends