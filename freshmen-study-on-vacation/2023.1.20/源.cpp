#include<stdio.h>


//int main()
//{
//	enum color
//	{
//		red,
//		orange,
//		green
//	};
//	enum color a = red;
//	printf("%s", red);
//}

union s 
{
	char a;
	int b;
};
int main()
{
	union s a;
	a.b = 10;
	a.a = 'g';
	
	printf("%d\n",a.b);
	printf("%d",a.a);

}