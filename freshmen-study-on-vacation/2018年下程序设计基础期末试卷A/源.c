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
////	printf("������x��1-5����ֵ��");
////	while(1)
////	{
////		scanf("%d", &input);
////		if (input > 5 || input < 1)
////		{
////			printf("�����������������");
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
////	printf("e��%d�η�Ϊ%f", a, output);
////}
//#include<stdio.h>
//#include<stdlib.h>
//#include<math.h>  //�������ѧ������ ��ΪҪ�õ�sqrt����
//
//int main()
//{
//	double y;
//	int x, m;
//	for (y = 10; y >= -10; y--) {
//		//Բ�İ뾶Ϊ10
//		//����y��Ӧ��������m��2.03����Ļ�ݺ�ȵ���ϵ��
//		m = 3*sqrt(100 - y * y);	//��Ϊ��Ļ���о�����о࣬�����е�����ʾ�����Ľ�����Բ
//		for (x = 1; x < 30 - m; x++)
//			printf(" ");  //ͼ�����հ׿���
//
//		printf("*"); //���Բ
//		
//		for (x=0; x <  2*m; x++)
//			printf(" ");//ͼ�ο��Ĳ��ֿ���
//
//		printf("*\n");//Բ���Ҳ�
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

//ϴ�Ƴ���
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
//���Ƴ���
void printCard(char cards[][10], int n)
{
	printf("��һ���˵����ǣ�\n");
	for (int i = 0; i < 17; i++) {
		printf("%10s\t", cards[i]);
		if (i % 5 == 4)
			printf("\n");
	}

	printf("\n�ڶ����˵����ǣ�\n");
	for (int i = 17; i < 34; i++) {
		printf("%10s\t", cards[i]);
		if ((i - 17) % 5 == 4)
			printf("\n");
	}
	printf("\n�������˵����ǣ�\n");
	for (int i = 34; i < 51; i++) {
		printf("%10s\t", cards[i]);
		if ((i - 34) % 5 == 4)
			printf("\n");
	}
	printf("\n�����ǣ�\n");

	for (int i = 51; i < 54; i++) {
		printf("%10s\t", cards[i]);
	}

}
void main()
{
	char* suit[4] = { "����","����","÷��","��Ƭ" };
	char* face[13] = { "A","2","3","4","5",
					"6","7","8","9","10",
					"J","Q","K" };
	char cards[54][10];

	for (int i = 0; i < 52; i++) {
		strcpy(cards[i], suit[i / 13]);
		strcpy(cards[i][4], face[i % 13]);
	}
	strcpy(cards[52], "����");
	strcpy(cards[53], "С��");

	shuffle(cards, 54);
	printCard(cards, 54);
}




