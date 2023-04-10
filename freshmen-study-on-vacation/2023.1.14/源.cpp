#include<stdio.h>
#include<string.h>


//int main()
//{
//	if (strlen("abc") - strlen("abcdfeg") > 0)
//	{
//		printf("1");
//	}
//	else
//	{
//		printf("12");
//	}
//	
//
//}



int main()
{
	char a[10] = "abd";
	strncpy(a, "ad\0b",3);
	printf("%s\n", a);
	printf("%c", a[2]);

}