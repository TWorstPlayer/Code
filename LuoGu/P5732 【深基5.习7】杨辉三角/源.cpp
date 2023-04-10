#include<stdio.h>


int main()
{
	int n = 0;
	scanf_s("%d", &n);
	int arr[20][20] = { 0 };
	int a = 0;
	int b = 0;
//1
//1 1
//1 2 1
//1 3 3 1
//1 4 6 4 1
//1 5 10 10 5 1
	
//先从1和2入手，这两个比较特殊，因为第一行和第二行中的数都不是用等于杨辉三角来推出来的。
	if (n == 1)
	{
		printf("1");
	}

	else if (n == 2)
	{
		printf("1\n" );
		printf("1 1");
	}
//这里开始赋值
	else if(n > 2)
	{
//这一步给首和尾都给上一个1		
		for (a = 0; a < n; a++)
		{
			arr[a][0] = 1;
			arr[a][a] = 1;
		}
//赋值
		for (a = 2; a < n; a++)
		{
			for (b = 1; b < a; b++)
			{
				arr[a][b] = arr[a - 1][b] + arr[a - 1][b - 1];
			}

		}

//打印
		for (a = 0; a < n; a++)
		{
			for (b = 0; b <= a; b++)
			{
				printf("%d ", arr[a][b]);
			}
			printf("\n");
		}
	}
}