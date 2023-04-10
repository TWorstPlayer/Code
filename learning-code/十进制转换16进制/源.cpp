#include<stdio.h>
int main()
{
	int n1;
	char decimalToHex[n1];
	decimalToHex[n1];
	getchar("%s", decimalToHex[n1]);
	int cycle1 = n1;
	int outputmb = 0;

	for (; cycle1 != 0; cycle1--)
	{
		outputmb = outputmb + decimalToHex[n1 - cycle1] * (10 ^ cycle1);
	}
	int outPut1 = outputmb;
	int a = 0;
		for(;outputmb> 1;a++)    //看输出数组长度为多少
		{
			 outputmb/ 16;
		}
	
	char outPut[a];

	for (int b,c = 0; outPut1 > 1; b++)
	{
		outPut[a] = outPut1 % 16;
		outPut1 = outPut1 / 16;
	}
	for (int b=0;b<=a ; b++)
	{
		printf("%s", outPut[a]);
	}
	



	
}