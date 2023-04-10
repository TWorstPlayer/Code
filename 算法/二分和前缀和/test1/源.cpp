#define _CRT_SECURE_NO_WARNINGS
#include<cstring>
#include <cstdio>
#include<iostream>
#include<vector>
#include<algorithm>

using namespace std;

int lowbit(int x)//-x=(~x+1) 也就是x的每一位二进制数先取反，然后再加上 1
{
	return x & -x;//-x就是x的补码
}
int main()
{
	printf("%d ", 1+lowbit(1));
	printf("%d ", lowbit(6));
}