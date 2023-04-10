#define _CRT_SECURE_NO_WARNINGS
#include<cstring>
#include <cstdio>
#include<iostream>
#include<vector>
#include<algorithm>

using namespace std;

const int N = 100001;
int n,m = 0;


int main()
{

	scanf("%d %d", &n, &m);
	int* arr;
	arr = (int *)malloc(sizeof(int) * n);
	
	int arr1[1000][3];
	for (int i = 0; i < n; i++)scanf("%d", &arr[i]);
	for (int i = 0; i < m; i++)
	{
		scanf("%d %d", &arr1[i][0], &arr1[i][1]);
	}
	int arr2[1000] = { 0 };

	for (int i = 0; i < m; i++)
	{
		for (int l = arr1[i][0]-1; l <= arr1[i][1]-1;l++)
		{
			arr2[i] += arr[l];
		}
	}

	for (int i = 0; i < m; i++)
	{
		printf("%d\n", arr2[i]);
	}





}


