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
		//����input��
		while (l < r)
		{
			int mid = (l + r) / 2;
			if (q[mid] >= input)r = mid;
			else l = mid + 1;

		}
		r = n - 1;//��r��λ
		int l1 = l;//
		while (l < r)
		{
			int mid = (l + r + 1) / 2;
			//������Ҫ��1��ԭ���ǿ��ǵ�һ���߽����⣬��ֹ������ѭ��
			//�����������1��ֻ�������������飨0��2����input=2��һ��ʼmid=0��q[mid]=0<=2,����l=mid����l=0��mid����0�ˣ��ͻ�һֱ����ѭ�������´���
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
