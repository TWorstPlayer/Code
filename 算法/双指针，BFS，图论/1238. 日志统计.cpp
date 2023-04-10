#include<bits/stdc++.h>
#define x first
#define y second
using namespace std;
 
int N,D,K;
const int max1=100001;
typedef  pair<int,int>  PII;
int panduan[max1];
bool panduan1[max1];
PII logs[max1];


int  main(){
	scanf("%d %d %d",&N,&D,&K);
	for(int i=0;i<N;i++)scanf("%d%d",&logs[i].x,&logs[i].y); 
	sort(logs,logs+N);
	
	for(int right=0,left =0;right<N;right++)//不能 int right,left=0; 
	{
		
		int id=logs[right].y;
		panduan[id]++;
		
		while(logs[right].x-logs[left].x>=D)
		{
			panduan[logs[left].y]--;
			left++;
			
		}
		
	
		if(panduan[id]>=K)panduan1[id]=true;//直接每一次循环都判断一下就可以了 
		
	}
	
		for(int i=0;i<max1;i++){
			if(panduan1[i]==true)
			{
				printf("%d\n",i);
			}
		}
	
	
	return 0;

 	
} 
