#define _CRT_SECURE_NO_WARNINGS
#include<cstring>
#include <cstdio>
#include<iostream>
#include<vector>
#include<algorithm>

using namespace std;

int N = 0;
const int n = 100001;
int arr[n];

int check(int power)
{

	for (int i = 0; i < N; i++)
	{
		power = 2 * power - arr[i];
		
		if (power >= 1e5)return 1;//这句话没写出问题了。为什么呢？
								//因为会超过int的储存范围，如果arr[i]很小，那么几乎每次power都变大两倍，就可以最后爆掉了int。
		
		if (power < 0)
		{
			return -1;
		}
	}
	return 1;
}


int main()
{
	
	scanf("%d", &N);
	
	int a = 0;
	for (int i = 0; i < N; i++)
	{
		scanf("%d", &arr[i]);
		
	}

	int l = 0;
	int r = 100000;

	while (l < r)
	{
		int mid = (l + r ) /2;
		//int mid = (l + r +1 ) / 2;//这里加不加一取决于下面的r和l是如何取得，一定要记住，避免死循环。

		if (check(mid) == 1)
		{
			r = mid;
		}
		else
		{
			l = mid+1;
		}
	}
		
	
	printf("%d\n", r);

	


	return 0;

}
