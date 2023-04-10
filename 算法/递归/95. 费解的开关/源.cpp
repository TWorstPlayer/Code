

//本题思路
//关灯和灭灯其实可以有顺序的来
//从第一排开始往下打灯，每一个灭的灯只要按它的下面一个灯就行，所以只要第一排的灯是确定的，那么整个按灯的选择也就是确定的
//但是这样是直接就从第二排开始灭灯了，而是否第一排也可以操作然后得出的结果要更快一点呢?
//所以一开始op就对第一排的每一种操作进行遍历，实现每一种情况的覆盖，最终得到一个最小的操作数



#define _CRT_SECURE_NO_WARNINGS
#include<cstring>
#include <cstdio>
#include<iostream>
#include<vector>
#include<algorithm>

using namespace std;
char input[6][6];//取大一点没什么影响，但是有时候可以避免遇到边界问题//在这题是因为读取的是字符串，最后有一个“\0”结尾，所以要大一位
char copy1[6][6];


int dx[5] = { -1, 0, 1, 0, 0 }, dy[5] = { 0, 1, 0, -1, 0 };

void turn(int x, int y)
{
	for (int i = 0; i < 5; i++)
	{
		int a = x + dx[i], b = y + dy[i];
		if (a < 0 || a >= 5 || b < 0 || b >= 5) continue;   // 在边界外，直接忽略即可
		input[a][b] ^= 1;
	}
}

int main()
{
	int m = 0;
	scanf("%d", &m);
	while (m--)
	{

		int rec = 10;
		for (int i = 0; i < 5; i++)
		{
			cin >> input[i];
		}

		for (int op = 0; op < 32; op++)
		{
			memcpy(copy1, input, sizeof input);//一开始要备份输入的数据，因为要对这个数据多次改变，如果不备份，后面的循环就用不了了
			int count1 = 0;
			for (int i = 0; i < 5; i++)
			{

				if (op >> i & 1)
				{
					count1++;
					turn(0, 4 - i);
				}
			}

			for (int i1 = 0; i1 < 4; i1++)
			{
				for (int i2 = 0; i2 < 5; i2++)
				{
					if (input[i1][i2] == '0')
					{
						turn(i1 + 1, i2);
						count1++;
					}
				}
			}



			bool dark = false;
			for (int i = 0; i < 5; i++)//这一步判断是否都亮了很重要，因为有的情况是没有办法把所有灯都点亮的——即无解
			{
				if (input[4][i] == '0')
				{
					dark = true;
					break;//直接break就行了，有一个是不亮的就ok了
				}

			}
			if (!dark)rec = min(rec, count1);
			memcpy(input, copy1, sizeof input);
		}


		if (rec > 6)
		{
			printf("-1\n");

		}
		else
		{
			printf("%d\n", rec);

		}
	}
}
