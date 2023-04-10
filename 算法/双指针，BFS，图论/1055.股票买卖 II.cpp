#include<bits/stdc++.h>
using namespace std;

int N;
int chu;
int main(){
	cin>>N;
	int arr[N]={0};
	for(int i=0;i<N;i++)
	{
		cin>>arr[i];
	}
	
	for(int i=0;i<N-1;i++)
	{
		if(arr[i]<arr[i+1])
		{
			chu+=arr[i+1]-arr[i];
		}
	}
	
	printf("%d",chu);
	
} 
