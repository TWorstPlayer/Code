#include<stdio.h>


//����ָ������

int sub1(int a, int b)
{
	return a + b;
}

int sub2(int a, int b)
{
	return a + b;
}

int sub3(int a, int b,int c)
{
	return a + b+c;
}

int main()
{

	int (*p[2])(int, int) = { sub1,sub2 };
	int a = 1;
	int b = 1;
	printf("%d ", (p[1])(a, b));
	printf("%d ", (*p[1])(a, b));
	printf("%d", (*********p[1])(a, b));//*�ں���ָ�������������
}