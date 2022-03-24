// { Driver Code Starts
//Initial template for C++

#include<bits/stdc++.h> 
using namespace std; 

 // } Driver Code Ends
//User function template for C++

class Solution{   
public:
int lcs_DP(string s,string t){
    int m = s.size();
    int n = t.size();
    int **output = new int *[m+1];
    
    for(int i=0;i<=m;i++){
        output[i] = new int[n+1];
    }
    
    //Fill 1st row
    for(int j=0;j<=n;j++){
        output[0][j] = 0;
    }
    
    //Fill 1st column
    for(int i=1;i<=m;i++){
        output[i][0] = 0;
    }
    
    //Reamaining indexes..
    for(int i=1;i<=m;i++){
        for(int j=1;j<=n;j++){
            //check if 1st character are same..
            if(s[m-i]==t[n-j]){
                output[i][j] = 1 + output[i-1][j-1];
            }else{
                int a = output[i-1][j];
                int b = output[i][j-1];
                output[i][j] = max(a,b);
            }
        }
    }
    return output[m][n];
    
}
    int findMinInsertions(string S){
        // code here 
        string p = S;
        int len = S.length();
       int i=0;
       int j=len-1;
       while(i<j){
           char tem = S[i];
           S[i] = S[j];
           S[j] = tem;
           i++;
           j--;
       }
       int lcs_len = lcs_DP(p,S);
       int result = (len - lcs_len);
       return result;
    }
};
// { Driver Code Starts.



int main(){
    int t;
    cin>>t;
    while(t--){
        string S;
        cin>>S;
        Solution ob;
        cout<<ob.findMinInsertions(S)<<endl;
    }
    return 0;
}
  // } Driver Code Ends