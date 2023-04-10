////#define _CRT_SECURE_NO_WARNINGS
////#pragma warning(disable : 6031)
////#pragma warning(disable : 4996)
////#include <stdlib.h>
////#include <time.h>
////#include <string.h>
////#include <windows.h>
////#include <math.h>
////#include <stdio.h>
////
////
////int main()
////{
////	int input = 0;
////	printf("请输入x（1-5）的值：");
////	while(1)
////	{
////		scanf("%d", &input);
////		if (input > 5 || input < 1)
////		{
////			printf("输入错误！请重新输入");
////			continue;
////
////		}
////		else
////		{
////			break;
////		}
////	} 
////	double output = 0;
////	double jiecheng = 1;
////	int a = input;
////
////	for (int cy1 = 0; cy1 < 15; cy1++)
////	{
////		jiecheng = jiecheng* (cy1+1);
////		output += (input/ jiecheng);
////		input *= a;
////
////	}
////	output += 1;
////
////
////	printf("e的%d次方为%f", a, output);
////}
//#include<stdio.h>
//#include<stdlib.h>
//#include<math.h>  //定义该数学函数库 因为要用到sqrt函数
//
//int main()
//{
//	double y;
//	int x, m;
//	for (y = 10; y >= -10; y--) {
//		//圆的半径为10
//		//计算y对应的列坐标m，2.03是屏幕纵横比调节系数
//		m = 3*sqrt(100 - y * y);	//因为屏幕的行距大于列距，不进行调节显示出来的将是椭圆
//		for (x = 1; x < 30 - m; x++)
//			printf(" ");  //图形左侧空白控制
//
//		printf("*"); //左半圆
//		
//		for (x=0; x <  2*m; x++)
//			printf(" ");//图形空心部分控制
//
//		printf("*\n");//圆的右侧
//	}
//}
//
//



#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#include <string.h>
#define _CRT_SECURE_NO_WARNINGS
#pragma warning(disable : 6031)
#pragma warning(disable : 4996)

//洗牌程序
void shuffle(char cards[][10], int n)
{
	char temp[10];
	int index;
	srand(time(NULL));
	for (int i = 0; i < n; i++) {
		index = rand() % 54;
		strcpy(temp, cards[i]);
		strcpy(cards[i], cards[index]);
		strcpy(cards[index], temp);
	}
}
//发牌程序
void printCard(char cards[][10], int n)
{
	printf("第一个人的牌是：\n");
	for (int i = 0; i < 17; i++) {
		printf("%10s\t", cards[i]);
		if (i % 5 == 4)
			printf("\n");
	}

	printf("\n第二个人的牌是：\n");
	for (int i = 17; i < 34; i++) {
		printf("%10s\t", cards[i]);
		if ((i - 17) % 5 == 4)
			printf("\n");
	}
	printf("\n第三个人的牌是：\n");
	for (int i = 34; i < 51; i++) {
		printf("%10s\t", cards[i]);
		if ((i - 34) % 5 == 4)
			printf("\n");
	}
	printf("\n底牌是：\n");

	for (int i = 51; i < 54; i++) {
		printf("%10s\t", cards[i]);
	}

}
void main()
{
	char* suit[4] = { "黑桃","红桃","梅花","方片" };
	char* face[13] = { "A","2","3","4","5",
					"6","7","8","9","10",
					"J","Q","K" };
	char cards[54][10];

	for (int i = 0; i < 52; i++) {
		strcpy(cards[i], suit[i / 13]);
		strcpy(cards[i][4], face[i % 13]);
	}
	strcpy(cards[52], "大王");
	strcpy(cards[53], "小王");

	shuffle(cards, 54);
	printCard(cards, 54);
}




