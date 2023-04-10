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
		
		if (power >= 1e5)return 1;//��仰ûд�������ˡ�Ϊʲô�أ�
								//��Ϊ�ᳬ��int�Ĵ��淶Χ�����arr[i]��С����ô����ÿ��power������������Ϳ�����󱬵���int��
		
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
		//int mid = (l + r +1 ) / 2;//����Ӳ���һȡ���������r��l�����ȡ�ã�һ��Ҫ��ס��������ѭ����

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
