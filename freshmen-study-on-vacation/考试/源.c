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

	printf("请输入第一个点的X，Y坐标，中间以空格间隔：");
	scanf("%lf %lf", &x1, &y1);
	printf("请输入第二个点的X，Y坐标，中间以空格间隔：");
	scanf("%lf %lf", &x2, &y2);

	double distance1 = 0;
	double distance2 = 0;
	distance1 = (x2 - x1)* (x2 - x1) + (y2 - y1)* (y2 - y1);

	distance2 = sqrt(distance1);
	printf("两个点的欧式距离为%.4f", distance2);

	
}

