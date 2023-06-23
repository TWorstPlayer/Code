#define _CRT_SECURE_NO_WARNINGS
#include <stdlib.h>
#include <time.h>
#include <string.h>
#include <math.h>
#include <stdio.h>
#include<iostream>
using namespace std;

const int N = 100010;
int n, m;
int q[N];
int main()
{
	scanf("%d %d", &n, &m);
	for (int i = 0; i < n; i++)scanf("%d", &q[i]);
	while (m--)
	{
		int input=0;
		scanf("%d", &input);
		int l = 0, r = n - 1;
		//二分input的
		while (l < r)
		{
			int mid = (l + r) / 2;
			if (q[mid] >= input)r = mid;
			else l = mid + 1;

		}
		r = n - 1;//把r复位
		int l1 = l;//
		while (l < r)
		{
			int mid = (l + r + 1) / 2;
			//这里需要加1的原因是考虑到一个边界问题，防止进入死循环
			//例如如果不加1，只有两个数的数组（0，2），input=2，一开始mid=0，q[mid]=0<=2,所以l=mid，而l=0，mid又是0了，就会一直在死循环，导致错误。
			if (q[mid] <= input)l = mid;
			else r = mid - 1;
		}
		if (q[l] != input)
		{
			printf("-1 -1\n");
		}
		else
		{
			printf("%d %d", l1,r);
			printf("\n");
		}
	}
}
