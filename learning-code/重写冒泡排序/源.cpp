#include<stdio.h>
int main()
{
	int arr[10];
	//以下给数组赋值
	for (int cy1 = 0; cy1 < 10; cy1++)
	{
		arr[cy1] = cy1;
	}
	//测试是否成功赋值
	for (int cy1 = 0; cy1 < 10; cy1++)
	{
		printf("%d", arr[cy1]);
	}
	
		printf("\n");
	//以下为冒泡数列
	
	for(int cy2=10;cy2>1;cy2--)//外层循环
	{
		for (int cy1 = 0, change = 0; cy1 + 1 < cy2; cy1++)//内层循环
		{
			if (arr[cy1] < arr[cy1 + 1])
			{
				change = arr[cy1];
				arr[cy1] = arr[cy1 + 1];
				arr[cy1 + 1] = change;
			}
		}
			
	}
	for (int cy1 = 0; cy1 < 10; cy1++)
	{
		printf("%d", arr[cy1]);
	}

}