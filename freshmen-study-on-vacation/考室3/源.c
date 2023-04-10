#define _CRT_SECURE_NO_WARNINGS
#pragma warning(disable : 6031)
#pragma warning(disable : 4996)
#include <stdlib.h>
#include <time.h>
#include <string.h>
#include <windows.h>
#include <math.h>
#include <stdio.h>

typedef struct tagGoodsData {
	char name[20];		//��Ʒ����
	double price;		//��Ʒ�ۼ�
} goodsData;

void bubbleSort(goodsData data[], int count) {
	
	for (int cy1 = 0; cy1 < count; cy1++)
	{
		for (int cy2 = 0; cy2 +1< count - cy1; cy2++)
		{
			if (data[cy2].price > data[cy2 + 1].price)
			{
				double chance = 0;
				chance = data[cy2].price;
				data[cy2].price = data[cy2 + 1].price;
				data[cy2 + 1].price = chance;
			}
		}
	}
}

int ReadDataFromFile(const char* fname, goodsData data[]) {
	int iCount = -1;

	//��fname�ļ�
	FILE* fp = fopen(fname, "rb");

	//�򿪴�����ʾ������-1��
	if (fp == NULL)
	{
		printf("�ļ��򿪴���");
		perror(fopen);
		return -1;

	}
	iCount = 0;
	//ѭ����ȡ���ṹ������data[]
	while (fread(&data[iCount], sizeof(goodsData), 1, fp))
	{
		iCount++;
	}



	
	//�ر��ļ�

	fclose(fp);

	printf("���ļ�%s���� %d ����¼\n\n", fname, iCount);


	//���ض����ļ�¼���ṹ�壩����
	return iCount;
}

int WriteDataFromFile(const char* fname, goodsData data[], int count) {
	//��fname�ļ�
	FILE* fp = fopen(fname, "wb");

	//�򿪴�����ʾ������-1��
	if (fp == NULL)
	{
		printf("�ļ��򿪴���");
		perror(fopen);
		return -1;

	}

	//һ����д�ṹ������Data[]���ļ�
	

	fwrite(&data, sizeof(goodsData), count, fp);
	//�ر��ļ�
	fclose(fp);

	printf("д�� %d ����¼���ļ�%s\n\n", count, fname);

	//����д�ļ�¼���ṹ�壩����
	return count;
}


void displayMenu() {
	puts("********������Ʒ����ϵͳ********");
	puts("1 ɾ����Ʒ");
	puts("2 ð������");
	puts("3 ��ʾȫ����Ʒ");
	puts("0 �˳�");
	puts("********************************");
	puts("\n");

}

int deleteGoods(goodsData data[], int count) {

	char name[20];
	scanf("%s", name);
	for (int cy1 = 0; cy1++; cy1 < count)
	{
		if (strcmp(name, data[cy1].name) == 0)
		{
			count--;
			for ( ;cy1 + 1 < 100;cy1++)
			{
				
				strcpy(data[cy1].name, data[cy1+1].name);
				data[cy1].price = data[cy1 + 1].price;
				
			}
			return count;
		}
		
	}
	
		printf("ɾ��ʧ�ܣ�δ�ҵ���Ʒ\n");
		return -1;
	

	return count;
}

void displayall(goodsData data[], int count) {
	
	for (int cy1 = 0; cy1 < count; cy1++)
	{
		printf("%s\n", data[cy1].name);
		printf("%lf\n", data[cy1].price);
	}
}
int main() {
	int choice = -1;  //��¼ѡ��
	int gCount = 0;   //��¼��Ʒ����

	goodsData gData[100];
	gCount = ReadDataFromFile("goods.dat", gData);

	while (choice != 0) {
		displayMenu();
		scanf("%d", &choice);
		switch (choice) {
		case 1:
			gCount = deleteGoods(gData, gCount);
			break;
		case 2:
			bubbleSort(gData, gCount);
			break;
		case 3:
			displayall(gData, gCount);
			break;
		}
	}
	WriteDataFromFile("goods.dat", gData, gCount);

	return 0;
}
