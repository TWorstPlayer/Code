#include<stdio.h>
//初版
// 有一定的问题/当input为负数的时候无法正确表示
//int Numberof1(int input)
//{
//	int ret = 0;
//	do
//	{
//		if (input % 2 ==1)
//		{
//			ret++;
//		}
//
//		input = input / 2;
//	} while (input != 0);
//	return ret;
//}
//
//int main()
//{
//	int input = 0;
//	printf("请输入一个数字\n");
//	scanf_s("%d", &input);
//	printf("%d", Numberof1(input));
//}

//第二版

int Numberof1(int input)
{
	int ret = 0;
	do
	{
		if (input % 2 ==1)
		{
			ret++;
		}

		input = input / 2;
	} while (input != 0);
	return ret;
}

int main()
{
	int input = 0;
	printf("请输入一个数字\n");
	scanf_s("%d", &input);
	printf("%d", Numberof1(input));
}