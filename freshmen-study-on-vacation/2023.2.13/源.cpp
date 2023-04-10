#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <string.h>
#include <time.h>
#include <stdlib.h>

//struct a
//{
//	int a;
//	char b;
//
//};
//
//
//int main()
//{
//	struct a str1 = { 1,'b' };
//	struct a str2 = { 2,'c' };
//	FILE* fp;
//	fp = fopen("wenjian", "wb");
//	if (fp == NULL)
//	{
//		perror("fopen");
//		return 0;
//	}
//	fwrite(&str2, sizeof(struct a), 1, fp);
//	fclose(fp);
//	fp = NULL;
//
//	fp = fopen("wenjian", "rb");
//	if (fp == NULL)
//	{
//		perror("fopen");
//		return 0;
//	}
//
//	fread(&str1, sizeof(struct a), 1, fp);
//	printf("%d %c", str1.a, str1.b);
//	fclose(fp);
//	fp = NULL;
//	return 0;
//
//}

//int a(int b[])
//{
//	b[1] = 0;
//	return 0;
//}
//
//int main()
//{
//
//	int b[3] = { 1,1,1 };
//	a(b);
//	printf("%d", b[1]);
//}


//int main()
//{
//	char a[10];
//	char b[10];
//	scanf("%s", a);
//	scanf("%s", b);
//	printf("%s\n", a);
//	printf("%s", b);
//}

struct str
{
	int a;
	char b;
};

int main()
{
	str a[10];
	str b = { 1,'a' };
	a[0] = b;
	printf("%d %c", b.a, b.b);
}