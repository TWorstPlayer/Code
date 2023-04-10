#define _CRT_SECURE_NO_WARNINGS
#include<cstring>
#include <cstdio>
#include<iostream>
#include<vector>
#include<algorithm>

using namespace std;


char arr[2000001];
int n, m=0;
char x, y;
char duiying[26];
vector<int>jizhu;


int main()
{
	cin >> n >> m;
	scanf("%s", arr);
	char x;
	char y;
	
	for (int i = 0; i < n; i++)
	{
		jizhu.push_back(arr[i] - 'a');
	}
	
	for (int i = 0; i <= 25; i++)
	{

		duiying[i] = 'a' + i;
	}
	for (int i = 0; i < m; i++)
	{
		cin >> x >> y;

		for (int j = 0; j < 26; j++)
		{
			if (duiying[j] == x || duiying[j] == y)
			{
				if (duiying[j] == x)
				{
					duiying[j] = y;
					continue;
				}
				else
				{
					duiying[j] = x;
					continue;
				}
			}
		}
	}
	for (int i = 0; i < n;i++)
	{
		printf("%c", duiying[jizhu[i]]);
	}
	

	
	
	
	

}
	


//const int N = 500;
//
//int main()
//{
//	int n = 0;
//	int X = 0;
//	int count1 = 0;
//	scanf("%d %d", &n, &X);
//	int X1 = (n-1)/ 2;
//	
//	int arr[N];
//	for (int i = 0; i < n; i++) {
//		scanf("%d", &arr[i]);
//	}
//
//	sort(arr, arr+n);
//	
//	int little = 0;
//	int big = 0;
//	int mid = 0;
//
//	int mid1 = 0;
//	mid1 = (n + 1) / 2 - 1;
//	if (arr[mid1] == X)
//	{
//		printf("0");
//		return 0;
//	}
//	
//	for (int i = 0; i < n; i++)
//	{
//		if (arr[i] < X)
//		{
//			little++;
//		}
//		if (arr[i] == X)
//		{
//			mid++;
//		}
//		if (arr[i] > X)
//		{
//			big++;
//		}
//	}
//	if (big==0)
//	{
//		printf("%d",n+1-mid-mid);
//		return 0;
//	}
//	if ( little == 0)
//	{
//		printf("%d", n-mid-mid);
//		return 0;
//	}
//	int a = 0;
//	if (n % 2 == 0)
//	{
//		if (big > little) 
//		{
//			a = big - little-mid;
//		}
//		else
//		{
//			a = little - big-mid+1;
//		}
//		printf("%d", a);
//		return 0;
//	}
//	if (big > little)
//	{
//		a = big - little - mid;
//	}
//	else
//	{
//		a = little - big - mid +1;
//	}
//	printf("%d", a);
//	return 0;
//
//
//}



//int N = 9;
//int input = 0;
//int arr[8];
//int n = 0;
//int panduan(int input) {
//	int b = input;
//	for (int i = 0; i < 8; i++)
//	{
//		arr[i] = input % 10;
//		input = input / 10;
//
//	}
//	
//	if (arr[7] != 0 && arr[4] == arr[3] && arr[2] == arr[0])
//	{
//		n--;
//			
//			return 1;
//		
//	}
//	return 0;
//}
//
//int main() {
//	int j = 10000000;
//	
//	scanf("%d", &n);//119999999
//	
//
//	//if (n >= 100000 && n < 200000)
//	//{
//	//	n = n - 100000 ;
//	//	j = 119999999;
//	//}
//
//	//	else if (n >= 200000&&n< 300000)
//	//	{
//	//		n = n - 200000 ;
//	//		j = 229999999;
//	//	}//330000000
//	//	else if (n >= 300000)
//	//	{
//	//		n = n - 300000 ;
//	//		j = 330000000;
//	//	}
//	//	else if (n >= 400000 && n < 500000)
//	//	{
//	//		n = n - 400000 ;
//	//		j = 440000000;
//	//	}
//
//	//	else if (n >= 500000 && n < 600000)
//	//{
//	//	n = n - 500000;
//	//	j = 559999999;
//	//}
//	//else if (n >= 600000 && n < 700000)
//	//{
//	//	n = n - 600000 ;
//	//	j = 669999999;
//	//}
//	//else if (n >= 700000 && n < 800000)
//	//{
//	//	n = n - 700000 ;
//	//	j = 779999999;
//	//}
//	//else if (n >= 800000 && n < 900000)
//	//{
//	//	n = n - 800000 ;
//	//	j = 889999999;
//	//}
//	//else if (n >= 882436)
//	//{
//	//	n = n - 882436 ;
//	//	j =	998244353;
//	//}
//	
//
//
//
//
//	for (;; j++)
//	{
//		if (panduan(j) == 1 && n == 0)
//		{
//			int b = j / 10000000;
//			j = j + (b* 100000000);
//
//			printf("%d", j);
//			return 0;
//		}
//	}
//
//	
//	 
//	
//}



//int n;
//const int N = 100002;
//char arr[N];
//int main()
//{
//	
//	
//	scanf("%d", &n);
//	
//	scanf("%s", arr);
//
//	if (n == 1)
//	{
//		printf("Yes");
//		return 0;
//	}
//	if (n > 26)
//	{
//		printf("Yes");
//		return 0;
//	}
//	
//	for (int i = 0; i <n-1; i++)
//	{
//	
//		for (int j = i+1; j<n; j++)
//		{
//			if (arr[i] == arr[j])
//			{
//				printf("Yes");
//				return 0;
//			}		
//		}
//	}
//	printf("No");
//
//
//	return 0;
//}





//int N;
//char arr[11][11];
//int main()
//{
//	scanf("%d", &N);
//	for (int i = 0; i < N; i++)
//	{
//		scanf("%s", arr[i]);
//	}
//	for (int i = N-1; i >=0; i--)
//	{
//		printf("%s\n", arr[i]);
//	}
//	return 0;
//}





//int N;
//int main()
//{
//	scanf("%d", &N);
//	if(N%2==0)
//	{
//		printf("%d", N / 2 - 1);
//	}
//	else
//	{
//		printf("%d", N / 2 );
//	}
//	
//	
//}


























//int N;
//
//int main()
//{
//
//	scanf("%d", &N);
//	for (int i = N; i >= 0; i--)
//	{
//		printf("%d", i);
//		printf("\n");
//	}
//	return 0;
//}
