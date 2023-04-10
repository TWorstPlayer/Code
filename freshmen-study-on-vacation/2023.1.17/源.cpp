#include<stdio.h>

struct s
{
	int s;
	struct s* next;
};
int main()
{  

	struct s a = { 1,NULL };
	struct s* ab = &a;

	struct s b = { 2,ab };

		
}