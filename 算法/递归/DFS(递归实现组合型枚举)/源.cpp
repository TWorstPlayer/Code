//#define _CRT_SECURE_NO_WARNINGS
//#include<cstring>
//#include <cstdio> 
//#include<iostream>
//#include<vector>
//#include<algorithm>
//
//using namespace std;
//
//const int N = 10;
//int input[N];
//bool bol[N];//0��ʾ��û�ã�1��ʾ����//ȫ�����������ʱ����Զ�ÿ����Ϊ0
//int n;
//int limit;
//int panduan = 1;
//
//void dfs(int a)
//{
//	if (a > limit)
//	{
//		for (int i = 1; i + 1 <= limit; i++)
//		{
//			if (input[i] > input[i + 1])
//			{
//				panduan = 0;
//				break;
//			}
//			else
//			{
//				panduan = 1;
//			}
//			//�����ѭ�����и�����Ҫ��������ǣ���panduan=0��ʱ��Ϳ���ֱ��break�ˣ���Ȼ���ܺ�����ֽ�panduan�����˱��1���ͻ����������
//		}
//
//		if (panduan == 1)
//		{
//			for (int cy1 = 1; cy1 <= limit; cy1++)printf("%d ", input[cy1]);
//
//			puts("");
//			
//			return;
//		}
//		return;//����һ��Ҫ�ǵ�return�������Ǹ�û��returnҲû��ϵ����Ϊ���ֻ��������return����һ���������ϣ��õݹ�Ͳ�����ֹ��
//
//		
//	}
//
//	for (int i = 1; i <= n; i++)
//	{
//		if (!bol[i])
//		{
//			input[a] = i;
//			bol[i] = true;
//			dfs(a + 1);
//
//			input[a] = 0;
//			bol[i] = false;//�ָ��ֳ�
//
//
//		}
//
//
//	}
//	return;
//
//
//}
//
//
//int main()
//{
//	scanf("%d", &n);
//	scanf("%d", &limit);
//
//
//	dfs(1);
//	return 0;
//}

//�������ַ���ʵ�ڵݹ�ʵ������������ϵ�СС�ĸı࣬����ʵ�������ÿ��printfǰ��Ҫforѭ��һ�εĻ����Ứ�Ѻܶ�ʱ�䣬��õ��³�ʱ��
//�������ַ������ڵݹ��о�ֱ��ʵ���˶����ִ�С�����У�ÿ��ͨ���Դӱ�ǰһ����Ҫ������������

#define _CRT_SECURE_NO_WARNINGS
#include<cstring>
#include <cstdio> 
#include<iostream>
#include<vector>
#include<algorithm>


const int N = 30;
int n, m;
int input[N];

void dfs(int u, int start)
{
	if (u > m)
	{
		for (int i = 1; i <= m; i++)printf("%d ", input[i]);
		puts("");
		return;

	}
	for (int i = start; i <= n; i++)//�������������һ���ô������統n��n��1��λ�õ�ʱ�����ʱ���Ӧ��ֹͣ�ˣ���Ϊ����û�������Է��ˣ�����i<=n�պ��ж��ˣ�
	{								//Ȼ�󲻻����forѭ�����Ͳ����������ٵݹ��ˡ�
		input[u] = i;
	
		dfs(u+1, i+1);
		dfs(u+1, start+1);//����Ӧ����i+1����Ϊ�����������������i��Ȼ��i������ѭ�����
		input[i] = 0;
		
	}


}



int main()
{
	scanf("%d %d", &n, &m);
	dfs(1, 1);
	return 0;

}