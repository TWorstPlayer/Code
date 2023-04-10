#define _CRT_SECURE_NO_WARNINGS
#include<cstring>
#include <cstdio>
#include<iostream>
#include<vector>
#include<algorithm>

using namespace std;
int N;
const int n = 100001;
int K;

int arr[n];
int Hi, Wi;


int max1 = 0;
int main()
{
	scanf("%d %d", &N, &K);

	for (int i = 0; i < N; i++)
	{
		scanf("%d %d", &Hi, &Wi);

		for (int i1 = 0; i1 < N; i1++)
		{

			for (int j = 1; j < n; j++)
			{

				arr[i1] += (Hi / j) * (Wi / j);
			}

		}
	}

	int i = 0;
	while (1)
	{


		if (arr[i] = K)
		{
			max1 = arr[i];
			break;
		}
		if (arr[i] < K)
		{
			max1 = arr[i - 1];
			break;
		}
		i++;
	}

	printf("%d", max1);

}