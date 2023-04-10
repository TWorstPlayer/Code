#include<stdio.h>
#include<string.h>



unsigned char getChksum(unsigned char* p, int len)
{
	unsigned int out = 0;
	for (int cy1 = 0; cy1 < len;cy1++)
	{
		out += *(p + cy1);
	}
	printf("%08d", out);
	return 0;
}


int main()

{
	unsigned char input[14] = { '0' };
	scanf_s("%s", input, 14);
	unsigned int len = 0;
	(const char)input;
	len = strlen((const char*)input);
	getChksum(input, len);
}






