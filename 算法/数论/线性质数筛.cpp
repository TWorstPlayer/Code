#include<bits/stdc++.h>
using namespace std;

bool st[100010];//st这个数组判断当前下标这个数有没有被筛选过，如果是true就是被筛选过了，就是合数。 
int primes[100010],cnt; //cnt用来记住存了多少个质数 
int N;
 
//void get_primes(int N){
//	for(int i=2;i<=N;i++)//i是当前所筛的数 ，所以这个筛选法的时间复杂度就是N，因为每个数只会一次
//	 
//	{
//	 	if(!st[i])primes[cnt++]=i;//判断当前i这个数是不是质数，如果是就加到prime数组里面。 
//	 	
//	 	for(int j=0;primes[i]*j<=N;j++)
//		 {
//		 	st[j*primes[i]]=true;//质数的倍数一定是合数，开始筛选。 
//		 	if(i%primes[j]==0)break;//为了判断i是合数所用的是这个合数的最小质因数，这样保证了后面的 
//		  } 
//		
//	 } 
//	
//	
//	
//}


void get_primes(int N)
{
	for(int i=2;i<=N;i++)
	{
		if(!st[i])primes[cnt++]=i;
		for(int j=0;j*primes[i]<N;j++)
		{
			st[primes[j]*i]=true;
			if(i%primes[j]==0)break;
		}
	}
	
 } 


int main()
{
	int N=0;
	scanf("%d",&N);
	
	get_primes(N);
	
	for(int i=0;i<cnt;i++){
			printf("%d ",primes[i]);
		
	}
	
	 
 } 
