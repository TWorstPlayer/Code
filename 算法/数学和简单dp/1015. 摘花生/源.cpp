#define _CRT_SECURE_NO_WARNINGS
#include<cstring>
#include <cstdio>
#include<iostream>
#include<vector>
#include<algorithm>

using namespace std;
const int Tmax=101;
int arr[Tmax][Tmax];
int arr1[Tmax][Tmax];
int T;
int hang, lie;

int main()
{
	cin >> T;
	while (T--)
	{
		cin >> hang >> lie;
		for (int i = 1; i <= hang; i++)
			for (int j = 1; j <= lie; j++)cin >> arr[i][j];

		for (int i = 1; i <= hang; i++)
		{
			for (int j = 1; j <= lie; j++)
			{
				arr[i][j] = max(arr[i - 1][j] + arr[i][j], arr[i][j - 1] + arr[i][j]);

			}
		}
		printf("%d", arr[hang][lie]);
		puts("");
	}
	
	
	
}