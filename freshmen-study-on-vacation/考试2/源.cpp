#define _CRT_SECURE_NO_WARNINGS
#pragma warning(disable : 6031)
#pragma warning(disable : 4996)
#include <stdlib.h>
#include <time.h>
#include <string.h>
#include <windows.h>
#include <math.h>
#include <stdio.h>


int getNumOfF(int n)
{
	int count = 0;
	if (n < 15)
	{
		return count;
	}
	if (n >= 256)
	{
		return count;
	}
	if(n == 15 )
	{
		count++;
		return count;
	}
	
	
	if ((n % 16) == 15)
	{
		count++;
		n = n - 15;
	}
	
	
	if (n / 16 == 15)
	{
		count++;
		return count;
	}
	
	return count;

}


int main()
{
	int input1, input2, input3 = 0;
	printf("������3��������0-300�����м��ÿո�����");

	scanf("%d %d %d", &input1, &input2, &input3);

	printf("������������ʮ�����Ʊ�ʾ�У�F�ĸ����ֱ�Ϊ��%d %d %d", getNumOfF(input1), getNumOfF(input2), getNumOfF(input3));


}

