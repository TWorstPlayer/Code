#include<stdio.h>

void lowerTOupper(char* input, char* output)
{
	char a[1000];
	input = a;
	output = a;


	gets_s(a);
	int cy1=1;
	if (input[0] > 90)
	{
		input[0]=input[0] - 32;
    }
	do
	{
		if (input[cy1] == ' '&& input[cy1 + 1] > 90)
		{
			
				input[cy1 + 1] = input[cy1 + 1] - 32;
			
		}
		
		cy1++;
	} while (input[cy1] != '\0');
	printf("%s", input);


}
int main() 
{
	char s[1000];
	char t[1000];
	char* i;
	char* o;
	i = s;
	o = t;
	printf("Со¶­-2022141461040\n");
	printf("please input your string:\n");
	lowerTOupper(i, o);
}

