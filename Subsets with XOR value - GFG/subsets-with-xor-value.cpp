// { Driver Code Starts

#include<bits/stdc++.h>
using namespace std;

 // } Driver Code Ends

class Solution{
public:
    int subsetXOR(vector<int> arr, int N, int K) {
        vector<vector<int>> dp(N, vector<int>(128, 0));
        dp[0][0] = dp[0][arr[0]] = 1;
        
        for(int i = 1; i < N; i++) {
            dp[i] = dp[i - 1];
            for(int j = 0; j < 128; j++) {
                int cur = j ^ arr[i];
                dp[i][cur] += dp[i - 1][j];
            }
        }
        
        return dp[N - 1][K];
    }
};

// { Driver Code Starts.
int main() 
{ 
    int t;
    cin>>t;
    while(t--)
    {
        int N;
        cin>>N;
        int K;
        cin>>K;
        vector<int> v;
        for(int i = 0;i<N;i++)
        {
            int x;
            cin>>x;
            v.push_back(x);
        }    
        Solution ob;
        cout << ob.subsetXOR(v,N,K) << endl;
    }
    return 0; 
}  // } Driver Code Ends