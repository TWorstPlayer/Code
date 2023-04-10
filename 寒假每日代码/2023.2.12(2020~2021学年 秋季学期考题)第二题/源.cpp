#define _CRT_SECURE_NO_WARNINGS
#pragma warning(disable : 4996)
#pragma warning(disable : 6031)
#include <stdio.h>
#include <string.h>
#include <time.h>

unsigned char getChksum(unsigned char *p, int len)
{
	int i;
	unsigned char chksum = 0;

	/*
	your code for calculate chksum of p
	*/

	return chksum;
}


typedef struct tagcheckinData
{
    int studentNo;			//学号
    char nameStr[20];		//姓名
    time_t checkinTime;		//time_t格式的签到时间
    time_t checkoutTime;	//time_t格式的签退时间
    char subject[20];		//考试科目
	unsigned char chksum;	//第三题使用
}checkinData;

    
void partBubbleSort(checkinData* data, int start, int count)
{
	for (; start <= count; start++)
	{
		
		for (int cy1 = 1;  start + cy1<=count;cy1++)
		{
			if ((data + start)->studentNo > (data + start +cy1)->studentNo)
			{
				int a = (data + start)->studentNo;
				(data + start)->studentNo = (data + start + cy1)->studentNo;
				(data + start + cy1)->studentNo = a;

			}
		}
	}

}

int ReadDataFromFile(char *fname, checkinData data[])
{
	int iCount = 0;
	int iRet ;
	unsigned char *chksumold, newchksum;	//第三题目使用

	//打开fname文件
	FILE *fp = fopen(fname, "rb");

	//打开错误，提示并返回-1；
	if(fp== NULL)
	{
		printf("文件打开错误");
		perror("fopen");
		return -1;
	}

	//循环读取到结构体数组data[]
	while (fread(&data[iCount], sizeof(checkinData), 1, fp))
	{
		iCount++;
	}
	


	//关闭文件
	fclose(fp);

	//第三题使用，计算校验码	
	/*
	your code here
	*/	

	printf("从文件%s读到 %d 条记录\n\n", fname, iCount);


	//返回读到的记录（结构体）个数
	return iCount;
}

int WriteDataFromFile(char *fname, checkinData data[], int nCount)
{
	int i = 0;

	
	//打开fname文件
	FILE *fp = fopen(fname, "wb");
	
	//打开错误，提示并返回-1；
	if (fp == NULL)
	{
		perror("fopen");
		return -1;
	}

	//第三题使用，计算校验码	
	/*
	your code here
	*/
	

	//一次性写结构体数组data[]到文件
	
	fwrite(&data, sizeof(checkinData), nCount, fp);
	
	



	//关闭文件
	fclose(fp);

	printf("写入 %d 条记录到文件%s\n\n", nCount, fname);
	
	//返回读到的记录（结构体）个数
	return nCount;
}


void displayMenu()
{
	puts("********考试签到系统********");
	puts("1 学生签到");
	puts("2 学生签退");
	puts("3 部分排序");
	puts("4 显示全部信息");
	puts("5 显示未交卷学生");
	puts("6 显示已交卷学生");
	puts("7 退出");
	puts("***************************");
	puts("\n");

}

int search(int no, checkinData data[], int count)
{
	//根据学号查询
	/*
	your code here
	*/
	//查询到
	{
		return 1;
	}
	return -1;
}

int checkin(checkinData data[], int count)
{
	//输入checkin信息	
	printf("请输入你的学号\n");
	int id = 0;
	scanf("%d", &id);
	for (int cy1 = 0; cy1 < count; cy1++)
	{
		if (id == data[cy1].studentNo)
		{
			printf("当前学号已经签到\n");
			return count;
		}
	}
	printf("当前学号未签到\n");
	count;
	checkinData tmp = { 0 };
	tmp.studentNo = id;
	printf("请输入姓名\n");
	scanf("%s", tmp.nameStr);
	printf("请输入科目\n");
	scanf("%s", tmp.subject);
	tmp.checkoutTime = 0;
	tmp.checkinTime = time(NULL);
	data[count] = tmp;
	count++;




	

	return count;
}

int checkout(checkinData data[], int count)
{
	//输入checkout	                                                
	int checkout = 0;
	printf("请输入学号");
	scanf("%d", &checkout);

	int cy1 = 0;
	for (; cy1 < count; cy1++)
	{
		//查到了

		if (checkout == data[cy1].studentNo)
		{
			printf("当前学号已经签到\n");

			if (data[cy1].checkoutTime != 0)
			{
				puts("错误：该学生已经签退\n");
				return 0;
			}
			data[cy1].checkoutTime = time(NULL);
			return 0;
		}
	
	}

	
	//查询不到
		puts("错误：该学生未签到");
		return -1;
	
	


}


void displayARecord(checkinData *p)
{
	/*
	your code here
	*/
}

void displayall(checkinData data[], int count)
{
	for (int cy1 = 0; cy1 < count; cy1++)
	{
		printf("%d\n", data[cy1].studentNo);
		printf("%s\n", data[cy1].nameStr);
		printf("%s\n", ctime(&data[cy1].checkinTime));
		printf("%s\n", ctime(&data[cy1].checkoutTime));
		printf("%s\n", data[cy1].subject);
	}
	printf("\n");
	printf("\n");
	printf("\n");
}

void displayUnChkout(checkinData data[], int count)
{
	for (int cy1 = 0; cy1 < count; cy1++)
	{
		if (data[cy1].checkoutTime == 0)
		{
			printf("%s", data[cy1].nameStr);
		}
	}
}
 
void displayChkout(checkinData data[], int count)
{
	for (int cy1 = 0; cy1 < count; cy1++)
	{
		if (data[cy1].checkoutTime != 0)
		{
			printf("%s", data[cy1].nameStr);
		}
	}
}

int main()
{
	int key;
	int quit = 0;

	checkinData gData[100];
	int gCount = 0;

	int ret = gCount = ReadDataFromFile("checkin.dat", gData);
	if (ret != -1) 
		gCount = ret;

	while(1)
	{
		displayMenu();
		scanf("%d", &key);
		switch(key)
		{
		case 1: gCount = checkin(gData, gCount);
			break;
		case 2: checkout(gData, gCount);
			break;
		case 3: partBubbleSort(gData, 1, gCount-1);
			break;
		case 4: displayall(gData, gCount);
			break;
		case 5: displayUnChkout(gData, gCount);
			break;
		case 6: displayChkout(gData, gCount);
			break;
		case 7: quit = 1; 
			break;
		default: 
			break;
		}
		if (quit==1)
			break;
	}
	WriteDataFromFile("checkin.dat", gData, gCount);

	return 1;
}
