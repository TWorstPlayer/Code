#include<bits/stdc++.h>
using namespace std;

int  N;
int main()
{
	
	cin>>N;
	int arr[N];
	
	for(int i=1;i<=N;i++)cin>>arr[i];
	sort(arr+1,arr+N+1);
	int min=0;
	if(N%2==0)
	{
		for(int i=1;i<=N/2;i++)
		{
			min+=arr[N-i+1]-arr[i];
		}
	}
	else{
		
		for(int i=1;i<=N/2;i++)min+=arr[N-i+1]-arr[i];
	}
	cout<<min; 
	
}
