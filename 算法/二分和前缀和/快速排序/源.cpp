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
//
//
//
//
//void quick_sort(int input[],int l,int r)
//{
//	if (l >= r)
//	{
//		return;
//	}
//		//�������ж������Ƿ�ֻ��һ��Ԫ�أ����ֻ��һ��Ԫ�أ���û������ı�Ҫ
//	
//	int x = input[l];//���ȡһ����
//
//	int l1 = l - 1, r1 = r + 1;
//	
//	while (l1 < r1)
//	{
//		do
//		{
//			l1++;
//		} while (input[l1] < x);
//		
//		do
//		{
//			r1--;
//		} while (input[r1] > x);
//		
//		if (l1 < r1)swap(input[r1], input[l1]);
//
//	
//	}
//	quick_sort(input, l, r1);  //����ı߽�����һ��Ҫ���������Ȼ�ǳ�������ѭ����
//	quick_sort(input, r1+1, r);
//	return;
//
//
//
//}
//
//
//int main()
//{
//
//	int n = 0;
//	scanf("%d", &n);
//
//	int* input = (int*)malloc(sizeof(int)*n);
//
//
//	for (int cy1 = 0; cy1 < n; cy1++)scanf("%d", &input[cy1]);
//
//	quick_sort(input, 0, n-1);
//
//	for (int cy1 = 0; cy1 < n; cy1++)
//	{
//		printf("%d ", input[cy1]);
//	}
//
//
//	return 0;
//
//}


void quick_sort(int q[], int l, int r)
{
    if (l >= r) return;

    int l1 = l - 1, r1 = r + 1;
    int x = q[r1];
    while (l1 < r1)
    {
        do l1++; while (q[l1] < x);
        do r1--; while (q[r1] > x);
        if (l1 < r1) swap(q[l1], q[r1]);
    }
    quick_sort(q, l, l1-1);
    quick_sort(q, l1, r);
}


