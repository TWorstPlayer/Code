#include<stdio.h>

//int cy1(int a)
//{
//	int cunchu = 1;
//	if (a > 0)
//	{
//		
//		cunchu = a * cy1(a - 1);
//	}
//
//	return cunchu;
//}

int cy1(long long a)
{  
	long long cunchu = 1;
	if (a > 0)
	{

		cunchu = a * cy1(a - 1);
	}

	return cunchu;
}

int cy2(int b)
{
	long long S = 1;
	if (b > 1)
	{
		
		S = cy1(b) + cy2(b - 1);
	}
	return S;
}

int main()
{
	long long input = 0;
	scanf_s("%d", &input);
	printf("%d", cy2(input));

	//但是该种方法只能在有限范围内实现求阶乘
	
	


	
}