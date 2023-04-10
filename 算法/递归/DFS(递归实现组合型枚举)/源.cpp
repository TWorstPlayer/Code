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
//bool bol[N];//0表示还没用，1表示用了//全部变量定义的时候会自动每个都为0
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
//			//在这个循环中有个很重要的事情就是，当panduan=0的时候就可以直接break了，不然可能后面的又将panduan覆盖了变成1，就会出现问题了
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
//		return;//这里一定要记得return，上面那个没有return也没关系，因为如果只有上面有return，万一条件不符合，该递归就不会终止了
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
//			bol[i] = false;//恢复现场
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

//上面那种方法实在递归实现排列型组合上的小小的改编，但是实际上如果每次printf前都要for循环一次的话，会花费很多时间，最好导致超时。
//以下这种方法是在递归中就直接实现了对数字大小的排列，每次通过自从比前一个数要大的数往里面加

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
	for (int i = start; i <= n; i++)//这里的条件还有一个用处，例如当n在n—1的位置的时候，这个时候就应该停止了，因为后面没有数可以放了，这里i<=n刚好判断了，
	{								//然后不会进入for循环，就不会再往下再递归了。
		input[u] = i;
	
		dfs(u+1, i+1);
		dfs(u+1, start+1);//这里应该是i+1，因为往数组里面填的数是i，然后i会随着循环变大，
		input[i] = 0;
		
	}


}



int main()
{
	scanf("%d %d", &n, &m);
	dfs(1, 1);
	return 0;

}