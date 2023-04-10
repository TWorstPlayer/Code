#include<stdio.h>
#include<string.h>

//int mylen(const char* s)
//{
//	int a;
//	for()
//}


int main(int argc, char const *argv[])
{
	char abc[] = "hello \0";

	printf("strlen=%lu\n", strlen(abc));
	printf("sizeof=%lu\n", strlen(abc));
	printf("strlen=%d\n", strlen(abc));
	printf("sizeof=%d\n", strlen(abc));
	return 0;
}