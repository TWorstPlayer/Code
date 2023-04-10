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
    int studentNo;			//ѧ��
    char nameStr[20];		//����
    time_t checkinTime;		//time_t��ʽ��ǩ��ʱ��
    time_t checkoutTime;	//time_t��ʽ��ǩ��ʱ��
    char subject[20];		//���Կ�Ŀ
	unsigned char chksum;	//������ʹ��
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
	unsigned char *chksumold, newchksum;	//������Ŀʹ��

	//��fname�ļ�
	FILE *fp = fopen(fname, "rb");

	//�򿪴�����ʾ������-1��
	if(fp== NULL)
	{
		printf("�ļ��򿪴���");
		perror("fopen");
		return -1;
	}

	//ѭ����ȡ���ṹ������data[]
	while (fread(&data[iCount], sizeof(checkinData), 1, fp))
	{
		iCount++;
	}
	


	//�ر��ļ�
	fclose(fp);

	//������ʹ�ã�����У����	
	/*
	your code here
	*/	

	printf("���ļ�%s���� %d ����¼\n\n", fname, iCount);


	//���ض����ļ�¼���ṹ�壩����
	return iCount;
}

int WriteDataFromFile(char *fname, checkinData data[], int nCount)
{
	int i = 0;

	
	//��fname�ļ�
	FILE *fp = fopen(fname, "wb");
	
	//�򿪴�����ʾ������-1��
	if (fp == NULL)
	{
		perror("fopen");
		return -1;
	}

	//������ʹ�ã�����У����	
	/*
	your code here
	*/
	

	//һ����д�ṹ������data[]���ļ�
	
	fwrite(&data, sizeof(checkinData), nCount, fp);
	
	



	//�ر��ļ�
	fclose(fp);

	printf("д�� %d ����¼���ļ�%s\n\n", nCount, fname);
	
	//���ض����ļ�¼���ṹ�壩����
	return nCount;
}


void displayMenu()
{
	puts("********����ǩ��ϵͳ********");
	puts("1 ѧ��ǩ��");
	puts("2 ѧ��ǩ��");
	puts("3 ��������");
	puts("4 ��ʾȫ����Ϣ");
	puts("5 ��ʾδ����ѧ��");
	puts("6 ��ʾ�ѽ���ѧ��");
	puts("7 �˳�");
	puts("***************************");
	puts("\n");

}

int search(int no, checkinData data[], int count)
{
	//����ѧ�Ų�ѯ
	/*
	your code here
	*/
	//��ѯ��
	{
		return 1;
	}
	return -1;
}

int checkin(checkinData data[], int count)
{
	//����checkin��Ϣ	
	printf("���������ѧ��\n");
	int id = 0;
	scanf("%d", &id);
	for (int cy1 = 0; cy1 < count; cy1++)
	{
		if (id == data[cy1].studentNo)
		{
			printf("��ǰѧ���Ѿ�ǩ��\n");
			return count;
		}
	}
	printf("��ǰѧ��δǩ��\n");
	count;
	checkinData tmp = { 0 };
	tmp.studentNo = id;
	printf("����������\n");
	scanf("%s", tmp.nameStr);
	printf("�������Ŀ\n");
	scanf("%s", tmp.subject);
	tmp.checkoutTime = 0;
	tmp.checkinTime = time(NULL);
	data[count] = tmp;
	count++;




	

	return count;
}

int checkout(checkinData data[], int count)
{
	//����checkout	                                                
	int checkout = 0;
	printf("������ѧ��");
	scanf("%d", &checkout);

	int cy1 = 0;
	for (; cy1 < count; cy1++)
	{
		//�鵽��

		if (checkout == data[cy1].studentNo)
		{
			printf("��ǰѧ���Ѿ�ǩ��\n");

			if (data[cy1].checkoutTime != 0)
			{
				puts("���󣺸�ѧ���Ѿ�ǩ��\n");
				return 0;
			}
			data[cy1].checkoutTime = time(NULL);
			return 0;
		}
	
	}

	
	//��ѯ����
		puts("���󣺸�ѧ��δǩ��");
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
