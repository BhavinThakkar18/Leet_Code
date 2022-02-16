#include <iostream>
using namespace std;

int gon(int n,int a,int b,int c)
{
    if(n==1) return a;
    if(n==2) return b;
    if(n==3) return c;
    int ans=gon(n-1,a,b,c)+gon(n-2,a,b,c)+gon(n-3,a,b,c);
    return ans;
}
int main() {
	//code
	int t;
	cin>>t;
	while(t--)
	{
	    int n,a,b,c;
	    cin>>a>>b>>c>>n;
	    cout<<gon(n,a,b,c)<<endl;
	}
	return 0;
}