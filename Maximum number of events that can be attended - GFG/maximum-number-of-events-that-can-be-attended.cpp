// { Driver Code Starts
#include <bits/stdc++.h>
using namespace std;


 // } Driver Code Ends
//User function Template for C++

class Solution {
  public:
    int maxEvents(int start[], int end[], int N) {
        vector<pair<int,int>> vp(N);
        for(int i=0;i<N;i++)
        {
            vp[i].first=start[i];
            vp[i].second=end[i];
        }
        sort(vp.begin(),vp.end());
        priority_queue<int,vector<int>,greater<int>> pq;
        int i=0,day=0,ans=0;
        while(pq.size() > 0 || i<N)
        {
            if(pq.size()==0) day = vp[i].first;
            while(i<N && vp[i].first<=day)
            {
                pq.push(vp[i].second);
                i++;
            }
            day++;
            ans++;
            pq.pop();
            while(pq.size()>0 && pq.top() <day)
            {
                pq.pop();
            }
        }
         return ans;
    }
   
};

// { Driver Code Starts.

int main() {
    int t;
    cin >> t;
    while (t--) {
        int N;
        cin>>N;
        
        int start[N], end[N];
        for(int i=0; i<N; i++)
            cin>>start[i];
        for(int i=0; i<N; i++)
            cin>>end[i];

        Solution ob;
        cout << ob.maxEvents(start,end,N) << endl;
    }
    return 0;
}  // } Driver Code Ends