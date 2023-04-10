#include<stdio.h>
#include<string.h>

int judge(int a)
{
	int b = 2;
	for (; b < a; b++)
	{
		if (a % b == 0)
		{

			return 0;
		}
	}
	return 1;

}


int main()
{
	int input = 0;
	scanf_s("%d", &input);
	int a = 0;
	int count = 0;
	int save = 0;

	if (input == 1)
	{
		printf("0");
	}
	else
	{
		for (a = 2; a <= input; a++)
		{
			if (save + a <= input)
			{
				if (judge(a) == 1)
				{
					printf("%d\n", a);
					count++;
					save = save + a;
				}
			}
		}
		printf("%d", count);
	}
	

}