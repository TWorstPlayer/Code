#include<stdio.h>
#include<stdlib.h>

int maths(long long* p, long long num)
{
	if (num == 1)
	{
		return 0;
	}
	long long count = 0;

	for(long long cy1=1;cy1<num;cy1++)
	{
		count = count+( (*p )*(*(p + cy1)));
	} 
	num--;
	p++;
	count = count + maths(p ,num);
	return count;
}


int main()
{
	long long num = 0;
	long long count = 0;
	
	scanf_s("%lld", &num);
	
	long long* arr = NULL;
	arr = (long long*)malloc(num * sizeof(long long));
	for (int cy1 = 0; cy1 < num; cy1++)
	{
		scanf_s("%lld", &(*(arr + cy1)));

	}
	//以下为发生的一个典型错误
	//for (int cy2 = 0;cy2<num-1  ; cy2++)
	//{
	//	count+= maths(arr , num);
	//	arr++;
	//	num--;
	//}
	
	//while(num>1)
	//{
	//	count += maths(arr, num);
	//	arr++;
	//	num--;
	//}
	printf("%lld", maths(arr,num));


	return 0;
}