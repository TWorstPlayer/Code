#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
#include<math.h>
#include<stdlib.h>
#include<string.h>
using namespace std;

int arr[3];

void display(int arr1[]) {
	arr1[0] = 0;
	arr1[1] = 1;
	arr1[2] = 2;
	return;
}

int main() {

	for (int i = 0; i < 3; i++)printf("%d ", arr[i]);
	display(arr);
	printf("\n");
	for (int i = 0; i < 3; i++)printf("%d ", arr[i]);
}