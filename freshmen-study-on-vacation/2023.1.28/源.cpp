

//随机值的产生，su

//#include<stdio.h>
//#include<stdlib.h>
//#include<time.h>
//
//int main()
//{ 
//	srand(time(0)*100);
//	int a = rand();
//	int b = rand();
//	printf("%d\n", a);
//	printf("%d\n", b);
//}


//#include<stdio.h>
//
//int main()
//{
//	int input = 0;
//	scanf_s("%d", &input);
//	int output = 1;
//
//	for (int cy1 = 0; cy1 < input; cy1++)
//	{
//		for (int cy2 = 0; cy2 < input - cy1; cy2++)
//		{
//			printf("%-02d", output);
//			output++;
//		}
//		printf("\n");
//	}
//
//	output = 1;
//	for (int cy1 = 0; cy1 < input; cy1++)
//	{
//		for (int cy2 = 0; cy2 < input - cy1; cy2++)
//		{
//			printf("%02d", output);     
//			output++;
//		}
//		printf("\n");
//	}
//
//}


//1到i的阶乘的和

//#include<stdio.h>
//#include<string.h>
//
//int main()
//{
//	int S = 0;
//	int i = 0;
//	scanf_s("%d", &i);
//	int cun = 1;
//
//	for (int cy1 = 1; cy1 <= i; cy1++)
//	{
//		cun = cun * cy1;
//		S = S + cun;
//	}
//	printf("%d", S);
//	
//}




//斐波那契数列
#include<stdio.h>
#include<string.h>
#include<malloc.h>

	
int main()
{
	int n = 0;
	scanf_s("%d", &n);
	
	int* arr;
	arr = (int*)malloc(sizeof(int) * n);



	switch (n)
	{
	case 0:
		printf("nothing");
		break;
	case 1:
		printf("1");
		break;
	case 2:
		printf("1 1");
		break;
	default:
	{
		arr[0] = 1;
		arr[1] = 1;
		for (int cy1 = 2; cy1 < n; cy1++)
		{
			arr[cy1] = arr[cy1 - 1] + arr[cy1 - 2];

		}
		for (int cy1 = 0; cy1 < n; cy1++)
		{
			printf("%d ", arr[cy1]);

		}

	}
		
	}
}


