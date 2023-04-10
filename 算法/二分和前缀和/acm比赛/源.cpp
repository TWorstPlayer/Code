#define _CRT_SECURE_NO_WARNINGS
#include<cstring>
#include <cstdio>
#include<iostream>
#include<vector>
#include<algorithm>

using namespace std;
int n, m;
const int N = 11;
char arr[10][N];
int hang;
int count1 = -1;
void dfs(int locat)
{

	if (locat > n)
	{	
		count1++;
		if (count1 == m)
		{
			for (int i = 1; i <= n; i++)printf("%c", arr[0][i]);
			
		}
		return;
		
	}

	for (int i = 1; i <= 2; i++)
	{
		if (i == 1)
		{
			arr[0][locat] = 'F';
		}
		else {
			arr[0][locat] = 'T';

		}
		dfs(locat + 1);

	}
	
	dfs(locat+1);

	return;
	
}

int main()
{

	cin >> n >> m;
	dfs(1);
	
	

}


//int a, b;
//int count1 = 0;
//void cut(int a, int b)
//{
//	if (a == b)
//	{
//		return;
//	}
//
//	if (a > b)
//	{
//		a = a - b;
//
//	}
//	else
//	{
//		b = b - a;
//	} 
//	count1++;
//	
//	cut(a, b);
//	
//}
//int main()
//{
//	cin >> a >> b;
//	cut(a, b);
//	if (count1 != 0)
//	{
//		count1++;
//	}
//	printf("%d", count1);
//}