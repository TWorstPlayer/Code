#include<stdio.h>

int main()
{
	long long a = 0;
	long long b = 0;
	long long n = 0;
	long long rembexces = 0;
	long long rembdays = 0;
	scanf_s("%lld %lld %lld", &a, &b, &n);
	long long cy1 = 0;
	long long cy2 = 0;
	if (n == 0)
	{
		printf("0");
		return 0;
	}

	if (n >= (5 * a + 2 * b))
	{
		rembdays =( n / (5 * a + 2 * b))*7;
	}
	n = n % (5 * a + 2 * b);


	
		while (cy1 < 5)
		{
			rembexces += a;
			cy1++;
			rembdays++;
			if(rembexces >= n)
			{
				printf("%lld", rembdays);
				return 0;
			}
		} 
		

		
		while (cy2 < 2)
		{
			rembexces += b;
			cy2++;
			rembdays++;
			if (rembexces >= n)
			{
				printf("%lld", rembdays);
				return 0;
			}
			
		} 
	

}