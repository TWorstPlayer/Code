#include<stdio.h>
#include<string.h>
#include<malloc.h>



int main()
{
	int n = 0;
	scanf_s("%d", &n);

	int* arr;
	arr = (int*)malloc(sizeof(int) * n);

	for (int cy1 = 0; cy1 < n; cy1++)
	{
		scanf_s("%d", &arr[cy1]);
	}
	int max = 0;
	for (int loca = 0; loca < n; loca++)
	{
		int count = 1;
		for (int loca1 = loca+1 ; loca1 < n+1 ; loca1++)
		{
			if (arr[loca1] - arr[loca1 - 1] == 1)
			{
				count++;
			}
			else
			{
				break;
			}
		}
		if (count > max)
		{
			max = count;
		}

	}
	printf("%d", max);








}