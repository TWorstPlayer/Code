#include<stdio.h>
#include<string.h>

int Common(int a, int b)
{
	int common = 0;
	if (a > b)
	{
		common = a;
	}
	else
	{
		common = b;
	}
	while (((common % a) != 0) || ((common % b) != 0))
	{
		common++;
	} 
	return common;
}

int  main()
{
	int input1 = 0;
	int input2 = 0;
	scanf_s("%d", &input1);
	scanf_s("%d", &input2);
	printf("%d", Common(input1, input2));
}