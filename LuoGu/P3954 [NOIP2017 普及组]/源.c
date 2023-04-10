#include <stdio.h>
int main()
{
	int input;
	scanf_s("%d", &input);
	int array[10000];
	int order = 0;
	do
	{
		array[order] = input;
		if (input % 2 == 0)
		{
			input = input / 2;
		}
		else
		{
			input = input * 3;
			input++;
		}
		order++;
	} while (input != 1);
	array[order] = 1;

    for (int c = order; c >= 0; c--)
	{
		printf("%d ", array[c]);
    }


	}
