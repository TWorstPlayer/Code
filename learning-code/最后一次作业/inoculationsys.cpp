#include <stdio.h>
#include "inoculationsys.h"
#include "fileoperation.h"
#include <stdlib.h>
#include <time.h>
#include <string.h>
#include <windows.h>
#include <math.h>

#define SIZE 10

void init(VacInfo m[], int size, int* pcount);

VacInfo InputInfo();

int Insert(VacInfo m[], int* pcount);
int Dele(VacInfo m[], int* pcount);
int SearchbyName(VacInfo m[], int count);
Date GetDate();
void PrintAll(const VacInfo m[], const int count);
void SendMsg(const VacInfo m[], const int count);
int DateDiff(Date d1, Date d2);
void genetel(char* ptel);

Date td;


int main()
{
	VacInfo table[SIZE];
	memset(table, 0, SIZE * sizeof(VacInfo));
	int count = 0;
	td.year = 2022;
	td.month = 1;
	td.day = 3;

	srand(time(NULL));

	while (1)
	{	
		system("CLS");
		puts("\n===============welcome to inoculation system===============\n");
		puts("1.initialize\n2.Insert\n3.Delete\n4.SearchbyName\n5.Send Message\n6.PrintALL\n7.WritetoFile\n8.Exit\n");
		printf("select a service:");
		int ans;
		scanf("%d", &ans);
		switch (ans)
		{
		case 1:
			init(table, SIZE, &count);
			system("Pause");
			break;
		case 2:
			Insert(table,&count);
			system("Pause");
			break;
		case 3:
			Dele(table, &count);
			system("Pause");
			break;
		case 4:
			SearchbyName(table,count);
			system("Pause");
			break;
		case 5:
			SendMsg(table, count);
			system("Pause");
			break;
		case 6:
			PrintAll(table, count);
			system("Pause");
			break;
		case 7:
			inosyswt(table, count);
			system("Pause");
			break;
		case 8:
			return 1;
		}
	}
	return 0;
}

void init(VacInfo m[], int size,int *pcount)
{
	
	printf("%d records read completed!\n", inosysrd(m, SIZE));
}

Date GetDate()
{
	Date dt;
	int y, m, d;
	printf("Please input Date:yyyy/mm/dd:");
	scanf("%u/%u/%u", &y, &m, &d);
	dt.year = y;
	dt.month = m;
	dt.day = d;

	return dt;
}
 
VacInfo InputInfo()
{
	VacInfo v;
	printf("please input name:");
	//fgets(v->age, NAMESIZE, stdin);
	scanf("%19s", v.name);
	FLUSH;

	printf("please input age:");
	do {
		scanf("%u", &v.age);
	} while (v.age < 0 || v.age > 120);
	FLUSH;

	genetel(v.tel);

	v.vacDate[0] = GetDate();
	Date temp;
	do {
		printf("The second dose must be 24 days apart from the first dose).\n");
		temp = GetDate();
		if (temp.year == 0)
			break;
	} while (DateDiff(temp, v.vacDate[0]) < 24);

	v.vacDate[1] = temp;
	FLUSH;

	return v;

}
void genetel(char* ptel)
{
	char str[3][4] = { "180","130","158" };
	int i = rand() % 3;
	strcpy(ptel, str[i]);

	for (int j = 3; j < TELSIZE - 1; j++)
		*(ptel + j) = rand() % 10 + '0';

	*(ptel + TELSIZE - 1) = '\0';

}


int Insert(VacInfo m[], int* pcount)
{
	if (*pcount == SIZE - 1)
		return -1;

	m[*pcount] = InputInfo();

	(*pcount)++;
	return 0;
}

int Dele(VacInfo m[],int *pcount)
{
	int i = SearchbyName(m, *pcount);
	if (i != -1)
	{
		(*pcount)--;
		m[i] = m[*pcount];
		return 0;
	}
	
	printf("Delete record failed!\n");
	return -1;
}





int SearchbyName(VacInfo m[], int count)
{
	printf("Please input your name:");
	char name[NAMESIZE];

	scanf("%19s", name);

	for (int i = 0; i < count; i++)
	{
		if (strcmp(m[i].name, name) == 0)
		{
			printf("\nName :   %s    Age:   %d      Tel  %s    \nFirst Dote%d/%d/%d    Second Dote%d/%d/%d\n", m[i].name, m[i].age, m[i].tel, m[i].vacDate[0].year, m[i].vacDate[0].month, m[i].vacDate[0].day, m[i].vacDate[1].year, m[i].vacDate[1].month, m[i].vacDate[1].day);

			return i;
		}
	}
	printf("Name %s not found!\n", name);
	return -1;
}

void PrintAll(const VacInfo m[], const int count)
{   
	int cy1 = 0;
	
	for (; cy1 < 5; m++)
	{
		printf("Name :   %s    Age:   %d      Tel  %s    \nFirst Dote%d/%d/%d    Second Dote%d/%d/%d\n", (m)->name, (m)->age, (m)->tel, (m)->vacDate[0].year, (m)->vacDate[0].month, (m)->vacDate[0].day, (m)->vacDate[1].year, (m )->vacDate[1].month, (m)->vacDate[1].day);
		printf("----------------------------------\n");
		cy1++;
	}
	
}



void SendMsg(const VacInfo m[], const int count)
{
	printf("The following people should take the first dose:\n");
	for (int i = 0; i < count; i++)
	{
		if (!m[i].vacDate[0].year)
			printf("\nName :   %s    Age:   %d      Tel  %s    \nFirst Dote%d/%d/%d    Second Dote%d/%d/%d\n", m[i].name, m[i].age, m[i].tel, m[i].vacDate[0].year, m[i].vacDate[0].month, m[i].vacDate[0].day, m[i].vacDate[1].year, m[i].vacDate[1].month, m[i].vacDate[1].day);


	}
	printf("The following people should take the second dose:\n");
	for (int i = 0; i < count; i++)
	{
		if (m[i].vacDate[0].year && !m[i].vacDate[1].year)
		{
			int days = DateDiff(td, m[i].vacDate[0]);
			if (days > 24)
				printf("\nName :   %s    Age:   %d      Tel  %s    \nFirst Dote%d/%d/%d    Second Dote%d/%d/%d\n", m[i].name, m[i].age, m[i].tel, m[i].vacDate[0].year, m[i].vacDate[0].month, m[i].vacDate[0].day, m[i].vacDate[1].year, m[i].vacDate[1].month, m[i].vacDate[1].day);

		}
	}
}

int DateDiff(Date d1, Date d2)
{
	int first = ((d1.year - 1000) * 12 + (d1.month - 1)) * 30 + d1.day;
	int second = ((d2.year - 1000) * 12 + (d2.month - 1)) * 30 + d2.day;
	return first - second;
}
