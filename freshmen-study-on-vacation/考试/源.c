#define _CRT_SECURE_NO_WARNINGS
#pragma warning(disable : 6031)
#pragma warning(disable : 4996)
#include <stdlib.h>
#include <time.h>
#include <string.h>
#include <windows.h>
#include <math.h>
#include <stdio.h>



int main()
{
	double x1 = 0;
	double y1 = 0;

	double x2 = 0;
	double y2 = 0;

	printf("�������һ�����X��Y���꣬�м��Կո�����");
	scanf("%lf %lf", &x1, &y1);
	printf("������ڶ������X��Y���꣬�м��Կո�����");
	scanf("%lf %lf", &x2, &y2);

	double distance1 = 0;
	double distance2 = 0;
	distance1 = (x2 - x1)* (x2 - x1) + (y2 - y1)* (y2 - y1);

	distance2 = sqrt(distance1);
	printf("�������ŷʽ����Ϊ%.4f", distance2);

	
}

