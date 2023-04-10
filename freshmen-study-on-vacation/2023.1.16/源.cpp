#include<stdio.h>
#include<ctype.h>

int main()
{
	int b = '87';
	b=tolower(b);//该函数不会直接改变b的值，而是返回值是小写的字母，需要自行储存。
	printf("%c", b);

}