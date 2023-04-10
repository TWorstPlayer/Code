#include <stdio.h>
int main()
{
	int group[10];

	for (int a = 0; a < 10; a++)
	{
		scanf("%d", &group[a]);
	}
	int swap = 0;
	;

	for (int c = 10; c >0; c--)
	{


		for (int d = 0; d + 1 <  c; d++)
		{
			if (group[d] > group[d + 1])
			{
				swap=group[d];
				group[d] = group[d + 1];
				group[d + 1] = swap;

			}
		}

	}
	for (int a = 0; a < 10; a++)
	{
		printf("%d ", group[a]);
	}
}