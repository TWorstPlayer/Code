#include<stdio.h>
int main()

{
	int a, b, c,d;
	scanf_s("%d %d %d", &a, &b, &c);
	if (a <b)
	{
		d = b;
		b = a;
		a = d;
	}
	if (a < c)
	{
		d = c;
		c = a;
		a = d;

	}
	if (b < c)
	{
		d = b;
		b = c;
		c = d;
	}
	if (a > b + c)
	{
		printf("Not triangle\n");
		return 0;
	}
	int a1, b1, c1;
	a1 = a * a;
	b1 = b * b;
	c1 = c * c;
	if (a1 == b1 + c1)
	{
		printf("Right triangle\n");
	}
	else if (a1 < b1 + c1)
	{
		printf("Acute triangle\n");
	}
	else if (a1 > b1 + c1)
	{
		printf("Obtuse triangle\n");
	}
	if ((a == b&&a!=c) || (b == c&&b!=a))
	{
		printf("Isosceles triangle\n");
	}
	else if (a == b && b == c)
	{
		printf("Equilateral triangle\n");
	}

	
}