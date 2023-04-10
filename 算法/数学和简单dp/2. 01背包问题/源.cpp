#define _CRT_SECURE_NO_WARNINGS
#include<cstring>
#include <cstdio>
#include<iostream>
#include<vector>
#include<algorithm>

using namespace std;
int N;
int V;
int wi[1001];
int vi[1001];
int F[1001][1001];

int main()
{
	cin >> N >> V;
	for (int i = 1; i <= N; i++)cin >> vi[i] >> wi[i];

	for (int i = 1; i <= V; i++)//背包容积从小到大
	{
		for (int j = 1; j <= N; j++)//第n件的情况
		{
			if (vi[j] <= i)
				F[i][j] = max(F[i][j-1], F[i - vi[j]][j-1]+wi[j]);
			else
				F[i][j] = F[i][j-1];
		}
	}
	printf("%d", F[V][N]);




 
 
 
}
// 
// 
// 
// 
//#include <stdio.h>
//#include <stdlib.h>
//#include<string.h>
//
//int main(int argc, char* argv[])
//{
//
//    char a[1000], b[1000];
//    scanf("%s%s", &a, &b);
//    int count = 0;
//    int i;
//    int len = strlen(a);
//    for (i = 0; i < len; i++)
//    {
//        if (a[i] != b[i])
//        {
//            a[i] = b[i];
//            if (a[i + 1] == '*')
//            {
//                a[i + 1] = 'o';
//            }
//            else {
//                a[i + 1] = '*';
//            }
//            count++;
//        }
//    }
//    printf("%d", count);
//    return 0;
//}