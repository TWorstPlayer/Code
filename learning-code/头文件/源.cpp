#include<stdio.h>
#include"powers.h"
#include "powers.c"
int main() {
	int b = 2;
	printf("%d\n", sqr(b));
	printf("%d\n", cube(b));
	printf("%d\n", quad(b));
	
}
