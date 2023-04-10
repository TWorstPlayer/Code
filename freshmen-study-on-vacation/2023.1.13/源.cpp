#include<stdio.h>
#include<string.h>
//int main()
//{
//	int arr[10] = { 10,8,3,5,1,6,7,8,2 };
//	int(*p)[10] = &arr;
//
//	printf("%d\n", *((*p)+1));
//	printf("%d\n", **p+1);
//
//
//}


int main()
{

	char arr[] = { 'a','b','c','d','e','f' };
	printf("%d\n", strlen(arr));
	printf("%d\n", strlen(arr+0));
	printf("%d\n", strlen(&arr[1]));
	printf("%d\n", strlen(&arr[0] + 1));

}