#define _CRT_SECURE_NO_WARNINGS
#include<cstring>
#include <cstdio> 
#include<iostream>
#include<vector>
#include<algorithm>

using namespace std;


const int N = 10;
int num[9] = { 1,2,3,4,5,6,7,8,9 };
int input = 0;

int count1 = 0;

int cal(int left,int right)
{
	int a = 0;

	for (int i=left+1; i<=right; i++)
	{
		a = a * 10 + num[i];
		
	}
	return a;
}


int main()
{
	scanf("%d", &input);
	int mudi = input;
	

	do
	{
		for (int i = 0; i < 9; i++)// 枚举1~9的所有情况
		{
			for (int j = i+1; j < 9;j++)
			{
				int a = cal(-1, i);
				int b = cal(i, j);
				int c = cal(j, 8);
			
				if (mudi*c == a*c +b ) count1++;
				
			}
		}



	} while (next_permutation(num, num + 9));//全排列，每次循环对num进行全排列，直到排列完毕

	printf("%d", count1);

}



