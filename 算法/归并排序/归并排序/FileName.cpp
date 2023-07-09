#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
#include<math.h>
#include<stdlib.h>
#include<string.h>
using namespace std;

const int m = 1e6 + 10;
int arr1[m];
int storage[m];


void merge_sort(int arr[], int l, int r) {
	if (l >= r)return;
	int mid = l + r >> 1;

	merge_sort(arr, l, mid);
	merge_sort(arr, mid + 1, r);
	int i = l;
	int j = mid + 1;
	int k = 0;

	while (i <= mid && j <= r) {
		if (arr[i] <= arr[j])storage[k++] = arr[i++];
		else storage[k++] = arr[j++];
	}
	while (i <= mid)storage[k++] = arr[i++];
	while (j <= r)storage[k++] = arr[j++];

	//下面这一段很重要，debug了半天这一段
	for (int i = l, j = 0; i <= r; i++, j++)arr[i] = storage[j];
	/*printf("q:   \n");
	for (int i = 0; i < 5; i++)printf("%d ", arr[i]);
	
	printf("\n"); 
	printf("tmp:  \n"); 
	for (int i = 0; i < 5; i++)printf("%d ", storage[i]);
	printf("\nr:%d  l:%d", r,l);
	printf("\n\n");*/
}


int main() {
	int n = 0;
	scanf("%d", &n);
	for (int i = 0; i < n; i++)scanf("%d", &arr1[i]);
	merge_sort(arr1, 0, n - 1);
	for (int i = 0; i < n; i++)printf("%d ", storage[i]);
	return 0;

}
