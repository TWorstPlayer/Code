#pragma once
#ifndef INOCULATION_HEADER
#define INOCULATION_HEADER

#define FLUSH while(getchar()!='\n')

#define NAMESIZE 20
#define TELSIZE 12
typedef struct {
	unsigned int year;
	unsigned int month;
	unsigned int day;
}Date;

typedef struct {
	char name[NAMESIZE];
	unsigned int age;
	char tel[TELSIZE];
	Date vacDate[2];
}VacInfo;


#endif