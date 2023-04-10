#include<stdio.h>
#include<string.h>
#include<time.h>


int main()
{
	srand(time(0));
	int a = rand();
	printf("%d\n", a);
	a = rand();
	printf("%d", a);


}