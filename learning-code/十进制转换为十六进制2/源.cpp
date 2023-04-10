#include<stdio.h>


int main() 
{
	void decimaltohex(char inumber[], int input, char output[], int output1 = 0);
	int a;
	int b = 0;
	char a1[1000] = { '0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F' };
	char a2[1000];
	printf("please input the decimal number:");
	scanf_s("%d", &a);
	decimaltohex(a1, a, a2, b);

}
void decimaltohex(char inumber[], int input, char output[], int output1 = 0)
{
	{
		while (input != 0)
		{
			output1++;
			output[output1] = inumber[input % 16];
			input = input / 16;
		}
		printf("The answer is:");
		for (int i = output1; i > 0; i--) {
			printf("%c", output[i]);
		}
	}
}

