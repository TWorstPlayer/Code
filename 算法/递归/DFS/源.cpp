#define _CRT_SECURE_NO_WARNINGS
#include<cstring>
#include <cstdio>
#include<iostream>
#include<vector>
#include<algorithm>

using namespace std;


const int N = 16;

int n=0;
int st[N];//���жϵ�ǰλ�õ�״̬����0��ʾ��û���ǣ�1��ʾѡ��2��ʾ��ѡ

void dfs(int u)
{
	if (u > n)
	{
		for (int i = 1; i <= n; i++)
			if (st[i] == 1)
				printf("%d ", i);
		printf("\n");
		return;
		
	}                                                     //  1 2 3 4 5

	st[u] = 2;//��ѡ��ÿ��ѭ���������涼ִ��һ�β�ѡ����ѡ֮���ڵݹ������ٽ��������ѡ�����ܹ��������е����
	dfs(u + 1);
	st[0] = 0;//�ָ��ֳ��������������ûʲô�ã���������ǵݹ��������Ҫע�⵽��

	st[u] = 1;//ѡ
	dfs(u + 1);
	st[u] = 0;//�ָ��ֳ��������������ûʲô�ã���������ǵݹ��������Ҫע�⵽��
	return;



}



int main()
{
	scanf("%d", &n);
	dfs(1);
	return 0;


}