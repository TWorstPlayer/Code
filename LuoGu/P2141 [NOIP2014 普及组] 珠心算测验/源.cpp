#include <stdio.h>
int main()
{
	int sum;
	scanf_s("%d", &sum);
	int group[sum];
	for (int order = 0,input; order < sum; order++)
	{
		scanf_s("%d", &input);
		group[order] = input;
	}
	int group1[1000];
	int order3 = 0;
	for (int order1 = 0; order1 < sum; order1++)
	{
		for (int order2 = 0; order2 < sum; order2++)
		{
			if (group[order2] != group[order1])
			{
				group1[order3] = group[order2];
				order3++;
				
			}
		}
	}
	for (int order4=0;order4<=order3;order4++)
	{
		printf("%d ", &group1[order4]);
		
	}

}
