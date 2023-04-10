#define _CRT_SECURE_NO_WARNINGS
#pragma warning(disable : 6031)
#pragma warning(disable : 4996)
#include <stdlib.h>
#include <time.h>
#include <string.h>
#include <windows.h>
#include <math.h>
#include <stdio.h>
#include<iostream>
using namespace std;

const int N = 1000010;
int n;
int temp[N];
int p[N];

void merge_sort(int p[], int l, int r)
{
	if (l >= r)
	{
		return;
	}
	int mid = (l + r) / 2;
	merge_sort(p, l, mid);
	merge_sort(p, mid+1, r);
	int i = l;
	int j = mid + 1;
	int k = 0;
	while (i<=mid&&j<=r)
	{
		if (p[i] < p[j])temp[k++] = p[i++];
		else temp[k++] = p[j++];
	}
	while (i <= mid)temp[k++] = p[i++];
	while (j <= r)temp[k++] = p[j++];
	
	for (i=l,j=0;i<=r; i++,j++)p[i] = temp[j];

}

int main()
{
	scanf("%d" ,&n);
	for (int cy1 = 0; cy1 <n; cy1++)scanf("%d",&p[cy1]);

	merge_sort(p, 0, n-1);

	for (int cy1 = 0; cy1 <n; cy1++)printf("%d ", p[cy1]);

}