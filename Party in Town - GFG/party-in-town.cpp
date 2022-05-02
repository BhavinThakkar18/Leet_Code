// { Driver Code Starts
// Initial Template for C++

#include <bits/stdc++.h>
using namespace std;

 // } Driver Code Ends
// User function Template for C++

class Solution{
public:
    int bfs(vector<vector<int>> &adj,int src,int N)
    {
        queue<int>q;
        vector<int>dist(N+1,INT_MAX);
        q.push(src);
        dist[src]=0;
        int ans=0;
        while(q.size())
        {
            int top=q.front();
            q.pop();
            for(auto x:adj[top])
            {
                if(dist[x]==INT_MAX)
                {
                    q.push(x);
                    dist[x]=dist[top]+1;
                    ans=max(ans,dist[x]);
                    
                }
            }
        }
        return ans;
    }
    int partyHouse(int N, vector<vector<int>> &adj){
        // code here
        int ans=INT_MAX;
        for(int i=1;i<=N;i++)
        {
            int temp=bfs(adj,i,N);
            ans=min(temp,ans);
            
        }
        return ans;
    }
};

// { Driver Code Starts.

int main(){
    int t;
    cin>>t;
    while(t--){
        int N, x, y;
        cin>>N;
        vector<vector<int>> adj(N+1);
        for(int i = 0;i < N-1;i++){
            cin>>x>>y;
            adj[x].emplace_back(y);
            adj[y].emplace_back(x);
        }
        
        Solution ob;
        cout<<ob.partyHouse(N, adj)<<"\n";
    }
    return 0;
}  // } Driver Code Ends