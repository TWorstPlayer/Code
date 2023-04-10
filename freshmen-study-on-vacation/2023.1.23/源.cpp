#include<stdio.h>
#include<string.h>

//struct a
//{
//	int a;
//	char c;
//
//};
//int main()
//{
//	struct a b[100];
//	b[0].a = 10;
//
//}

//int main()
//{
//
//	a = 10;
//	printf("%d",a);
//}


int main()
{
	struct a
	{
		char name[10];
		int age;
	};

	struct a arr[10];

	arr[0].age = 15;

	strcpy_s(arr[0].name, "ÕÅÈı");
	
	printf("%s", arr[0].name);



}