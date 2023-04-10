#define _CRT_SECURE_NO_WARNINGS
#pragma warning(disable : 4996)
#pragma warning(disable : 6031)
#include <stdio.h>
#include <string.h>
#include <time.h>


int main()
{
	time_t time1 = 0;


	printf("%s", ctime(&time1));
	printf("%d", time1);
}