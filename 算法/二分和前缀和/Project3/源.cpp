#define _CRT_SECURE_NO_WARNINGS
#include<cstring>
#include <cstdio>
#include<iostream>
#include<vector>
#include<algorithm>

using namespace std;

const int N = 1000001;
int n, m;
int arr[N] = { 0 };
int count1;
void an(int locat,int cishu)
{
		count1 += cishu;

		arr[locat] += cishu;
		arr[locat - 1] += cishu;
		arr[locat + 1] += cishu;

		if (arr[locat] >= n)
		{
			arr[locat] -= m;
		}
		if (arr[locat+1] >= n)
		{
			arr[locat+1] -= m;
		}

		if (arr[locat-1] >= n)
		{
			arr[locat-1] -= m;
		}


	
}
int main()
{
	int T = 0;
	

	
	cin >> n >> m;
	for (int i = 0; i < n; i++)scanf("%d", &arr[i]);


	for (int i = 0; i < n-1; i++)
	{
		if (arr[i] == 0)
		{
			continue;
		}
		else {
			an(i + 1,m-arr[i]);
		}
	}

	for (int i = 0; i < n; i++)
	{
		printf("%d ", arr[i]);
	}

	if (arr[n - 1] == 0)
	{
		printf("%d", count1);
	}
	else
	{
		if ((n - 1) % 5 != 0 && (n - 1) % 3 != 0)
		{
			printf("-1");
		}
		else {
			int a = m - arr[n - 1];
			int b = 0;
			if ((n - 1) % 3 == 0)
			{
				b += ((n - 1) / 3) * arr[n-1];
				b += (((n - 1) / 3) - 1 + 2) * a;
				printf("%d",count1+b);
			}

		}

	}


	

}