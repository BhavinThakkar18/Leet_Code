// { Driver Code Starts
// Initial Template for C++
#include <bits/stdc++.h>
using namespace std;

 // } Driver Code Ends
// User function Template for C++

class Solution{
public:
    int minTime(int S1, int S2, int N){
    int maxcount=INT_MAX;
       if(S1*N<=S2*N){
           maxcount=min(S1*N,maxcount);
       }
       else{
           maxcount=min(S2*N,maxcount);
       }
       for(int i=0;i<=N;i++){
           int count=max(S1*i,S2*(N-i));
           if(maxcount>count){
               maxcount=count;
           }
       }
       return maxcount;
    }
};

// { Driver Code Starts.

int main(){
    int t;
    cin>>t;
    while(t--){
        int S1, S2, N;
        cin>>S1>>S2>>N;
        
        Solution ob;
        cout<<ob.minTime(S1, S2, N)<<"\n";
    }
    return 0;
}  // } Driver Code Ends