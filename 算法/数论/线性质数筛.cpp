#include<bits/stdc++.h>
using namespace std;

bool st[100010];//st��������жϵ�ǰ�±��������û�б�ɸѡ���������true���Ǳ�ɸѡ���ˣ����Ǻ����� 
int primes[100010],cnt; //cnt������ס���˶��ٸ����� 
int N;
 
//void get_primes(int N){
//	for(int i=2;i<=N;i++)//i�ǵ�ǰ��ɸ���� ���������ɸѡ����ʱ�临�ӶȾ���N����Ϊÿ����ֻ��һ��
//	 
//	{
//	 	if(!st[i])primes[cnt++]=i;//�жϵ�ǰi������ǲ�������������Ǿͼӵ�prime�������档 
//	 	
//	 	for(int j=0;primes[i]*j<=N;j++)
//		 {
//		 	st[j*primes[i]]=true;//�����ı���һ���Ǻ�������ʼɸѡ�� 
//		 	if(i%primes[j]==0)break;//Ϊ���ж�i�Ǻ������õ��������������С��������������֤�˺���� 
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
