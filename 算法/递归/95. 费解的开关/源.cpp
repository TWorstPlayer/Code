

//����˼·
//�صƺ������ʵ������˳�����
//�ӵ�һ�ſ�ʼ���´�ƣ�ÿһ����ĵ�ֻҪ����������һ���ƾ��У�����ֻҪ��һ�ŵĵ���ȷ���ģ���ô�������Ƶ�ѡ��Ҳ����ȷ����
//����������ֱ�Ӿʹӵڶ��ſ�ʼ����ˣ����Ƿ��һ��Ҳ���Բ���Ȼ��ó��Ľ��Ҫ����һ����?
//����һ��ʼop�ͶԵ�һ�ŵ�ÿһ�ֲ������б�����ʵ��ÿһ������ĸ��ǣ����յõ�һ����С�Ĳ�����



#define _CRT_SECURE_NO_WARNINGS
#include<cstring>
#include <cstdio>
#include<iostream>
#include<vector>
#include<algorithm>

using namespace std;
char input[6][6];//ȡ��һ��ûʲôӰ�죬������ʱ����Ա��������߽�����//����������Ϊ��ȡ�����ַ����������һ����\0����β������Ҫ��һλ
char copy1[6][6];


int dx[5] = { -1, 0, 1, 0, 0 }, dy[5] = { 0, 1, 0, -1, 0 };

void turn(int x, int y)
{
	for (int i = 0; i < 5; i++)
	{
		int a = x + dx[i], b = y + dy[i];
		if (a < 0 || a >= 5 || b < 0 || b >= 5) continue;   // �ڱ߽��⣬ֱ�Ӻ��Լ���
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
			memcpy(copy1, input, sizeof input);//һ��ʼҪ������������ݣ���ΪҪ��������ݶ�θı䣬��������ݣ������ѭ�����ò�����
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
			for (int i = 0; i < 5; i++)//��һ���ж��Ƿ����˺���Ҫ����Ϊ�е������û�а취�����еƶ������ġ������޽�
			{
				if (input[4][i] == '0')
				{
					dark = true;
					break;//ֱ��break�����ˣ���һ���ǲ����ľ�ok��
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
