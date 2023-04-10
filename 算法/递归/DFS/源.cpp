#define _CRT_SECURE_NO_WARNINGS
#include<cstring>
#include <cstdio>
#include<iostream>
#include<vector>
#include<algorithm>

using namespace std;


const int N = 16;

int n=0;
int st[N];//来判断当前位置的状态，用0表示还没考虑，1表示选择，2表示不选

void dfs(int u)
{
	if (u > n)
	{
		for (int i = 1; i <= n; i++)
			if (st[i] == 1)
				printf("%d ", i);
		printf("\n");
		return;
		
	}                                                     //  1 2 3 4 5

	st[u] = 2;//不选，每次循环里面里面都执行一次不选，不选之后，在递归里面再进行下面的选，就能够遍历所有的情况
	dfs(u + 1);
	st[0] = 0;//恢复现场，在这道题里面没什么用，但是这个是递归里面必须要注意到的

	st[u] = 1;//选
	dfs(u + 1);
	st[u] = 0;//恢复现场，在这道题里面没什么用，但是这个是递归里面必须要注意到的
	return;



}



int main()
{
	scanf("%d", &n);
	dfs(1);
	return 0;


}