#include <stdio.h>
int main()
{
	int number = 0;

	scanf_s("%d", &number);
	int total[number];
	
	for (int a = 0; a < number; a++)
	{
		scanf_s("%d", &total[a]);
	}

		/*for (int a = 0; a < number; a++)
		{
			printf("%d", total[a]);
		}*/
		int end[number];

	 	for (int a = 0,c = 0; a < number; a++) //Õâ¸öÊÇ
		{
			c = 0;
			int b = 0;
			for (; b < a; b++)
			{
				if (total[a] > total[b])
				{
					c++;


				}
				
			}
			end[a] = c;
			
			printf("%d ", end[a]);

		  }





	}