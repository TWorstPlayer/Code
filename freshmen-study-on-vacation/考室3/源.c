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
	char name[20];		//商品名称
	double price;		//商品售价
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

	//打开fname文件
	FILE* fp = fopen(fname, "rb");

	//打开错误，提示并返回-1；
	if (fp == NULL)
	{
		printf("文件打开错误");
		perror(fopen);
		return -1;

	}
	iCount = 0;
	//循环读取到结构体数组data[]
	while (fread(&data[iCount], sizeof(goodsData), 1, fp))
	{
		iCount++;
	}



	
	//关闭文件

	fclose(fp);

	printf("从文件%s读到 %d 条记录\n\n", fname, iCount);


	//返回读到的记录（结构体）个数
	return iCount;
}

int WriteDataFromFile(const char* fname, goodsData data[], int count) {
	//打开fname文件
	FILE* fp = fopen(fname, "wb");

	//打开错误，提示并返回-1；
	if (fp == NULL)
	{
		printf("文件打开错误");
		perror(fopen);
		return -1;

	}

	//一次性写结构体数组Data[]到文件
	

	fwrite(&data, sizeof(goodsData), count, fp);
	//关闭文件
	fclose(fp);

	printf("写入 %d 条记录到文件%s\n\n", count, fname);

	//返回写的记录（结构体）个数
	return count;
}


void displayMenu() {
	puts("********超市商品管理系统********");
	puts("1 删除商品");
	puts("2 冒泡排序");
	puts("3 显示全部商品");
	puts("0 退出");
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
	
		printf("删除失败，未找到商品\n");
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
	int choice = -1;  //记录选项
	int gCount = 0;   //记录商品数量

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
