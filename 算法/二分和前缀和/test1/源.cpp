#define _CRT_SECURE_NO_WARNINGS
#include<cstring>
#include <cstdio>
#include<iostream>
#include<vector>
#include<algorithm>

using namespace std;

int lowbit(int x)//-x=(~x+1) Ҳ����x��ÿһλ����������ȡ����Ȼ���ټ��� 1
{
	return x & -x;//-x����x�Ĳ���
}
int main()
{
	printf("%d ", 1+lowbit(1));
	printf("%d ", lowbit(6));
}