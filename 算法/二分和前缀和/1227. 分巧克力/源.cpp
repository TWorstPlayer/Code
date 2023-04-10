#define _CRT_SECURE_NO_WARNINGS
#include<cstring>
#include <cstdio>
#include<iostream>
#include<vector>
#include<algorithm>

using namespace std;
int N;
const int n = 1000001;
int K;

struct cho {
	int Hi;
	int Wi;

};

struct cho cho1[n];

int max1 = 0;;
int main()
{
	scanf("%d %d", &N, &K);
	

	for (int i = 0; i < N; i++)
	{
		scanf("%d %d", &cho1[i].Hi, &cho1[i].Wi);
	}

	
	int num = 0;
	do
	{
		max1++;
		num = 0;
		for (int i = 0; i < n; i++)
		{
			num += (cho1[i].Hi /max1) * (cho1[i].Wi / max1);
		}
		if (num <= K)
		{
			break;
		}
		
	} while (1);

		printf("%d", max1-1);

}