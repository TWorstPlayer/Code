#include <stdio.h>
#include<math.h>
int main() {
	int number[100][100];
	for (int a, b = 0; a < 100; a++)
	{
		b = 0;
		for (; b < 100; b++)
		{
			number[a][b] = {'\0'};
		}
	}
	int r = 50;
	int x, y=0;
	for (; y < 100; y++)
	{
		 x = sqrt(2500-(y-50)*(y-50));
		 x = x + 50;
		 number[x][y]=1;
		 printf("%d", number[x][y]);

	}
	for (int a, b = 0; a < 100 && b < 100; a++)
	{
		b = 0;
		for (; b < 100; b++)
		{
			printf("%d", number[a][b]);
		}
	}

}