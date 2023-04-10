#include <stdio.h>
float computeAverage(int vNumbers[], int vCount)
{
	float computeAverage = 0;
	for (int a = 0; a < vCount; a++)
	{
		computeAverage = computeAverage + vNumbers[a];


	}
	computeAverage = computeAverage / vCount;
	return computeAverage;
}


int computeMax(int vNumbers[], int vCount)
{
	int Max;
	int b = 0;
	Max = vNumbers[b];
		do
		{ if(Max <vNumbers[b])
			Max = vNumbers[b];
			b++;
		} while ( b < vCount);
	return Max;
}





int main()
{
	int group[10];
	for (int a = 0; a < 10; a++)
	{
		scanf_s("%d", &group[a]);
	}

	printf("%d\n", computeMax(group, 10));
	printf("%f", computeAverage(group, 10));











}