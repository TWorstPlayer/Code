#define _CRT_SECURE_NO_WARNINGS
#include<cstring>
#include <cstdio> 
#include<iostream>
#include<vector>
#include<algorithm>

using namespace std;

const int N = 10;
int input[N];
bool bol[N];//0表示还没用，1表示用了//全部变量定义的时候会自动每个都为0
int n;

void dfs(int a)
{
	if (a > n)
	{
		for (int cy1 = 1; cy1 <= n; cy1++)printf("%d ", input[cy1]);

		puts("");
		return;
	}

	for (int i = 1; i <= n;i++ )
	{	
		if (!bol[i])
		{
			input[a] = i;	
			bol[i] = true;
			dfs(a + 1);
			
			input[a] = 0;
			bol[i] = false;//恢复现场
			
			
		}
		
		
	}
	return;


}


int main()
{
	scanf("%d", &n);

	dfs(1);
	return 0;
}