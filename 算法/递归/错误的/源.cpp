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

int cal(int left, int right)
{
	int a = 0;

	for (int i = left + 1; i <= right; i++)
	{
		a = a * 10 + num[i];

	}
	return a;
}


int main()
{
	scanf("%d", &input);
	int mudi = 0;
	int a = 0;
	int fenzi = 0;
	int fenmu = 0;

	do
	{
		for (int i = 0; i <= 8; i++)
		{
			for (int j = i + 1; j <= 8; j++)
			{
				a = cal(-1, i);
				fenzi = cal(i, j);
				fenmu = cal(j, 8);

				if (input * fenzi == a * fenzi + fenmu)
				{
					count1++;
				}
			}
		}



	} while (next_permutation(num, num + 9));

	printf("%d", count1);

}



