#include<stdio.h>
int main()
{
	int a, b, c, d;
	scanf_s("%d-%d-%d-%d", &a, &b, &c, &d);//读入数据

	//下面就要取出每一位
	int a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, t;
	a1 = a;

	a2 = b / 100;
	t = b % 100;
	a3 = t / 10;
	t = t % 10;
	a4 = t;
	//printf("%d %d %d", a2, a3, a4);

	a5 = c / 10000;
	t = c % 10000;//2162
	a6 = t / 1000;
	t = t % 1000;//162
	a7 = t / 100;
	t = t % 100;//62
	a8 = t / 10;
	t = t % 10;
	a9 = t;
	//printf(" %d %d %d %d %d", a5, a6,a7,a8,a9);
	
	
	//以上为取数
	//printf(" %d %d %d %d %d %d %d %d %d %d", a1, a2, a3, a4, a5, a6, a7, a8, a9, a10);

	int final;
	final = a1 * 1 + a2 * 2 + a3 * 3 + a4 * 4 + a5 * 5 + a6 * 6 + a7 * 7 + a8 * 8 + a9 * 9;
	//printf("%d", final);
	final = final % 11;

	if (final == d)
	{
		printf("Right");
	}
	else
	{
		printf("%d-%d-%d-%d", a, b, c, final);
	}





	
}